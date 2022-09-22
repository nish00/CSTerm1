import java.util.Scanner;

// Declaration of public class
public class Assignment04 {

    // Declaration of main method
    public static void main(String[] args) {

        // Declaration of String for the full name
        String fullName = "Nishchal Jatwani";

        // Using for loops for printing name 10 times on the terminal
        for(int i = 0; i<10 ; i++) {

            // Printing name on the terminal
            System.out.println(i+1+". "+fullName);
        }
        oddNumber();
        multiTable();
    }

    // Declaration of the main method
    public static void oddNumber() {

        // Declaration of Scanner class for user input
        Scanner input = new Scanner(System.in); 
        
        // Prompting user for the input
        System.out.print("Please fill the last value of the list: ");
        
        // Declaration for integer variable
        int n = input.nextInt();
        int sum = 0;
        
        // Using for loops for printing odd numbers on the terminal 
        for (int i = 1; i<n+1; i++){
            if (i%2 != 0) {

                // Printing numbers on the terminal 
                System.out.println(i);
                sum += i; 
            }
        }
        // Printing the total on terminal
        System.out.println("The sum of numbers is " + sum);
    }


    // Declaration of the main method
    public static void multiTable() {

        // Declaration of the integer
        int n = 0;

        // Using while loop for prompting user for correct positive integer
        while(n <= 0) {

            // Declaration of Scanner class for user input
            Scanner input = new Scanner(System.in);
            
            // Prompting user for the correct positive integer 
            System.out.print("Please input a positive integer: ");

            // Declaration of integer variable
            n = input.nextInt();
        }

        // Using for loop for printing the multiplication table on terminal
        for (int i = 1; i<11; i++) {

            // Printing table on terminal
            System.out.println(n*i);
        }
    }
}