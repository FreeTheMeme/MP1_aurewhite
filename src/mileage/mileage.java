package mileage;

import java.util.Scanner;

public class mileage {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //vars
        float miles;
        float gallons_of_gas;
        float mileage;

        //input
        System.out.println("Mileage Calculator V1");
        System.out.println("enter distance (in miles):");
        miles = scan.nextFloat();
        System.out.println("enter gallons of gas:");
        gallons_of_gas = scan.nextFloat();

        //calc
        mileage = miles/gallons_of_gas;

        //output
        System.out.println("Your Mileage is: " + mileage + " per gallon");
    }
}
