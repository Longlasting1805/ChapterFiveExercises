package Chapter5Exercises;

public class ProductOfOdd {
    public
    static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 15; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.printf("sumProduct of odd is %d%n", sum);

    }
}