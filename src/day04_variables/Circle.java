package day04_variables;

public class Circle {

    public static void main(String[] args) {
        // pI, radius, diameter, area, perimeter


        double radius = 5.5;

        double pI = 3.14;
        double diameter = radius * 2; // finds the diameter by multiplying the radius to 2  10 * 2
        double area = radius * radius * pI; // finds the area of the circle 10 * 10 * 3.14
        double perimeter = diameter * pI; //  finds the perimeter of the circle 10 * 2 * 3.14

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);





        }
    }



    /*
    Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
                    Hints:  PI = 3.14
                            area = radius * radius * PI
                            Perimeter = 2 * diameter * PI

     */

