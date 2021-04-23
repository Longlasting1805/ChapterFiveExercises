package Chapter5Exercises;

public class FacebookUserGrowth{
    public static void main(String[] args) {
        int user = 1000000000;
        int user2 = 1000000000;

        double total = 0;
        double total2 = 0;

        int i = 1;
        int j = 1;

        for (i = 1; user <= 1500000000; i++){
            total = user * (.04);
            user += total;
        }
        System.out.println("The total number of months to reach 1.5 billion users will be: "+ i + "\n");
        for (j = 1; user2 <= 2000000000; j++){
            total2 = user2 * (.04);
            user2 += total2;
        }
        System.out.println("The total number of months to reach 2 billion users will be: " + j);
    }
}
