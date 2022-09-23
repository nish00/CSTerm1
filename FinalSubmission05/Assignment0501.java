// Importing Scanner class
import java.util.Scanner;

// Declaration of class
public class Assignment0501 {

    // Declaration of main method
    public static void main(String[] args) {

        // Declaration of Scanner class
        Scanner input = new Scanner(System.in);

        // Prompting user for three numbers 
        System.out.println("Please enter the three numbers: ");

        // Declaration of integer variables
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
    
        // Printing the final output on the terminal
        System.out.println("The greatest number is "+greatNumber(num1,num2,num3));
        
        // Closing the scanner class
        input.close();
    }

    // Declaration of method for finding greatest number
    public static int greatNumber(int n1, int n2, int n3) {

        // Declaration of integer variable
        int finalNum = 0;

            // Declaration of selection/conditional statements
            if(n1>n2 && n1>n3) {
                finalNum = n1;
            }
            else if(n2>n1 && n2>n3) {
                finalNum = n2;
            }
            else
                finalNum = n3;

        // Returning the greatest number
        return finalNum;
    }
}