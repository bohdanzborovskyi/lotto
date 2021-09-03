package lambda.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileChecker
{

    public static boolean checkFile(InputStream stream)
    {
            Scanner scan = new Scanner(stream);
            boolean checker = true;
            while(scan.hasNextLine())
            {
                if(!checker)
                    break;
                String currentLine = scan.nextLine();
                if(Character.isDigit(currentLine.charAt(0)))
                {
                    HashSet<Integer> numbers = (HashSet<Integer>) Arrays.stream(currentLine.split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toSet());
                    if(numbers.stream().filter(n-> (n>0 && n<50)).count()!=6)
                        checker = false;
                }
            }
            if(!checker)
                System.out.print("File has wrong numbers!");
            return checker;
    }
}
