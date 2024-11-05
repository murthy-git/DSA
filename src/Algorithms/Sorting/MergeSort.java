package Algorithms.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
    }

    public static int[] mergeSort(int[] arr, int start, int end){
        if (start == end){
            return arr;
        };
        int mid = start+(end-start)/2;
        int[] leftArr = mergeSort(arr, start, mid);
        int[] rightArr = mergeSort(arr, mid+1, end);

        merge(arr, start, mid, end);
        return arr;
    };

    public static void merge(int[] arr, int start, int mid, int end){
        int[] result = new int[(end-start)+1];
        int resultIndex = 0;
        int i = start;
        int j = mid+1;

        while (i<=mid && j<=end){
            if (arr[i] < arr[j]){
                result[resultIndex] = arr[i];
                i++;
            }
            else {
                result[resultIndex] = arr[j];
                j++;
            };
            resultIndex++;
        };
        while (i<=mid){
            result[resultIndex] = arr[i];
            i++;
            resultIndex++;
        };
        while (j<=end){
            result[resultIndex] = arr[j];
            j++;
            resultIndex++;
        };

        int index = start;
        for (int elem: result){
            arr[index] = elem;
            index++;
        }
    };
}
