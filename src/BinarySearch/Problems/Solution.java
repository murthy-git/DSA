package BinarySearch.Problems;

class Solution {
    public static void main(String[] args){
        int[] arr = {1,0,1,1,1};
        int target = 0;

        System.out.println(search(arr, target));
    }

    public static boolean search(int[] nums, int target) {
        if(nums.length == 1){
            return nums[0] == target;
        }

        int peak = findPeakInRotatedArray(nums);

        if(nums[peak] == target){
            return true;
        }
        if(target > nums[0]){
            return binarySearch(nums, target, 0, peak);
        }
        return binarySearch(nums, target, peak+1, nums.length-1);

    }
    public static int findPeakInRotatedArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(mid<arr.length-1 && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] >= start ){
                start = mid;
            }
            else{
                end = mid-1;
            }
        };
        return -1;
    };

    static boolean binarySearch(int[] arr, int target, int start, int end){

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target){
                return true;
            }
            if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        };
        return false;
    }

}
