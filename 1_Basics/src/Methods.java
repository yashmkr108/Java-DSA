public class Methods {
    // Method declaration
    static void print2Table() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 * i + " ");
        }
    }

    static void sumOf2(int a, int b) { // the data we recieve is parameters
        System.out.println(a + b);
    }

    static int MultiplyNumbers(int a, int b) {
        return a * b;
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b;
    }

    static float add(int a, float b, int c) {
        return a + b + c;
    }

    static void solve(int num) {
        System.out.println(num);
        num = num * 10;
        System.out.println(num);
    }


    // Questions

    static void Greet(String name) {
        System.out.println("Hello " + name);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static int getMax(int a, int b) {
        int answer = a > b ? a : b;
        return answer;
    }

    static float percentage(float obtain, float total) {
        return (obtain / total) * 100;
    }

    static void display(int a) {
        System.out.println("Your number is " + a);
    }

    static void display(String str) {
        System.out.println("Your number is " + str);
    }

    static void updateX(int x) {
        x = x + 1;
    }

    static void main() {
//        print2Table(); // Method call
//        sumOf2(2, 3); // data we send are arguments
//
//        int mul = MultiplyNumbers(4,3);
//        System.out.println(mul);
//
//        // call by value
//        solve(5);

        // Questions
        Greet("Yash");

        int sum = sum(7, 9);

        System.out.println(sum);

        int num = 5;

        System.out.println("The " + num + " is even " + isEven(num));

        System.out.println("The largest of two number is " + getMax(4, 5));

        System.out.println("The percentage is " + percentage(100, 500));

        display(65);
        display("Yash");

        int x = 7;
        System.out.println(x);
        updateX(7);
        System.out.println("Updated x " + x);
    }
}
