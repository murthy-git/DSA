package Array.Problems;

import java.util.Arrays;

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        check(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int check(int[] nums) {
        int i = 0;
        int j = 1;

        while (j< nums.length){
            if (nums[i] == nums[j]){
                j++;
            }
            else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        System.out.println(i);
        return i;
    }

}