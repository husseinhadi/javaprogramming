package day20_Arrays;

import java.util.Arrays;

public class ArrayNumber {
    public static void main(String[] args) {

        int[] number = new int [100];


        for (int i =0 ; i < number.length; i++) {
            number[i]=i+1;
            
        }

        System.out.println(Arrays.toString(number));
        

        /*
create an array that has the numbers 1 to 100

         */

        System.out.println("------------------------------------");


       int [] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            number[i]=numbers.length-i;

        }

        System.out.println(Arrays.toString(number));

        /*

        create an array that has the numbers 100 to 1
         */






    }
}
