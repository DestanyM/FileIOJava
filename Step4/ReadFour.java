package Step4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFour {
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args) {

        try {
            Scanner fileIn = new Scanner(new File("input4.txt"));
            int sum = 0;
            while (fileIn.hasNext()) {
                String lineIn = fileIn.nextLine();
                int info = Integer.parseInt(lineIn);
                sum += info;

                System.out.println(sum);
            }
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}

