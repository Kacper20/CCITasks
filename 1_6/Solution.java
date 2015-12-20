/*

Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings s1, and s2 write code to check
if s2 is a rotation of s1 using only one call to isSubstring(eg "waterbottle" is rotation of "erbottlewat
 */


/*

Given an image represented  by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

 */
public class Solution {


/*
n = 4
    0 1 2 3
  0 X X X X
  1 X X X X
  2 X X X X
  3 X X X X


 */

    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        System.out.println("Before...");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();

        }
        //We move every layer from the 0, to n/2-th row.
        for (int j = 0; j < (n / 2); j++) {

            for (int i = j; i < n - j - 1; i++) {

                int tempLeftUp = matrix[i][j];

                matrix[i][j] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = tempLeftUp;
            }

        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        int[][] multi = new int[][]{
                { 1, 2, 3, 4},
                { 5, 6, 7, 8},
                { 3, 4, 5, 6},
                { 2, 3, 4, 5}

        };
        rotateMatrix(multi);

    }

}
