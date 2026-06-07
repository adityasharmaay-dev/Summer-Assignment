package Week1.Day4;

public static class Matrix_Diagonal_sum {

    public static void main(String[] args){
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int result = diagonalSum(mat);
        System.out.println(result);
    }

    public static int diagonalSum(int[][] mat) {
        int sum=0;
        int n = mat.length;
        for(int row=0; row<mat.length; row++){
            for(int col=0; col<mat[0].length; col++){
                if(row == col){
                    sum += mat[row][col];   //primary diagonal
                }
                if(n%2 != 0){
                    if(row+col == n-1 && row!= col){
                        sum += mat[row][col]; 
                    }
                }
                else{
                    if(row+col == n-1){
                        sum += mat[row][col];
                    }
                }

            }
        }
        return sum;
    }
}
