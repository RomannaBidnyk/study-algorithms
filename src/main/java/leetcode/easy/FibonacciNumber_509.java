package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber_509 {

    /**
     * #1 simple recursion
     * Time: O(2^N) ! (because every problem is broken down into two sub-problems)
     * Space: O(N)
     */
    public static int fibV1(int N) {
        if (N <= 1) return N;
        else return fibV1(N - 1) + fibV1(N - 2);
    }

    /**
     * #2 recursion with Memoization
     * "decorator"
     * Time: O(N)
     * Space: O(N)
     */
    public static int fibV2(int N) {
        Map<Integer, Integer> cache = new HashMap<>();
        cache.put(0, 0);
        cache.put(1, 1);
        return fibV2(N, cache);
    }

    private static int fibV2(int N, Map<Integer, Integer> cache) {
        if (cache.containsKey(N)) return cache.get(N);
        int result = fibV2(N - 1) + fibV2(N - 2);
        cache.put(N, result);
        return result;
    }

    //TODO iterative && top down vs bottom up
//    https://www.youtube.com/watch?v=_i_nTcwyh-E&t=104s - good explanation for top down vs bottom up dp
}
