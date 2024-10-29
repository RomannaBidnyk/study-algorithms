package leetcode.easy;

public class CountOddNumbersInAnIntervalRange_1523 {

    /**
     * Time: O(1)
     * Space: O(1)
     */

    public static int countOdds(int low, int high) {
        int count = 0;
        if (low % 2 == 1) {
            count++;
            low++;
        }
        if (high % 2 == 1) {
            count++;
            high--;
        }

        int diff = high - low;
        count += diff / 2;
        return count;
    }
}