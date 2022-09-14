//Importing util package
import java.util.Scanner;
//Declaration of class
public class Assignment2Q2{

    //Declaration of main method
    public static void main(String[] args){
        
        //Declaration of variables
        int num1, num2, num3;
        //Calling Scanner class for user input
        Scanner input = new Scanner(System.in);
        //Prompt for user input on terminal
        System.out.print("Please enter number 01: ");
        //Number 1 User input
        num1 = input.nextInt();
        //Prompt for user input on terminal
        System.out.print("Please enter number 02: ");
        //Number 2 User input
        num2 = input.nextInt();
        //Prompt for user input on terminal
        System.out.print("Please enter number 03: ");
        //Number 3 User input
        num3 = input.nextInt();
            //Putting conditional or selection statements
            if(num1>num2 && num1>num3){
                System.out.println("The greatest number is "+num1);
            }
            else if(num2>num1 && num2>num3){
                System.out.println("The greatest number is "+num2);
            }
            else if(num3>num1 && num3>num2){
                System.out.println("The greatest number is "+num3);
            }
            else
                System.out.println("All three numbers have the same value!");
        //Closing Scanner class
        input.close();
    }
}