package Day1_12_04_2021;

public class StringPractice2 {
    public static void main(String[] args) {
        String str ="Selcuk";
        /*

        String svar =str.substring(1, str.length()-1);
        System.out.println(svar);
         */


        char fristChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);
        str=str.replace(fristChar, ' ');
        str=str.replace(lastChar,' ');
        System.out.println(str.trim());




    }
}
