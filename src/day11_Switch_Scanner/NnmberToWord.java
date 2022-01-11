package day11_Switch_Scanner;

public class NnmberToWord {

    public static void main(String[] args) {

        int month = 2;
        String nameOfMonth = "";

        switch (month) {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            default:
                System.out.println("invalid");
        }
    }
}

