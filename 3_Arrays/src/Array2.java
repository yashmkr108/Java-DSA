import java.util.*;

public class Array2 {
    static public void printArray(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    // Reverse an array
    static public void reverseArray(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // shift array element by one position
    static void shiftByOne(int arr[]) {
        int last = arr[arr.length - 1];
        int i = arr.length - 1;
        while (i > 0) {
            arr[i] = arr[i - 1];
            i--;
        }
        arr[0] = last;
    }

    static void reverseArrayByIndex(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    static void shiftByK(int arr[], int k) {
        int n = arr.length;
        if (k % n == 0) return;
        int[] kelements = new int[k];
        int kIndex = 0;
        for (int i = n - k; i < n; i++) {
            kelements[kIndex] = arr[i];
            kIndex++;
        }
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        for (int i = 0; i < kelements.length; i++) {
            arr[i] = kelements[i];
        }

    }

    static void shiftByKinplace(int arr[], int s, int e, int k) {
        if (k % arr.length == 0) return;
        reverseArrayByIndex(arr, s, e);
        reverseArrayByIndex(arr, s, k - 1);
        reverseArrayByIndex(arr, k, e);
    }

    // highest frequency
    static int getMode(int arr[]) {
        int ans = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int a : arr) {
            freq.put(a, freq.getOrDefault(a, 0) + 1);
        }
//        for (int i : freq.keySet()) {
//            // i-> it contains all key
//            System.out.println(i + "->" + freq.get(i));
//        }
        int maxFreq = -1;
        int maxFreqItem = -1;
        for (int key : freq.keySet()) {
            int currentKey = freq.get(key);
            if (maxFreq < currentKey) {
                maxFreq = currentKey;
                maxFreqItem = key;
            }
        }
        return maxFreqItem;
    }

    static int[] getHighestAndLowestFrequencyElements(int arr[]) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int a : arr) {
            freq.put(a, freq.getOrDefault(a, 0) + 1);
        }
        int highestFrequency = Integer.MIN_VALUE;
        int highestFrequencyNumber = -1;
        int lowestFrequency = Integer.MAX_VALUE;
        int lowestFrequencyNumber = -1;

        for (int key : freq.keySet()) {
            int currentFreq = freq.get(key);
            if (currentFreq > highestFrequency) {
                highestFrequency = currentFreq;
                highestFrequencyNumber = key;
            }
            if (currentFreq < lowestFrequency) {
                lowestFrequency = currentFreq;
                lowestFrequencyNumber = key;
            }
        }

        ans[0] = highestFrequencyNumber;
        ans[1] = lowestFrequencyNumber;

        return ans;
    }

    static int[] unionArray(int[] arr, int[] brr) {
        HashSet<Integer> unique = new HashSet<>();
        for (int a : arr) {
            unique.add(a);
        }
        for (int b : brr) {
            unique.add(b);
        }

        int ans[] = new int[unique.size()];
        int index = 0;
        for (int val : unique) {
            ans[index++] = val;
        }
        Arrays.sort(ans);

        return ans;
    }

    static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 4, 5, 5, 5, 5, 2, 1, 3, 4, 8, 8, 9, 9};
        int brr[] = {10, 20, 30};
//        reverseArray(arr);
//        shiftByOne(arr);
//        shiftByK(arr, 2);
//        shiftByKinplace(arr, 0, arr.length - 1, 2);
        int[] unionArray = unionArray(arr,brr);
        printArray(unionArray);
    }
}
