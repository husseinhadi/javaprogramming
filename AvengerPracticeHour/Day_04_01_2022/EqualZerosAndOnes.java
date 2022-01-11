package Day_04_01_2022;

public class EqualZerosAndOnes {

    public static void main(String[] args) {
        int [] array={1,1,1,0,1,0};
        int countZeroz=0;
        int countOnes=0;
        int moves;
        for (int i: array) {
            if (i==1){
                countOnes++;
            }else {
                countZeroz++;
            }
        }
        System.out.println("countOnes = " + countOnes);
        System.out.println("countZeroz = " + countZeroz);

        if (countOnes<countZeroz){
            moves=(countZeroz-countOnes)/2;
        }else {
            moves=(countOnes-countZeroz)/2;
        }
        System.out.println("moves = " + moves);
    }
}
