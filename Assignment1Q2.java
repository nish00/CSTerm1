// Student name: Nishchal Jatwani
// Student ID: 229574040
// Assignment Number: 1
// Question: 02 (Physics acceleration)

//Importing Scanner class
import java.util.*;

// Declaration of the class
public class Assignment1Q2 {

    // Declaration of the main method
    public static void main(String[] args) {

        // Calling scanner class for keyboard input
        Scanner input = new Scanner(System.in);

        // Declaration for decimal input
        float v0, v1, t;
        // Printing prompt on screen: terminal
        System.out.print("Enter v0, v1, and t: ");

        // Input storage in the float variable
        v0 = input.nextFloat();
        v1 = input.nextFloat();
        t = input.nextFloat();

        //formula for average acceleration
        float averageAcc = (v1 - v0)/t;

        // Printing final average acceleration on screen:terminal
        System.out.println("The average acceleration is "+ averageAcc);

        //Closing scanner class
        input.close();
    }
}