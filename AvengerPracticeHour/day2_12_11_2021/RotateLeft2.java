package day2_12_11_2021;

import java.util.Scanner;

public class RotateLeft2 {
    public static void main(String[] args) {


        /*
                Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
                The string length will be at least 2.

                input :"Hello" -> "lloHe"
                input :"java" → "vaja"
                input :"Hi" → "Hi"
         */




        Scanner scan=new Scanner(System.in);
        System.out.println("please enter ");
        String word = scan.nextLine();

      //  String word="hello";
        String temp=word.substring(2)+word.substring(0,2);
        System.out.println("temp = " + temp);

        System.out.println("========================================");

        String temp2="";


        for (int i = 2; i < word.length(); i++) {
            temp2+=word.charAt(i);

        }


        for (int i = 0; i < 2; i++) {
            temp2+=word.charAt(i);


        }

        System.out.println(temp2);


        scan.close();




    }
}