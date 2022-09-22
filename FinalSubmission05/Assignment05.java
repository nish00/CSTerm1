public class Assignment05 {


    public static void main(String[] args) {
        String prefix = "The greatest number is ";
        System.out.println(prefix+greatNumber(5,3,1));
        multiTable(8);

    }

    public static int greatNumber(int num1, int num2, int num3) {

        int finalNum = 0;
            if(num1>num2 && num1>num3) {
                finalNum = num1;
            }
            else if(num2>num1 && num2>num3) {
                finalNum = num2;
            }
            else
                finalNum = num3;

        return finalNum;
    }

    public static void multiTable(int num) {
        int multinum = 0;
        for (int i = 1; i<11; i++) {
            multinum = (i*num);
            System.out.println(multinum);
        }
        return;
    }

    public static int leapYear(int year) {
        
    }










}
