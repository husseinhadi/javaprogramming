package day2_12_11_2021;

public class StringWithoutXFirstAndLast {
    public static void main(String[] args) {
        String word="Hellox";
        String temp="";
        //0123
        // input:  "xHix" → Hi
        //012
        //   input :"xHi" → Hi
        //0123
        //   input :"Hxix" → Hxi
        if (word.charAt(0)=='x'&&word.charAt(word.length()-1)=='x'){
            for (int i = 1; i <word.length() -1; i++) {
                temp+=word.charAt(i);
            }
        }else if (word.charAt(0)=='x'){
            for (int i = 1; i <word.length() ; i++) {
                temp+=word.charAt(i);
            }
        }
        //0123
        //   input :"Hxix" → Hxi
        else if (word.charAt(word.length()-1)=='x'){
            //2   //3
            for (int i = 0; i <word.length() -1; i++) {
                temp+=word.charAt(i);
            }
        }

        System.out.println("temp = " + temp);
    }
}