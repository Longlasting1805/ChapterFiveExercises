package Chapter5Exercises;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {

        double total = 0.0;
        int productNumber = 0;
        int quantity;

        while (productNumber != -1){
            Scanner input = new Scanner(System.in);
            System.out.println("enter product number & -1 to quit");
            productNumber = input.nextInt();
            if(productNumber==-1){
                break;
            }
            System.out.println("quantity sold & -1 to quit");
            quantity = input.nextInt();

            switch (productNumber) {
                case 1 -> total= 2.98 * quantity;
                case 2 -> total= 4.50 * quantity;
                case 3 -> total= 9.98 * quantity;
                case 4 -> total= 4.49 * quantity;
                case 5 -> total = 6.87 * quantity;
            }
            System.out.println("the total is " + total);
        }

    }
}
