package Chapter5Exercises;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        long fact = input.nextLong();
        long sum = 1;
        for (int counter= 1; counter<= fact; counter++){
            sum = sum * counter;

        }
        System.out.printf("The factorial of %d is %d%n",fact,sum);
    }
}
