//Importing java scanner class
import java.util.Scanner;

//Declaration of class
public class Assignment2Q3{

    //Declaration of main method
    public static void main(String[] args){
        //Declaration of variable for month number
        int monthNumber;
        //Storing the string prefix
        String prefix = "The month name is ";
        //Declaration of Scanner class
        Scanner input=new Scanner(System.in);
        //Prompt for user input on terminal
        System.out.print("Please enter the month number: ");
        //Storing user input
        monthNumber = input.nextInt();
        
        //Using switch-break statement for month name selection
        switch(monthNumber){
            case 1:
            System.out.println(prefix+"\"January\"");
            break;
            case 2:
            System.out.println(prefix+"\"February\"");
            break;
            case 3:
            System.out.println(prefix+"\"March\"");
            break;
            case 4:
            System.out.println(prefix+"\"April\"");
            break;
            case 5:
            System.out.println(prefix+"\"May\"");
            break;
            case 6:
            System.out.println(prefix+"\"June\"");
            break;
            case 7:
            System.out.println(prefix+"\"July\"");
            break;
            case 8:
            System.out.println(prefix+"\"August\"");
            break;
            case 9:
            System.out.println(prefix+"\"September\"");
            break;
            case 10:
            System.out.println(prefix+"\"October\"");
            break;
            case 11:
            System.out.println(prefix+"\"November\"");
            break;
            case 12:
            System.out.println(prefix+"\"December\"");
            break;
            //Statement for invalid input
            default:
            System.out.println("Error! Invalid input");
        }
    //Closing of scanner class
    input.close();
    }
}