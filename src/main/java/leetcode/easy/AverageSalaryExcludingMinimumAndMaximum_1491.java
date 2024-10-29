package leetcode.easy;

public class AverageSalaryExcludingMinimumAndMaximum_1491 {

    /**
     * Time: O(n)
     * Space: O(1)
     */

    public static double average(int[] salary) {
        int divideNumber = salary.length - 2;
        int min = salary[0];
        int max = salary[0];

        int sumAll = 0;
        for (int i : salary) {
            if (i < min) min = i;
            if (i > max) max = i;
            sumAll += i;
        }
        return (double) (sumAll - min - max) / divideNumber;
    }
}