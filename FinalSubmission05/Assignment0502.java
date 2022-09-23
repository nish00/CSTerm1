// Importing Scanner class
import java.util.Scanner;

//Declaration of class
public class Assignment0502 {
    
    // Declaration of main method
    public static void main(String[] args) {

        // Declaration of Scanner class
        Scanner input = new Scanner(System.in);

        // Prompting user for the number
        System.out.print("Enter the number for its multiplication table: ");
        
        // Declaration of integer variables
        int num = input.nextInt();

        // Making object for the method
        Assignment0502 table = new Assignment0502();
        
        // Printing table on the terminal
        table.multiTable(num);

    // Closing scanner class
    input.close();
    }

    // Declaration of multiplication method
    public void multiTable(int num) {

        // Using for loops for multiplication 
        for (int i = 1; i<11; i++) {

            // Printing the final table on the terminal
            System.out.println(i*num);
        }
    }
}