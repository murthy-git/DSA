package Algorithms;

import java.util.ArrayList;

class Solution {

    public static void main(String[] args) {
        int[] arr1 = {-13,0,6 ,15 ,16 ,2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6};
        System.out.println(lenOfLongSubarr(arr1, 17, 15));
    }

    public static int lenOfLongSubarr(int[] arr, int n, int k) {
        // Complete the function
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            System.out.printf("i - %s\n", i);
            int sum = 0;
            int count = 0;
            for(int j=i; j<n; j++){
                System.out.printf("j - %s\n", j);
                sum += arr[j];
                count++;
                System.out.printf("sum - %s, Count - %s\n", sum, count);
                if(sum==k){
                    max = Math.max(max, count);
                    System.out.printf("max - %s\n", max);
                    break;
                }
                if(sum>k){
                    break;
                }
            }
        }
        return Math.max(max, 0);
    }
}