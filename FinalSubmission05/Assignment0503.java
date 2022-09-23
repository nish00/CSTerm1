// Importing Scanner class
import java.util.Scanner;

// Declaration of main class
public class Assignment0503 {

    // Declaration of main method
    public static void main(String[] args) {

        // Declaration of scanner class
        Scanner input = new Scanner(System.in);

        // Prompting user for the input on the terminal
        System.out.println("Please type the year to check: ");

        // Declaration of the variable for storing the number
        int year = input.nextInt();

        // Printing the final output on the terminal
        System.out.println(leapYear(year));

    // Closing the scanner class
    input.close();
    }

    // Declaration of the method for leapyear
    public static boolean leapYear(int year) {

        // Declaration of the boolean
        boolean isTrue = true;

            // Using conditional/selection statement for checking the year
            if (year%4 == 0) {
                isTrue = true;
            }
            else
                isTrue = false;
        
        // Returning the final statement
        return isTrue;
    }
}