package lambda;

import lambda.service.FileChecker;

import java.io.*;

public class Main
{

    public static void main(String []args)
    {
        File f = new File("C:\\Users\\baga1\\kupon.txt");
        try(InputStream stream = new FileInputStream(f))
        {
            FileChecker.checkFile(stream);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
