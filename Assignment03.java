public class Assignment03 {

    public static void main(String[]args) {

        String s1,s2;
        s1 = " Welcome ";
        s2 = " welcome ";

        // statement a        
        boolean isEqual = s1.equals(s2);
        System.out.println(isEqual);

        // statement b
        boolean isEqualNoCase = s1.equalsIgnoreCase(s2);
        System.out.println(isEqualNoCase);

        // statement c
        int x = s1.compareTo(s2);
        System.out.println(x);

        // statement d
        int xNoCase = s1.compareToIgnoreCase(s2);
        System.out.println(xNoCase);

        // statement e
        boolean b = s1.startsWith("AAA");
        System.out.println(b);

        // statement f
        boolean bEndsWith = s1.endsWith("AAA");
        System.out.println(bEndsWith);

        // statement g
        int xLength = s1.length();
        System.out.println(xLength);

        // statement h
        char xFirstCharacter = s1.charAt(0);
        System.out.println(xFirstCharacter);

        // statement i
        String s3 = s1.concat(s2);
        System.out.println(s3);

        // statement j
        String newString = s1.substring(1)
        System.out.println(newString);

        // statement k
        String newString2 = s1.substring(1,4);
        System.out.println(newString2);

        // statement l
        String s3LowerCase = s1.toLowerCase();
        System.out.println(s3LowerCase);

        // statement m
        String s3UpperCase = s1.toUpperCase();
        System.out.println(s3UpperCase);

        // statement n
        String s3NoSpaces = s1.trim();
        System.out.println(s3NoSpaces);

        //statement o
        int xOccurrence = s1.indexOf("e");
        System.out.println(eOccurrence);

        // statement p
        int x2Occurrence = s1.indexOf("abc");
        System.out.println(x2Occurrence);

    }

}
