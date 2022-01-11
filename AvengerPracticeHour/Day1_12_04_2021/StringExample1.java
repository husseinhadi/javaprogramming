package Day1_12_04_2021;

public class StringExample1 {
    public static void main(String[] args) {

      String str ="Cydeo";
      int lastIdexOfChar =str.length()-1;
        int lastSecondOfChar =str.length()-5;

       String result=""+ str.charAt(lastSecondOfChar)+str.charAt(lastIdexOfChar);
        //System.out.println(result+result+result);
        System.out.println("result= "+result.repeat(3));

/*
String str="CYDEO";
        int lastsecondOfChar = str.length() -2;
        String chars = str.substring(lastsecondOfChar);
        System.out.println(chars.repeat(3));

2

 */




        /**
         *  Create a method print a new string made of 3 copies of the last 2 chars of the original string.
         * The string length will be at least 2.
         */
    }
}
