package make_change;

import java.util.Scanner;

public class make_change {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //vars
        int price_dollar;
        int price_cent;
        int price_total_cents;

        int received_dollars;
        int received_cents;
        int received_total_cents;

        int return_total;
        int dollar_returned;

        int quarter_returned;
        int dime_returned;
        int nickel_returned;
        int pennies_returned;

        int remaining_change;
        int remaining_after_quarters;
        int remaining_after_dimes;

        //input
        System.out.println("Enter price in dollars");
        price_dollar = scan.nextInt();
        System.out.println("Enter the remainder in cents");
        price_cent = scan.nextInt();
        System.out.println("Enter money received in dollars");
        received_dollars = scan.nextInt();
        System.out.println("Enter the remainder in cents");
        received_cents = scan.nextInt();

        //calc

        //converting dollars to cents and adding the cents
        price_total_cents = (price_dollar * 100) + price_cent;
        received_total_cents = (received_dollars * 100) + received_cents;

        //getting the difference
        return_total = received_total_cents - price_total_cents;

        //amt to return
        dollar_returned = return_total /100;
        remaining_change = return_total %100;

        quarter_returned = remaining_change /25;
        remaining_after_quarters = remaining_change %25;

        dime_returned = remaining_after_quarters /10;
        remaining_after_dimes = remaining_after_quarters %10;

        nickel_returned = remaining_after_dimes /5;
        pennies_returned = remaining_after_dimes %5;

        //output
        System.out.printf("%-10s %-10s %-10s %-10s %-10s","dollar(s)","quarter(s)","dime(s)","nickel(s)","pennies");
        System.out.printf("\n%-10s %-10s %-10s %-10s %-10s",dollar_returned,quarter_returned,dime_returned,nickel_returned,pennies_returned);
    }
}
