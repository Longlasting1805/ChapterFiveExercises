package Chapter5Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GlobalWarmingFacts {
    public static void main(String[] args) {
//        InputStreamReader extends reader || convert byte streams into character streams
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(input);

        try {
            System.out.println("1.  Carbon Dioxide __________;\n" +
                                   "A.  Is colorless, odourless, non-toxic,and non-combustible.\n"+
                                    "B.  Is produced when carbon sources are burned (i.e oil,coal,gas...)\n" +
                                    "C.Atmospheric concentration has increased by over 34% since 1960.)\n" +
                                           "D.   All of the above");
            String chooseAnswer1 = read.readLine();
            int answer1 = 4;
            String answer1string = "" + answer1;
            String Question1answers = switch (answer1) {
                case 1 -> "A.  Is colorless, odourless, non-toxic,and non-combustible.";
                case 2 -> "B.  Is produced when carbon sources are burned (i.e oil,coal,gas...";
                case 3 -> "C.  Atmospheric concentration has increased by over 34% since 1960.";
                case 4 -> "D.   All of the above";
                default -> "No response selected";
            };


            System.out.println("2.  Greenhouse gases are; \n"+
                                "A.  A myth created by popular media.\n" +
                                "B. Keep heat close to earth sustaining life, however is rapidly increasing heat levels, which is detrimental to the environment. \n" +
                                "C. Green colored gases that poisoned and kill plant life. \n" +
                                "D  Nothing to be concerned about, continue buying and consuming products that release CO2 emissions...Nothing to see here. ");
            String chooseAnswer2 = read.readLine();
            int answer2 = 2;
            String answer2string = "" + answer2;
            String Question2Answers = switch (answer2) {
                case 1 -> "A.  A myth created by popular media.";
                case 2 -> "B.  Keep heat close to earth sustaining life, however is rapidly increasing heat levels, which is detrimental to the environment. ";
                case 3 -> "C. Green colored gases that poisoned and kill plant life. ";
                case 4 -> "D  Nothing to be concerned about, continue buying and consuming products that release CO2 emissions...Nothing to see here. ";
                default -> "No response selected";
            };


            System.out.println("3. Smart cars help combat global warming by");
            System.out.println("A. Reducing CO2 emissions slowing the rapid warming of the planet atmosphere");
            System.out.println("B. Consuming more energy thereby eliminating oil supplies ");
            System.out.println("C. Require fewer resources to manufacture. ");
            System.out.println("D. None of the above ");
            String chooseAnswer3 = read.readLine();
            int answer3 = 1;
            String answer3string = "" + answer3;
            String Question3Answers = switch (answer3) {
                case 1 -> "A Reducing CO2 emissions slowing the rapid warming of the planet atmosphere";
                case 2 -> "B. Consuming more energy thereby eliminating oil supplies ";
                case 3 -> "C. Require fewer resources to manufacture. ";
                case 4 -> "D. None of the above ";
                default -> "No response selected ";
            };


            System.out.println("4. There is more carbon dioxide in the air today than ");
            System.out.println("A. There ever has been before ");
            System.out.println("B. Than at any other time in the last 800,00 years. ");
            System.out.println("C, Than there will be in 20 years. ");
            System.out.println("D. Both A and B. ");
            String chooseAnswer4 = read.readLine();
            int answer4 = 2;
            String answer4string = "" + answer4;
            String Question4Answers = switch (answer4) {
                case 1 -> "A. There ever has been before ";
                case 2 -> "B. Than at any other time in the last 800,00 years. ";
                case 3 -> "C, Than there will be in 20 years. ";
                case 4 -> "D. Both A and B. ";
                default -> "No response selected";
            };


            System.out.println("5. In the last century sea levels have risen how many inches? ");
            System.out.println("A. 5 Inches");
            System.out.println("B. 0 Inches");
            System.out.println("C 7 Inches");
            System.out.println("D. 22 Inches");
            String chooseAnswer5 = read.readLine();
            int answer5 = 3;
            String answer5string = "" + answer5;
            String Question5Answers = switch (answer5) {
                case 1 -> "A. 5 Inches";
                case 2 -> "B. 0 Inches";
                case 3 -> "C 7 Inches";
                case 4 -> "D. 22 Inches";
                default -> "No response selected";
            };
            int i = 5;
            String str = "" + i;
            int count = 0;
            do {
                if (chooseAnswer1.equals(answer1string)){
                        count++;
                }
                if (chooseAnswer2.equals(answer2string)){
                    count++;
                }
                if (chooseAnswer3.equals(answer3string)){
                    count++;
                }
                if (chooseAnswer4.equals(answer4string)){
                    count++;
                }
                if (chooseAnswer5.equals(answer5string));
                    count++;

        }while (count <= 5);
            if (count == 5){
                System.out.println("excellent");
            }else if (count == 4){
                System.out.println("very good! ");
            }else if (count > 3){
                System.out.println("time to brush up on your knowledge of global warming. ");

                System.out.println(Question1answers);
                System.out.println(Question2Answers);
                System.out.println(Question3Answers);
                System.out.println(Question4Answers);
                System.out.println(Question5Answers);
            }


        } catch (IOException e) {
            e.printStackTrace();

        }


    }
}
