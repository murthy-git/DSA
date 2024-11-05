package BinarySearch;

public class BinarySearch {
    public static int binarySearch(final int[] arr, final int target){
        if (arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start+(end-start)/2;

            if (target > arr[mid]){
                start = mid+1;
            }
            else if (target < arr[mid]){
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
