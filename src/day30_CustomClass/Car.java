package day30_CustomClass;

import java.awt.*;

public class Car {


    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    public void setInfo(String carBrand, String carModel, String carColor, double carPrice, int carYear) {
        brand = carBrand;
        model = carModel;
        color = carColor;
        price = carPrice;
        year = carYear;
    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';


    }


    public void drive(){
        System.out.println("Driving "+ brand +" "+ model);
    }



}





    /*
     Attributes:
        brand, model, color, year, price

    Actions:
        drive(), start(), stop(), toString(), setInfo()




     */

