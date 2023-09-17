package bill;

import java.util.Scanner;

public class bill {
    public static void main(String[] args){
        //vars

        //dish info
        String dish1_name;
        int dish1_quantity;
        float dish1_price;
        float dish1_total;

        String dish2_name;
        int dish2_quantity;
        float dish2_price;
        float dish2_total;

        String dish3_name;
        int dish3_quantity;
        float dish3_price;
        float dish3_total;
        //   %'s
        float sales_tax_P = 0.06f;
        float tip_P = 0.18f;
        //totals
        float subtotal;
        float sales_tax_total;
        float tip_total;
        float total;

        //input
        Scanner scan = new Scanner(System.in);
        //dish 1
        System.out.println("Input name of dish 1:");
        dish1_name = scan.next();
        System.out.println("Input quantity of dish 1:");
        dish1_quantity = scan.nextInt();
        System.out.println("Input price of dish 1:");
        dish1_price = scan.nextFloat();
        //dish 2
        System.out.println("Input name of dish 2:");
        dish2_name = scan.next();
        System.out.println("Input quantity of dish 2:");
        dish2_quantity = scan.nextInt();
        System.out.println("Input price of dish 2:");
        dish2_price = scan.nextFloat();
        //dish 3
        System.out.println("Input name of dish 3:");
        dish3_name = scan.next();
        System.out.println("Input quantity of dish 3:");
        dish3_quantity = scan.nextInt();
        System.out.println("Input price of dish 3:");
        dish3_price = scan.nextFloat();

        //calc

        dish1_total = (dish1_quantity * dish1_price);
        dish2_total = (dish2_quantity * dish2_price);
        dish3_total = (dish3_quantity * dish3_price);
        subtotal = dish1_total + dish2_total + dish3_total;

        sales_tax_total = subtotal * sales_tax_P;
        tip_total = subtotal * tip_P;
        total = subtotal + sales_tax_total + tip_total;

        //output
        System.out.printf("%-25s %-5s %-10s %-10s","dish","Quantity","Price","Total");
        System.out.printf("\n%-30s %-5s %-10s %-10s",dish1_name,dish1_quantity,dish1_price,dish1_total);
        System.out.printf("\n%-30s %-5s %-10s %-10s",dish2_name,dish2_quantity,dish2_price,dish2_total);
        System.out.printf("\n%-30s %-5s %-10s %-10s",dish3_name,dish3_quantity,dish3_price,dish3_total);
        System.out.printf("\nSubtotal%25s",subtotal);
        System.out.printf("\n18 percent tip (before tax)  %2.2f",tip_total);
        System.out.printf("\n6 percent sales tax          %2.2f",sales_tax_total);
        System.out.printf("\nTotal                        %2.2f",total);

    }
}
