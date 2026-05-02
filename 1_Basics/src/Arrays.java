import javax.xml.transform.Source;
import java.util.Scanner;

public class Arrays {

    public static void oneDimensionalArrayBasic() {
        // declaration
        int arr[];
        // allocation
        arr = new int[5];
        // init
        int brr[] = {1, 2, 3, 4, 45};
        System.out.println(brr[0]);

        // loop traversal
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }
        // for each loop
        for (int val : brr) {
            System.out.println(val);
        }

    }

    public static void oneDimensionalArray() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is");
        for (int val : arr) {
            System.out.println(val);
        }
        System.out.println("The sum of elements of array ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println("The multiplication elements of array ");
        int mul = 1;
        for (int val : arr) {
            mul *= val;
        }
        System.out.println(mul);
        System.out.println("The maximum and minimum value inside the array");
        int maximumVal = arr[0];
        int minimumVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maximumVal < arr[i]) {
                maximumVal = arr[i];
            }
            if (minimumVal > arr[i]) {
                minimumVal = arr[i];
            }
        }
        System.out.println(maximumVal + " " + minimumVal);
    }

    public static void twoDimensionalArrayBasics() {
        // declaration
        int arr[][];
        // allocation
        arr = new int[3][3];
        // init
        int brr[][] = {
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5}};

        // traversal
        // for equalno of col length - else hr column ke liye nikalo length
        int rowLenght = brr.length;
        int colLenght = brr[0].length;
        for (int row = 0; row < rowLenght; row++) {
            StringBuilder rowString = new StringBuilder();
            for (int col = 0; col < colLenght; col++) {
                rowString.append(brr[row][col] + " ");
            }
            System.out.println(rowString);
        }

    }

    public static void JaggedArray2Dimensional() {
        // Jagged Array this is the array with different no of col as per row
        int[][] crr = {
                new int[2],
                new int[5],
                new int[10],
                new int[1]
        };
        int[][] drr = {
                {1, 2},
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {99}
        };

        System.out.println("The result of jagged array ");
        for (int[] row : drr) {
            StringBuilder str = new StringBuilder();
            for (int col : row) {
                str.append(col + " ");
            }
            System.out.println(str);
        }

        System.out.println("Input in Jagged array crr");
        Scanner sc = new Scanner(System.in);
        int rowLength = crr.length;
        for (int row = 0; row < rowLength; row++) {
            int colLenght = crr[row].length;
            for (int col = 0; col < colLenght; col++) {
                crr[row][col] = sc.nextInt();
            }
        }
        System.out.println("Jagged Array");
        int sum = 0;
        long mul = 1; // memory overflow in int
        int minimum = crr[0][0];
        int maximum = crr[0][0];
        for (int[] row : crr) {
            for (int col : row) {
                sum += col;
                mul *= col;
                if (minimum > col) {
                    minimum = col;
                }
                if (maximum < col) {
                    maximum = col;
                }
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of jagged array is " + sum);
        System.out.println("The mul of jagged array is " + mul);
        System.out.println("The minimum of jagged array is " + minimum);
        System.out.println("The maximum of jagged array is " + maximum);
    }

    static void main() {
        JaggedArray2Dimensional();
    }
}
