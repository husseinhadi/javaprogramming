package practice_12_22_2021;

public class Unit_2_Exam {
    public static void main(String[] args) {

String resultContinue="";
String resultAfterContinue="";

// 1 ,2 ,3 ,4 ,5, 6, 7, 8, 9, 10
// 0 ,1, 2 ,3 ,4, 5, 6, 7, 8, 9

        for (int i = 0; i <10 ; i++) {
            resultContinue+=i+"";




            if ( (i%2==0)){
                continue;
            }else {
                resultAfterContinue+=i+"";

            }

            System.out.println("resultAfterContinue = " + resultAfterContinue);
          //  System.out.println("resultContinue = " + resultContinue);
        }








        /*
        String resultContinue="";
String resultAfterContinue="";


        for (int i =0; i<10;i++){
            resultContinue+=i+"";

            if (i%2==0){
                continue;
            }else {
                resultAfterContinue+=i+"";
            }
            System.out.println("resultAfterContinue = " + resultAfterContinue);
            System.out.println("resultContinue = " + resultContinue);
         */


        }
    }

