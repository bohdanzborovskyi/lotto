package lambda;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import lambda.service.AmazonSQSQueue;
import lambda.service.FileChecker;
import lambda.service.FileTransformerToDTO;

import java.io.IOException;
import java.io.InputStream;

public class BucketHandler implements RequestHandler<S3Event, String>
{
    public final String AWS_REGION = "eu-central-1";
    public final String S3_ENDPOINT = "http://s3.localhost:4566";
    public final AmazonSQSQueue amazonSQSQueue = new AmazonSQSQueue();

    @Override
    public String handleRequest(S3Event s3Event, Context context)
    {
        String bucket = s3Event.getRecords().get(0).getS3().getBucket().getName();
        String key = s3Event.getRecords().get(0).getS3().getObject().getKey();
        S3Object obj = prepareS3().getObject(new GetObjectRequest(bucket,key));
        try (InputStream stream = obj.getObjectContent())
        {
            stream.transferTo(System.out);
            if(FileChecker.checkFile(stream)) {
                amazonSQSQueue.sendMessage(FileTransformerToDTO.createBetDTO(stream));
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        return obj.getObjectMetadata().getContentType();
    }

    private AmazonS3 prepareS3()
    {
        BasicAWSCredentials credentials = new BasicAWSCredentials("AAA", "BBB");

        AwsClientBuilder.EndpointConfiguration config =
                new AwsClientBuilder.EndpointConfiguration(S3_ENDPOINT, AWS_REGION);

        AmazonS3ClientBuilder builder = AmazonS3ClientBuilder.standard();
        builder.withEndpointConfiguration(config);
        builder.withPathStyleAccessEnabled(true);
        builder.withCredentials(new AWSStaticCredentialsProvider(credentials));
        return builder.build();
    }
}
