package day09_IfStatements;

public class MaximumNumber {
    public static void main(String[] args) {

        /*
 1. Maximum number between two different numbers
  */

        int n1 = 10;
        int n2 = 20;

        boolean n1max = n1 >= n2;
        boolean n2min = n2 >= n1;
        boolean n3equal = n1 == n2;

        if (n1>n2){
            System.out.println(n1 + " is the maximum number");

        }else if (n2>n1){
            System.out.println(n2 + " is the maximum number");

        }else{
            System.out.println(n1==n2);
        }










        System.out.println("------------------------------------------------------");




/*
2. Minimum number between two different numbers

 */


        int n3 = 70;
        int n4 = 100;

        boolean n3min = n3 > n4;
        boolean n4min = n4 > n3;
        boolean equal = n4 == n3;

        if (n3>n4){
            System.out.println(n4 + "is the minimum number ");
        }else if (n4>n3){
            System.out.println(n3 + "is the minimum number");
        }else {
            System.out.println(equal);
        }







/*
 3. Write a program that can check if the person is eligible to buy alcohol
        4. Write a program that can check if the person is eligible to vote


 */







    }
            }