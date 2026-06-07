package Week1.Day2;

import java.util.Arrays;

public class Contains_Duplicates {
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }
    
    public static boolean containsDuplicate(int[] nums) {
        if(nums.length == 1) return false;
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        Arrays.sort(nums);
        int i=0;
        int j=1;
        while(i<nums.length && j<nums.length){
            if(nums[i] == nums[j]){
                return true;
            }
            else{
                i++;
                j++;
            }
        }
        return false;
    }

}
