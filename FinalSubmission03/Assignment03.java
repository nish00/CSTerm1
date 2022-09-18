public class Assignment03 {

    public static void main(String[]args) {

        String s1,s2;
        s1 = " Welcome ";
        s2 = " welcome ";

        // statement a        
        boolean isEqual = s1.equals(s2);
        System.out.println("(a) "+isEqual);

        // statement b
        boolean isEqualNoCase = s1.equalsIgnoreCase(s2);
        System.out.println("(b) "+isEqualNoCase);

        // statement c
        int x = s1.compareTo(s2);
        System.out.println("(c) "+x);

        // statement d
        int xNoCase = s1.compareToIgnoreCase(s2);
        System.out.println("(d) "+xNoCase);

        // statement e
        boolean b = s1.startsWith("AAA");
        System.out.println("(e) "+b);

        // statement f
        boolean bEndsWith = s1.endsWith("AAA");
        System.out.println("(f) "+bEndsWith);

        // statement g
        int xLength = s1.length();
        System.out.println("(g) "+xLength);

        // statement h
        char xFirstCharacter = s1.charAt(0);
        System.out.println("(h) "+xFirstCharacter);

        // statement i
        String s3 = s1.concat(s2);
        System.out.println("(i) "+s3);

        // statement j
        String newString = s1.substring(1);
        System.out.println("(j) "+newString);

        // statement k
        String newString2 = s1.substring(1,4);
        System.out.println("(k) "+newString2);

        // statement l
        String s3LowerCase = s1.toLowerCase();
        System.out.println("(l) "+s3LowerCase);

        // statement m
        String s3UpperCase = s1.toUpperCase();
        System.out.println("(m) "+s3UpperCase);

        // statement n
        String s3NoSpaces = s1.trim();
        System.out.println("(n) "+s3NoSpaces);

        // statement o
        int xOccurrence = s1.indexOf("e");
        System.out.println("(o) "+xOccurrence);

        // statement p
        int x2Occurrence = s1.indexOf("abc");
        System.out.println("(p) "+x2Occurrence);

    }

}
