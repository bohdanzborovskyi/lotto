package lambda.service;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.CreateQueueResult;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import lambda.dto.BetDto;

import java.util.List;
import java.util.stream.Collectors;

public class AmazonSQSQueue
{
    //create sqs queue
    AmazonSQS sqs = null;
    String queueUrl = null;

    public AmazonSQSQueue()
    {
        super();
        AmazonSQSQueue amazonSQSQueue = new AmazonSQSQueue();
        amazonSQSQueue.sqs = AmazonSQSClientBuilder.defaultClient();
        CreateQueueResult queueResult = sqs.createQueue("lotto.bet");
        amazonSQSQueue.queueUrl = sqs.getQueueUrl("lotto.bet").getQueueUrl();
    }

    public void sendMessage(BetDto message)
    {
        SendMessageRequest messageRequest = new SendMessageRequest()
                .withQueueUrl(queueUrl)
                .withMessageBody(message.toString())
                .withDelaySeconds(5);
        sqs.sendMessage(messageRequest);
    }

    public List<String> receiveMessages()
    {
        return sqs.receiveMessage(queueUrl).getMessages().stream().map(message -> message.getBody()).collect(Collectors.toList());
    }


}
