// Declaration of public class
public class Assignment3 {

    // Declaration of main function
    public static void main(String[] args) {

            //Declaration of required strings
            String s1 = " Welcome ";
            String s2 = " welcome ";

            // Statement(a) for comparing both strings    
            boolean isEqual = s1.equals(s2);
            System.out.println("(a)"+isEqual);

            // Statement(b) for comparing both strings without the cases
            boolean isEqualNoCase = s1.equalsIgnoreCase(s2);
            System.out.println("(b)"+isEqualNoCase);

            // Statement(c) for comparing both strings
            int strCompare = s1.compareTo(s2);
            System.out.println("(c)"+strCompare);
   
            // Statement(d) for comparing both strings without the cases
            int strCompareNoCase = s1.compareToIgnoreCase(s2);
            System.out.println("(d)"+strCompareNoCase);
   
            // Statement(e) for checking prefixes of the string
            boolean checkPrefix = s1.startsWith("AAA");
            System.out.println("(e)"+checkPrefix);
    
            // Statement(f) for checking suffixes of the string
            boolean checkSuffix = s1.endsWith("AAA");
            System.out.println("(f)"+checkSuffix);
    
            // Statement(g) for counting total characters in the string
            int stringLength = s1.length();
            System.out.println("(g)"+stringLength);
    
            // Statement(h) for checking character at the required index
            char firstCharacter = s1.charAt(0);
            System.out.println("(h)"+firstCharacter);
    
            // Statement(i) for concatenating both strings
            String combString = s1.concat(s2);
            System.out.println("(i)"+combString);
    
            // Statement(j) for extracting substring from the original string
            String subString = s1.substring(1);
            System.out.println("(j)"+subString);
    
            // Statement(k) for extracting substring from the original string
            String subString2 = s1.substring(1,4);
            System.out.println("(k)"+subString2);
    
            // Statement(l) for coverting the string into lowercase characters
            String stringLowerCase = s1.toLowerCase();
            System.out.println("(l)"+stringLowerCase);
    
            // Statement(m) for converting the string into uppercase characters
            String stringUpperCase = s1.toUpperCase();
            System.out.println("(m)"+stringUpperCase);
    
            // Statement(n) for removing the whitespaces from the string
            String stringNoSpaces = s1.trim();
            System.out.println("(n)"+stringNoSpaces);
    
            // Statement(o) for checking the index of the character's first occurrence
            int charFirstOccur = s1.indexOf("e");
            System.out.println("(o)"+charFirstOccur);
    
            // Statement(p) for checking the index of the characters's last occurrence 
            int charLastOccur = s1.lastIndexOf("e");
            System.out.println("(p)"+charLastOccur);
    }
}
