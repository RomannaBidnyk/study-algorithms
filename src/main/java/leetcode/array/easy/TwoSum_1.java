package leetcode.array.easy;

public class TwoSum_1 {

    //v1 - Brute Force
    //time - O(n^2)
    //space - O(1)

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}
