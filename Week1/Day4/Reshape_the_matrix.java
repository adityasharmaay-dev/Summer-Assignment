package Week1.Day4;

public class Reshape_the_matrix {
    public static void main(String[] args){
        int[][] mat = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        int[][] result = matrixReshape(mat,r,c);
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int row=0, col=0;
        if( m*n != r*c) return mat; 
        int[][] arr = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = mat[row][col];
                if(col == n-1){
                    col=0;
                    row++;
                }
                else col++;
            }
        }
        return arr;
    }
}
