package day24CustomMethods_Return;

public class UniqueCharacter {
    public static void main(String[] args) {



    }



   //1. create a method that can display the unique characters of a string


    public static void uniqueChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                String each = "" + str.charAt(j);
                if (ch.equalsIgnoreCase(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(ch);
            }

        }
        System.out.println("=======================================");
    }

//2. create a method that can display the unique elements of array

    public static void uniqueElement(String[] str) {
        for (int i = 0; i < str.length; i++) {
            int count = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[i] == str[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("unique element is: " + str[i]);
            }
        }


    }




}
