// Importing the Array class & Scanner class
import java.util.Arrays;
import java.util.Scanner;

// Creating main class
public class Assignment06{

    // Creating main class
    public static void main(String[] args) {

        // Creating Scanner object reference
        Scanner input = new Scanner(System.in);
        
        // Creating integer array
        int[] intList = new int[10];

        // Prompting user for number input
        System.out.println("Please enter the required 10 numbers: ");
        
        // Using for loop for integer datatype input
        for(int i = 0; i<intList.length; i++) {
            intList[i] = input.nextInt();
        }
        // Printing the final array 
        System.out.println(revArray(intList));

        // Closing the Scanner class
        input.close();
    }


    // Creating the method for reversing the array
    public static String revArray(int[] arrayIn) {

        // Copying the array into the new array
        int[] newArray = new int[arrayIn.length];

        // Initiating the integer as counter
        int n = 0 ;

        // Using for loop for reversing the elements and storing in new array
        for (int i=arrayIn.length; i>0; i--) {
            newArray[n] = arrayIn[i-1];
            n++;
        }

        // returning the final reversed array
        return Arrays.toString(newArray);
    }
}