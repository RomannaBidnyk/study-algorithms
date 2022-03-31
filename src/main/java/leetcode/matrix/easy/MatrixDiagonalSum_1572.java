package leetcode.matrix.easy;


public class MatrixDiagonalSum_1572 {

    /**
     * Time: O(n)
     * Space: O(1)
     */

    public static int diagonalSum(int[][] mat) {
        int sum = 0, n = mat.length;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[i][n - i - 1];
        }
        return n % 2 != 0 ? sum - mat[n / 2][n / 2] : sum;
    }
}
