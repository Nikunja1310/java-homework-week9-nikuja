package homework_week9_Nikunja;

import java.util.Scanner;

/**
 * 2. Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 */
public class P2_PrintMarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char program = 'y';
        while(program == 'y') {
            System.out.println("\nEnter Student name   \t\t:\t");
            String name = scanner.next();

            System.out.println("\nEnter Student Roll number   \t\t:\t");
            int rollNum = scanner.nextInt();

            System.out.println("Enter marks of Subject maths  \t\t:\t");
            int mathsMarks = scanner.nextInt();
            if (mathsMarks < 0 || mathsMarks > 100) {
                System.out.println("\nInvalid input, marks should be between 0 to 100 ");
                System.out.println("\nPlease enter correct marks\t\t:\t");

                mathsMarks = scanner.nextInt();
            }

            System.out.println("\nEnter marks of Science subject \t\t:\t");
            int scienceMarks = scanner.nextInt();
            if (scienceMarks < 0 || scienceMarks > 100) {
                System.out.println("\nInvalid input, marks should be between 0 to 100 ");
                System.out.println("\nPlease enter correct marks\t\t:\t");

                scienceMarks = scanner.nextInt();
            }

            System.out.println("\nEnter marks of Subject English\t\t:\t ");
            int englishMarks = scanner.nextInt();
            if (englishMarks < 0 || englishMarks > 100) {
                System.out.println("\nInvalid input, marks should be between 0 to 100 ");
                System.out.println("\nPlease enter correct marks\t\t:\t");

                englishMarks = scanner.nextInt();
            }

            // call all the method

            int total = sum(mathsMarks, scienceMarks, englishMarks);       // method "sum" ko = int me store kar diya
            int percentage = (total * 100) / 300;                         // int percentage - remove percentage
            String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
            String grade = calculateGrade(percentage, result);
            printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);

            System.out.println("Do you want to print marksheet for another Student . Please enter 'Y' or 'N' ");
            program = scanner.next().charAt(0);
        }
        scanner.close();

    }



    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //pass or fail ;

    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    // grade
    public static String calculateGrade(int percentage, String result) {
            String grade = null;
            if (result.equalsIgnoreCase("pass")) {
                if (percentage >= 80) {
                    grade = "A++";
                } else if (percentage >= 60) {
                    grade = "A";
                } else if (percentage >= 50) {
                    grade = "C";
                } else {
                    grade = "-";
                }
            }
            return grade;
    }

      public static void printTheMarkSheet(String name, int rollNum , int mathsMarks, int scienceMarks,
                                          int englishMarks, double total, double percentage, String result , String grade ){

          System.out.println("---------------------------------");
          System.out.println("|-------------------------------|");
          System.out.println("| Mark Sheet                    |");
          System.out.println("|-------------------------------|");
          System.out.println("| Roll no : " + rollNum + "                   |");
          System.out.println("| Mark Sheet                    |");
          System.out.println("|-------------------------------|");
          System.out.println("| Subjects :  Marks                    |");
          System.out.println("|-------------------------------|");
          System.out.println("| Math : " + mathsMarks + "          |");
          System.out.println("| Science : " + scienceMarks + "          |");
          System.out.println("| English : " + englishMarks + "          |");
          System.out.println("|-------------------------------|");
          System.out.println("| Total : "   +   total +  "   |");
          System.out.println("|-------------------------------|");
          System.out.println("| Percentage : "   +   percentage +  "   |");
          System.out.println("| Result : "   +   result +  "   |");
          System.out.println("| Grade : "   +   grade +  "   |");
          System.out.println("|-------------------------------|");

      }


}
