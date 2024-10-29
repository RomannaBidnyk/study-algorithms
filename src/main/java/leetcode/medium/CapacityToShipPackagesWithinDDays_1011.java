package leetcode.medium;

public class CapacityToShipPackagesWithinDDays_1011 {

    //Version 1

    public int shipWithinDays(int[] weights, int D) {

        int left = maxWeight(weights);
        int right = sumWeight(weights);

        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (checkIfCouldFit(weights, mid, D)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean checkIfCouldFit(int[] weights, int weigth, int days) {
        int countD = 1;
        int weightPerDay = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] == weigth) {
                countD++;
                weightPerDay = 0;
            } else {
                weightPerDay += weights[i];
                if ((i + 1 < weights.length) && (weightPerDay + weights[i + 1] > weigth)) {
                    countD++;
                    weightPerDay = 0;
                }
            }
        }
        return days >= countD;
    }

    private int maxWeight(int[] weights) {
        int max = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > max) {
                max = weights[i];
            }
        }
        return max;
    }

    private int sumWeight(int[] weights) {
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }
        return sum;
    }

}
