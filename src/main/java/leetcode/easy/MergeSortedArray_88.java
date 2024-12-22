package leetcode.easy;

import java.util.Arrays;

public class MergeSortedArray_88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;
        while (n > 0 && m > 0) {
            if (nums2[n - 1] > nums1[m - 1]) {
                nums1[length - 1] = nums2[n - 1];
                n--;
            } else {
                nums1[length - 1] = nums1[m - 1];
                m--;
            }
            length--;
        }
        while (n > 0) {
            nums1[length - 1] = nums2[n - 1];
            n--;
            length--;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 0, 0, 0};
        merge(array, 3, new int[]{2, 5, 6}, 3);
        System.out.println(Arrays.toString(array));
    }
}
