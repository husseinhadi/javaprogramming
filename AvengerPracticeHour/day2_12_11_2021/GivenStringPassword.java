package day2_12_11_2021;

public class GivenStringPassword {
    public static void main(String[] args) {


String password="cydeo";
char encrypWithChar ='x';
String encryptedPassword="";

for (int i=0; i<password.length(); i++){
    encryptedPassword+=""+ password.charAt(i)+encrypWithChar;
   // encryptedPassword=encryptedPassword+password.charAt(i)+encrypWithChar;
}
        System.out.println(encryptedPassword);




        /*

     *  5.
     *                 Given a string password. Encrypt with "x" a given password
     *                 and print.
     *                 (do with for loop)
     *                 password: cydeo
     *                 encrypt with char :x
     *                 output:cxyxdxexox
     */

    }
}
