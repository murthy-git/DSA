package BinarySearch.Problems;

import BinarySearch.BinarySearch;

public class SearchingInInfiniteArray {
    public static int searchingInInfiniteArray(int[] arr, int target){
        int sizeToSearch = 2;
        int start = 0;
        int end = start+(sizeToSearch-1);

        while (target < arr[end]){
            sizeToSearch *= 2;
            start = end;
            end = start+(sizeToSearch-1);
        }

        return BinarySearch.binarySearch(arr, target);
    }
}
