package Algorithms.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int min = start;

            for(int i=start; i<=end; i++){
                if(arr[i] < arr[min]){
                    min = i;
                };
            };
            int temp = arr[start];
            arr[start] = arr[min];
            arr[min] = temp;
            start++;
        };
    }
}
