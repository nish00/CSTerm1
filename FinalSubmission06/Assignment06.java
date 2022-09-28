import java.util.Arrays;
import java.util.Scanner;

public class Assignment06{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] intList = new int[10];

        System.out.println("Please enter the required 10 numbers: ");
        for(int i = 0; i<intList.length; i++) {
            intList[i] = input.nextInt();
        }
        System.out.println(revArray(intList));
        input.close();
    }

    public static String revArray(int[] arrayIn) {
        int[] newArray = new int[arrayIn.length];
        int n = 0 ;
        for (int i=arrayIn.length; i>0; i--) {
            newArray[n] = arrayIn[i-1];
            n++;
        }
        return Arrays.toString(newArray);
    }
}