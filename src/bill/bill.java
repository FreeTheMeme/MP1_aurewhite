package bill;

import java.util.Scanner;

public class bill {
    public static void main(String[] args){
        //vars

        //dish info
        String dish1_name;
        int dish1_quantity;
        float dish1_price;

        String dish2_name;
        int dish2_quantity;
        float dish2_price;

        String dish3_name;
        int dish3_quantity;
        float dish3_price;

        //   %'s
        int sales_tax_P = 6;
        int tip_P = 18;
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
        System.out.println("Input name of dish 1:");
        dish2_name = scan.next();
        System.out.println("Input quantity of dish 1:");
        dish2_quantity = scan.nextInt();
        System.out.println("Input price of dish 1:");
        dish2_price = scan.nextFloat();
        //dish 3
        System.out.println("Input name of dish 1:");
        dish3_name = scan.next();
        System.out.println("Input quantity of dish 1:");
        dish3_quantity = scan.nextInt();
        System.out.println("Input price of dish 1:");
        dish3_price = scan.nextFloat();

        //calc
        subtotal = (dish1_quantity * dish1_price)+(dish2_quantity * dish2_price)+(dish3_quantity * dish3_price);
        sales_tax_total = subtotal / sales_tax_P;
        tip_total = subtotal / tip_P;
        total = subtotal + sales_tax_total + tip_total;

        //output
        
    }
}
