// Student name: Nishchal Jatwani
// Student ID: 229574040
// Assignment Number: 1
// Question: 03 (Health Application: computing BMI)

//Importing Scanner class
import java.util.*;

//Declaration of the class
public class Assignment1Q3 {

//Declaration of the main method
    public static void main(String[] args) {

        // Calling scanner class for keyboard input
        Scanner input = new Scanner(System.in);

        // Declaration of constants for conversion
        final double LB_TO_KG ,INCH_TO_METER;
        LB_TO_KG = 0.45359237;
        INCH_TO_METER = 0.0254;

        // Printing the weight prompt on the screen: terminal
        System.out.print("Enter weight in pounds: ");

        // Storing the decimals in the variable
        float weightLb = input.nextFloat();
        float weightKg = (float)(weightLb * LB_TO_KG);

        // Printing the height prompt on the screen: terminal
        System.out.print("Enter height in inches: ");

        // Storing the decimals in the variable
        float heightINC = input.nextFloat();
        float heightMTR = (float)(heightINC * INCH_TO_METER);
        // formula for bmi
        float bmi = (float)((weightKg)/Math.pow(heightMTR,2));

        // Printing final BMI on screen:terminal
        System.out.println("BMI is "+ bmi);
        // Closing scanner class
        input.close();
    }
}