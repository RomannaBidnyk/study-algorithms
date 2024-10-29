package leetcode.easy;

public class RichestCustomerWealth_1672 {

    /**
     * Time: O(M*N) - M - the number of customers and N - the number of banks.
     * Space: O(1)
     */

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int currSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currSum += accounts[i][j];
            }
            if (currSum > maxWealth) maxWealth = currSum;
        }
        return maxWealth;
    }
}