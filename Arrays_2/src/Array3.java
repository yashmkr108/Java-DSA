public class Array3 {
    static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // separate zeroes and ones
    static void segregate0and1(int[] arr) {
        int len = arr.length;
        int i = 0;
        int j = len - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j--;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }

    }

    // LeetCode - 268
    // Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
    static int missingNumber(int[] nums) {
        int xor = nums.length;
        for (int i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];
        }
        return xor;
    }

    // int[] arr = {1, 1, 2, 3, 3, 2, 4}; return 4
    static int uniqueOccurrences(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer = answer ^ arr[i];
        }
        return answer;
    }

    static void main() {
        int[] arr = {1, 1, 2, 3, 3, 2, 4};
        System.out.println(uniqueOccurrences(arr));
    }
}
