package Week1.Day3;

public class Container_with_most_water {
    public static void main(String[] args){
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(arr);
        System.out.println(result);
    }

    public static int maxArea(int[] arr) {
    int i = 0;
       int j = arr.length - 1;
       int water = Integer.MIN_VALUE;
       while(i<j){
            int mul = j-i;
            int upto = Math.min(arr[i],arr[j]);
            water = Math.max(water, mul*upto);
            if(arr[i] < arr[j]) i++;
            else j--;
       }
       return water;
    }
}
