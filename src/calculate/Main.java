package calculate;
/**
 * 4. Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char program = 'y';

        while( program == 'y') {
            System.out.println("Enter number 1 : ");
            int num1 = scanner.nextInt();

            System.out.println("Enter number 2 : ");
            int num2 = scanner.nextInt();

            System.out.println("Enter any symbol +,-,*,/: ");
            char symbol = scanner.next().charAt(0);


            if (symbol == '+') {
                System.out.println("Addition of " + num1 + " and " + num2 + " is : " + (num1 + num2));
            } else if (symbol == '-') {
                System.out.println("Subtraction of " + num1 + " and " + num2 + " is : " + (num1 - num2));
            } else if (symbol == '*') {
                System.out.println("Multiplication of " + num1 + " and " + num2 + " is : " + (num1 * num2));
            } else if (symbol == '/') {
                System.out.println("Division of " + num1 + " and " + num2 + " is : " + (num1 / num2));
            } else {
                System.out.println("Please enter correct symbol + , - , * , /  : ");
            }


            System.out.println("Would you like to do more calculation? Please enter 'Y' or 'N' :  ");

            program =scanner.next().charAt(0);


        }

        // while loop ends here
        scanner.close();
    }
    //main method ends here

} // class ends
