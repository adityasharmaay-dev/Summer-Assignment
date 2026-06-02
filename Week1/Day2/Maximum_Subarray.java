package Week1.Day2;

public class Maximum_Subarray {
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = maxSubArray(arr);
        System.out.println(maxSum);
    }
    public static int maxSubArray(int[] arr) {
        int ans = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
			ans = Math.max(sum, ans);
			if(sum<0) {
				sum = 0;
			}
		}
		return ans;
}
