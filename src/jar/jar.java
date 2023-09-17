package jar;

import java.util.Scanner;

public class jar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //vars
        int quarter = 25;
        int dimes = 10;
        int nickels = 5;
        int pennies = 1;
        int number_of_quarters;
        int number_of_dimes;
        int number_of_nickels;
        int number_of_pennies;
        int total_in_jar;

        //input
        System.out.println("Enter in the number of Quarters in the Jar:");
        number_of_quarters = scan.nextInt();
        System.out.println("Enter in the number of Dimes in the Jar:");
        number_of_dimes = scan.nextInt();
        System.out.println("Enter in the number of Nickels in the Jar:");
        number_of_nickels = scan.nextInt();
        System.out.println("Enter in the number of Pennies in the Jar:");
        number_of_pennies = scan.nextInt();

        //calc
        total_in_jar =(number_of_quarters * quarter) + (number_of_dimes * dimes) + (number_of_nickels * nickels) + (number_of_pennies * pennies);

        //output
        System.out.println("The jar contains "+ total_in_jar +" cents");
    }
}
