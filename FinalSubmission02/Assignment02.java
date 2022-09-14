//Import util package
import java.util.Scanner;
//Declaration of class
public class Assignment02 {

    //Declaration of main method
    public static void main(String[] args) {
        
        //Declaration of variables
        int num1, num2;
        //Calling Scanner class for user input
        Scanner input = new Scanner(System.in);
        //Prompt for user input on terminal
        System.out.println("Please enter Number 01: ");
        //Number 1 User input
        num1 = input.nextInt();
        //Prompt for user input on terminal
        System.out.println("Please enter Number 02: ");
        //Number 2 user input
        num2 = input.nextInt();

            //Putting conditional or selection statements
            if (num1>num2){
                System.out.println("Number 1 is greater than Number 2!");
            }
            else if(num1<num2){
                System.out.println("Number 2 is greater than Number 1!");
            }
            else
                System.out.println("Number 1 is equal to Number 2!");
        //Closing Scanner class    
        input.close();
    }
}