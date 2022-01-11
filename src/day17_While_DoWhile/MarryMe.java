package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class MarryMe {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Will you marry me?");
        String answer =scan.nextLine();


        while (  !(answer.equals("yes") || answer.equals("no"))  ){
            System.err.println("Invalid answer");
            System.out.println("Will you marry me?");
            answer=scan.nextLine().toLowerCase();
        }

        if (answer.equals("yes")){
            System.out.println("Congrats.");
        }else {
            System.out.println("Goodbye");
        }






        /*
         Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer,
     please re-enter" and repeat it until the user enters either yes or no

9

You do not have permission to send messages in this channel.

         */
    }
}
