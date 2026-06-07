package Week1.Day3;

import java.util.Arrays;

public class Squares_of_a_SortedArray {
    public static void main(String[] args){
        int[] nums = {-4,-1,0,3,10};
        int[] result = sortedSquares(nums);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

}
