public class BasicMaths {

    static void printDigits(int num) {
        while (num != 0) {
            int digit = num % 10; // extracting the digit
            System.out.println(digit);
            num = num / 10; // removing the digit
        }
    }

    static void countDigits(int num) {
        int digits = 0;
        while (num != 0) {
            int digit = num % 10; // extracting the digit
            digits++;
            num = num / 10; // removing the digit
        }
        System.out.println(digits > 1 ? "The no of digits are " + digits : "the no of digit is "+digits);
    }

    static void sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10; // extracting the digit
            sum+=digit;
            num = num / 10; // removing the digit
        }
        System.out.println(sum > 1 ? "The sum of digits are " + sum : "the sum of digit is "+sum);
    }

    static void reverseDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10; // extracting the digit
            sum+=digit;
            num = num / 10; // removing the digit
        }
        System.out.println(sum > 1 ? "The sum of digits are " + sum : "the sum of digit is "+sum);
    }


    static void main() {
        sumDigits(412);
    }
}
