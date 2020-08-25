package leetcode.array.easy;

import java.util.HashMap;

public class TwoSum_1 {

    //v1 - Brute Force
    //time - O(n^2)
    //space - O(1)

    public int[] twoSum_v1(int[] nums, int target) {
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


    //v2
    //time - O(n)
    //space - O(n)

    public int[] twoSum_v2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int expected = target - nums[i];
            if (map.containsKey(expected) && map.get(expected) != i) {
                return new int[]{i, map.get(expected)};
            }
        }

        return new int[]{};
        // return empty or throw new IllegalArgumentException("Reason");
    }


    //TODO v3 with HashMap
}
