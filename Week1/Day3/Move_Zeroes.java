package Week1.Day3;

public class Move_Zeroes {

	public static void main(String[] args) {
		int[] arr = {0,1,0,3,12};
		Move_zeroes(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void Move_zeroes(int[] arr) {
		int i = 0;
		for(int j=0; j<arr.length; j++) {
			if(arr[j] != 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
			}
		}
	}

}
