package Chapter5Exercises;

import java.util.Scanner;

public class DeMorganLaw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value of x");
        int x=input.nextInt();
        System.out.println("Enter value of y");
        int y=input.nextInt();

        if (!(x < 5) && !(y >= 7)){
            System.out.println("Number1 check");
        }

        System.out.println("enter value a");
        int a = input.nextInt();
        int b = 3;
        System.out.println("enter value g");
        int g = input.nextInt();

        if (!(a == b) || (g != 5)){
            System.out.println("number2 check");
        }

        if (!(x <= 8) && (y > 4)){
            System.out.println("number3 check");
        }

        System.out.println("enter value i");
        int i = input.nextInt();
        System.out.println("enter value j");
        int j = input.nextInt();

        if (!(i > 4) || (j <=6)){
            System.out.println("number4 check");
        }

    }
}
