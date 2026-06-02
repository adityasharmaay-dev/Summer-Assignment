package Week1.Day2;

public class Maximum_Average_Subarray1 {
    public static void main(String[] args){
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double result = findMaxAverage(nums, k);
        System.out.println(result);
    }
    
    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        int MaxSum = sum;
        int Start = 0;
        int End = k;
        while(End<nums.length){
            sum -= nums[Start];
            Start++;

            sum += nums[End];
            End++;

            MaxSum = Math.max(MaxSum, sum);
        }
        return (double) MaxSum/k;
    }

}
