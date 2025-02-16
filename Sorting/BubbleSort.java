package Sorting;
public class BubbleSort {
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // Swap if the element is greater
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 2, 9, 1, 5, 6};
        bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
// Bubble Sort compares adjacent elements and swaps them if they are in the wrong order.

// Time Complexity
// Best Case (Already Sorted): O(n)
// Worst/ Average Case: O(n^2)
// 📌 Not efficient for large datasets.