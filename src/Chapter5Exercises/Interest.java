package Chapter5Exercises;

public class Interest {
    public static void main(String[] args) {

        double amount;
        double workers = 1000.0;

        System.out.printf("%s%20s%n", "year", "amount on deposit");
        for (int rate = 5; rate <=10 ; rate++) {
            double interestRate= rate / 100.0;
            for (int year = 1; year <= 10; year++){
                amount = workers * Math.pow(1.0+interestRate , year);
                System.out.printf("%4d%,20.2f%n", year, amount);
            }
            System.out.println();

        }

    }
}
