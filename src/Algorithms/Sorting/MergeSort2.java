package Algorithms.Sorting;

import java.io.PrintStream;
import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    private static void mergeSort(int[] arr,int start,int end){
        if (start == end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end){
        int[] result = new int[(end-start)+1];
        int resultIndex = 0;
        int leftArrayIndex = start;
        int rightArrayIndex = mid+1;

        while(leftArrayIndex <= mid && rightArrayIndex <= end){
            if (arr[leftArrayIndex] < arr[rightArrayIndex]){
                result[resultIndex] = arr[leftArrayIndex];
                resultIndex++;
                leftArrayIndex++;
            }
            else {
                result[resultIndex] = arr[rightArrayIndex];
                resultIndex++;
                rightArrayIndex++;
            }
        }
        while (leftArrayIndex <= mid){
            result[resultIndex] = arr[leftArrayIndex];
            resultIndex++;
            leftArrayIndex++;
        }

        while (rightArrayIndex <= end){
            result[resultIndex] = arr[rightArrayIndex];
            resultIndex++;
            rightArrayIndex++;
        }

//       Copy everything from temp arr `result` to original array.
        for (int i: result){
            arr[start] = i;
            start++;
        }
    }
}
