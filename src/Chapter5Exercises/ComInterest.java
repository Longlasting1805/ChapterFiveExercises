package Chapter5Exercises;

public class ComInterest {
    public static void main(String[] args) {
        double amount = 0;
        int amounts;
        double worker = 1000.0;
        int workers;
        double rate = 0.05;
        int rates;

        System.out.printf("%s%20s%n", "year", "amount on deposit");
        for (int year = 1; year < 11; year++){
            amount = (1000.0);
            rate = (double)(0.05);
            amount = worker * Math.pow(1.0 + rate, year);
            amounts=(int)amount;

            workers = (int)worker;

            rates = (int)rate;

            System.out.printf("%4d%20d%n", year, amounts);
    
        }



    }
//    use only integers to calculate the compound interest
//    Treat all monetary amounts as integral numbers of pennies
//    Then break the result into its dollars and cents portions by using division and remainder operations
//    insert a period between the dollars and cents portions
}
