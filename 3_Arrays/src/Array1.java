import java.lang.reflect.Array;
import java.util.ArrayList;

public class Array1 {
    // print array
    static void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // find the average of array element
    static double getAverage(ArrayList<Integer> arr) {
        int size = arr.size();
        double total = 0;
        for (int a : arr) {
            total += a;
        }
        return total / size;
    }

    // Multiply all element by 10
    static void get10Multiples(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i) * 10);
        }
    }

    // Linear Search
    static int LinearSearch(ArrayList<Integer> arr, int target) {
        int index = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == target) {
                index = i;
            }
        }
        return index;
    }

    // Max element in array
    static int getMax(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int a : arr) {
            max = Math.max(max, a);
        }
        return max;
    }

    // Return sum of positive and negative
    static int getSum(ArrayList<Integer> arr) {
        int positive = 0;
        int negative = 0;

        for (int a : arr) {
            if (a < 0) {
                negative += a;
            } else {
                positive += a;
            }
        }
        return positive + negative;
    }

    // count zero ones in an array
    static ArrayList<String> countZeroOnes(ArrayList<Boolean> arr) {
        int ones = 0;
        int zeroes = 0;
        for (boolean a : arr) {
            if (a == true) {
                ones++;
            } else {
                zeroes++;
            }
        }
        String str1 = "No of ones are: " + ones;
        String str2 = "No of zeroes are: " + zeroes;
        ArrayList<String> answer = new ArrayList<>();
        answer.add(str2);
        answer.add(str1);

        return answer;
    }

    // get unsorted element index in an array
    static int getUnsortedElementIndex(ArrayList<Integer> arr){
        if(arr == null || arr.size() < 2) return -1;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i+1) < arr.get(i)){
                return i+1;
            }
        }
        return -1;
    }

    // swap alternate element in an array - even length
    static void swapAlternate(int arr[]){
        for (int i=0;i<arr.length;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    // print the array intersection
    static void arrayIntersection(int arr[],int brr[]){
        int aLength = arr.length;
        int bLength = brr.length;
        int inter[] = new int[Math.max(aLength,bLength)];
        int size = 0;

        for (int i = 0;i<aLength;i++){
            int value = arr[i];
            for (int j=0;j<bLength;j++){
                if(brr[j]==value){
                    inter[size++]=value;
                }
            }
        }

        print(inter);
    }

    // print alternate extremes of an array even length
    static void printAlternateExtremes(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            System.out.print(arr[i]+" ");
            System.out.print(arr[j]+" ");
            i++;
            j--;
        }
    }
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(-20000);
        arr.add(-131);
        arr.add(40);
        arr.add(530);
        System.out.println("Average of arr: " + getAverage(arr));

        get10Multiples(arr);
        System.out.println(arr);
        int search = LinearSearch(arr, 200);
        if (search == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at: " + search);
        }

        System.out.println("Max element in an array: " + getMax(arr));
        System.out.println("Sum of array is :" + getSum(arr));

        ArrayList<Boolean> zeroones = new ArrayList<>();
        zeroones.add(true);
        zeroones.add(true);
        zeroones.add(false);
        zeroones.add(false);
        zeroones.add(false);
        zeroones.add(false);
        zeroones.add(false);
        zeroones.add(false);
        zeroones.add(true);
        zeroones.add(true);
        zeroones.add(true);
        zeroones.add(true);
        zeroones.add(true);
        ArrayList<String> zeroOnesCount = countZeroOnes(zeroones);
        System.out.println(zeroOnesCount);

        ArrayList<Integer> sortedArray = new ArrayList<>();
        sortedArray.add(1);
        sortedArray.add(2);
        sortedArray.add(3);
        sortedArray.add(4);
        sortedArray.add(5);
        sortedArray.add(-1);

        int unsortedIndex = getUnsortedElementIndex(sortedArray);
        System.out.println(unsortedIndex);

        int ar[] = {1,2,3,4,5,6};
        print(ar);
        swapAlternate(ar);
        print(ar);

        int br[] = {2,3,7,6};
        arrayIntersection(ar,br);

        int arrr[] = {1,2,3,4,5,6};
        System.out.println("Alternate Extremes");
        printAlternateExtremes(arrr);
    }
}
