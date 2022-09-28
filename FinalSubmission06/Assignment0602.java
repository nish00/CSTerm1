// Importing Scanner class 
import java.util.Scanner;

// Declaration of class
public class Assignment0602 {

    // Declarartion of main class
    public static void main(String[] args) {
    
    // Creating scanner object reference
    Scanner input = new Scanner(System.in);

    // Creating the double array
    double[] decArray = new double[10];

    // Prompting user for the input
    System.out.println("Enter double values for average: ");
        
        // Using for-loop for double datatype input
        for(int i = 0; i<decArray.length;i++) {
            decArray[i] = input.nextDouble();
        }

        // Invoking the average method 
        double finalAverage = average(decArray);

        // Printing the final output on the terminal
        System.out.println("The final average of the numbers " + finalAverage);
    }

    // Creating average method for int datatype input
    public static int average(int[] array) {
        // Initiating the total
        int sum = 0;
        // Using for loop for adding all the elements in the array
        for (int i = 0; i<array.length; i++) {
            sum += array[i];
        }
        // Averaging the sum 
        int avArray = (sum/array.length);
        
        // Returning the final array
        return avArray;
    }
    // Creating average method for double datatype input
    public static double average(double[] array) {
        // Initiating the total
        double sum = 0;
        // Using for loop for adding all the elements in the array
        for(int i = 0; i<array.length; i++) {
            sum += array[i];
        }
        // Averaging the sum
        double avArray = (sum/array.length);
    
        // Returning the final array
        return avArray;
    }
}