package Chapter5Exercises;

import java.util.Scanner;

public class SmallestNumberMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int smallestValue = Integer.MAX_VALUE;
        for (int small = 0; small<10; small++){
            System.out.println("enter number");
            int number = input.nextInt();

            if (smallestValue > number){
                smallestValue = number;
            }
        }
        System.out.printf("smallest value is %d", smallestValue);
    }
}
