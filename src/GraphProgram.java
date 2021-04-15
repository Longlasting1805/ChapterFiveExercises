import java.util.Random;

public class GraphProgram {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperBound = 31;

        int firstNumber = rand.nextInt(upperBound);
        int secondNumber = rand.nextInt(upperBound);
        int thirdNumber = rand.nextInt(upperBound);
        int forthNumber = rand.nextInt(upperBound);
        int fifthNumber = rand.nextInt(upperBound);

        int[] array = {firstNumber, secondNumber, thirdNumber, forthNumber, fifthNumber};

        for (int count = 0; count < array.length; count++) {
            for (int asterisk = 0; asterisk < array[count]; asterisk++) {
                System.out.printf("%s","*");
            }
            System.out.println();
        }
    }
}
