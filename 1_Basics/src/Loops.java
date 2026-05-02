public class Loops {
    public static void main() {
        // For Loop
        System.out.println("Loop one");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("Loop two");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }

        // Nested For Loop

        // Square
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        // Triangle
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        // inner outer
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i:" + i + " j:" + j);
            }
            System.out.println();
        }

        // break
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        // continue
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // take to direct updation step
            }
            System.out.println(i);
        }

        // While Loop
        int num = 1;
        while (num < 10) {
            System.out.println("The value of num is " + num);
            num++;
        }

        // double while loop
        int i1 = 1;
        while (i1 < 5) {
            int j = 1;
            while (j < 5) {
                System.out.println("The value of i and j is " + i1 + " and " + j);
                j++;
            }
            i1++;
        }

        // do while loop
        int number = 1;
        do {
            System.out.println("The value of number is " + number);
            number++;
        } while (number < 0);

        // 1.Print counting from 1 to n
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        // 2.Print counting from 1 to n
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
        // 3.Print the 10 multiples of n
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        // 4.Print your name 100 times
        for (int i = 1; i <= 100; i++) {
            System.out.println("yash");
        }
        // 5.Print all even number from 1 to 100
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // 6.Print the sum of all the numbers from 1 to n
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of all the numbers from 1 to n is " + sum
        );
        // 7.Print all the integers in range from 50 to 100,that are perfectly divisible by 7
        for (int i = 50; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        // 8.Print all prime numbers from 1 to 100
        System.out.println("Prime numbers between 1 to 100 are ");
        String primeString = "";
        for (int i = 2; i <= 100; i++) {
            int Number = i;
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (Number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                primeString = primeString + " " + Number;
            }
        }
        System.out.println(primeString);

        // Optimized prime number
        System.out.println("Optimised Prime numbers between 1 to 100 are ");
        StringBuilder primeNumbers = new StringBuilder();
        for (int i = 2; i <= 100; i++) {
            int Number = i;
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (Number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                primeNumbers.append(Number).append(" ");
            }
        }
        System.out.println(primeNumbers);

        // one more optimization skip even numbers
        System.out.println("Prime numbers skip even numbers");
        System.out.print("2 ");

        for (int i = 3; i <= 100; i += 2) {
            boolean isPrime = true;

            for (int j = 3; j <= Math.sqrt(i); j += 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
