package Chapter5Exercises;

import java.util.Scanner;

public class PythagoreanTriples {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter a number to display pythagorean Triples According to your input");
        int input = userInput.nextInt();
        printPythagoreanTriples(input);
        System.out.println("thank you for entering an input");
    }
    private static void printPythagoreanTriples(int userInput){
        for (int a = 1; a < userInput; a++){
            for (int b = 1; b < userInput; b++){
                for (int c = 1; c < userInput; c++){
                    if (a*a + b*b == c*c){
                        System.out.println(a+" "+b+" "+c);
                    }
                }
            }
        }
    }
}
