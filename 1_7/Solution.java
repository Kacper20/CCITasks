/*
    Write an algorithm that if an element in an MxN matrix is 0, its entire row and column are set to 0.

    Another approach to this is to start with


    Time complexity:


 */

public class Solution {

    public static int[][]  setToZeroes(int[][] matrix) {
        //m, number of columns
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] columnsMarks = new boolean[m];
        boolean[] rowMarks = new boolean[n];


        //Mark those rows, that should be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    columnsMarks[i] = true;
                    rowMarks[j] = true;
                }
            }
        }
        //If in marked row or column, change the value in matrix to 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ( columnsMarks[i] || rowMarks[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }



    public static void main(String[] args) {

    }

}
