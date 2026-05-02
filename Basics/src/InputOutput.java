import java.util.Scanner;

public class InputOutput {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the value of Number2: ");
        int num2 = sc.nextInt();
        System.out.println("Ans: " + (num1 + num2));

        System.out.println("Enter the value of Flag");
        boolean flag = sc.nextBoolean();
        System.out.println("the value of Flag: " + flag);

        System.out.println("Enter the value of shortVal");
        short shortVal = sc.nextShort();
        System.out.println("the value of shortVal: " + shortVal);

        System.out.println("Enter the value of floatVal");
        float floatVal = sc.nextFloat();
        System.out.println("the value of floatVal: " + floatVal);

        System.out.println("Entre the  value of str: ");
        String str = sc.next();
        System.out.println("The value of str is " + str);
        sc.close(); // used to prevent resource leak
    }
}
