import java.util.Scanner;

public class StringBasics {
    static void basics() {
        String firstName = "Yash";
        String lastName = new String("Makkar");
        System.out.println(firstName + " " + lastName);

        System.out.println("The lenght of first name is : " + firstName.length()); // To get length of the string
        System.out.println(firstName.charAt(0));
//        System.out.println(firstName[2]); // This Notation Does not work on string
    }

    static void stringCompare() {
        String name = "Yash";
        String naam = "yash";

        System.out.println("Using ==");
        // This match the location in pool
        if (name == naam) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are different");
        }

        System.out.println("Using .equals");
        // This match actual content case-sensitive
        if (name.equals(naam)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are different");
        }
        System.out.println("Using .equalsIgnoreCase");
        // This match actual content not-case-sensitive
        if (name.equalsIgnoreCase(naam)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are different");
        }
    }

    static void stringInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("String one :");
        String str = new String(sc.next()); // This takes only first word stop after space
        System.out.println(str);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("String two :");
        String str2 = new String((sc1.nextLine())); // This take whole line
        System.out.println(str2);
    }

    static void stringCommonMethods() {
        String str = "Jai Mata Di";

        int len = str.length();
        System.out.println("The length of the string is " + len);

        char secondChar = str.charAt(2);
        System.out.println("The char at position 2 is " + secondChar);

        String subStr = str.substring(0, 4);
        System.out.println("The substring is " + subStr);

        boolean containsJai = subStr.contains("Jai");
        System.out.println("The string contains Jai " + containsJai);

        String upperStr = str.toUpperCase();
        System.out.println("Upper case " + upperStr);
        String lowerStr = str.toLowerCase();
        System.out.println("Lower case " + lowerStr);

        String trimsPlease = "   Jai   ";
        System.out.println("UnTrimmed" + trimsPlease);
        String trimmed = trimsPlease.trim();
        System.out.println("Trimmed " + trimmed);

        String strEmpty = "  ";
        System.out.println(strEmpty.length());
        System.out.println("Is Empty " + strEmpty.isEmpty());
        System.out.println("Is Blank " + strEmpty.isBlank());

        System.out.println(str + " ends with Di ? " + str.endsWith("Di"));
        System.out.println(str + " ends with Jai ? " + str.endsWith("Jai"));
        System.out.println(str + " starts with Jai ? " + str.startsWith("Jai"));
        System.out.println(str + " starts with Di ? " + str.startsWith("Di"));

        String strReplace = str.replace("Jai", "Ajai");
        String strReplaceSpaces = str.replace(" ", "$");
        System.out.println("Replaced String " + strReplace);
        System.out.println("Replaced Spaces String " + strReplaceSpaces);

        char strArray[] = str.toCharArray();
        char charArray[] = {'h', 'e', 'l', 'l'};
        System.out.println(strArray);
        System.out.println("character at position 2 is" + strArray[2]);
        System.out.println(charArray);

        String strPleaseSpill = "My,name,is,yash";
        String strSpilled[] = strPleaseSpill.split(",");
        System.out.println("Spilled Array");
        for (String word : strSpilled) {
            System.out.println(word);
        }
    }

    // Str Questions
    static void PrintEachCharacterOfString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    static void stringLength(String str) {
        char charArray[] = str.toCharArray();
        int count = 0;
        for (char ch : charArray) {
            count++;
        }
        System.out.println("The lenght of the string is " + count);
    }

    static void countVovels(String str) {
        String lowerStr = str.toLowerCase();
        char charArray[] = lowerStr.toCharArray();
        int count = 0;
        for (char ch : charArray) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("This string contains vowels " + count);
    }

    static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse += ch;
        }
        System.out.println(reverse);
        return reverse;
    }

    static boolean palindrome(String str) {
        String strLower = str.toLowerCase();
        String reverse = reverseString(str).toLowerCase();
        if (strLower.equals(reverse)) {
            return true;
        }
        return false;
    }

    static void main() {
        String str = new String("Naman");
        boolean ispalindrome = palindrome(str);
        System.out.println(ispalindrome);
    }
}

