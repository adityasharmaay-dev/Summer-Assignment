package Week1.Day4;

import java.util.ArrayList;
import java.util.List;

public class Matrix_Spiral {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = spiralOrder(matrix);
        for(int i=0; i<result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> arr = new ArrayList<>();

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                arr.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                arr.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }

        return arr;
    }
}
