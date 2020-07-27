package leetcode.resursion.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class FibonacciNumber_509 {

    //*****************************************************************************************************************
    //*****************************************************************************************************************

    //#1 simple recursion

    public int fib_v1(int N) {
        if (N < 2) {
            return N;
        } else {
            return fib_v1(N - 1) + fib_v1(N - 2);
        }
    }

    @Test
    public void testFib_v1() {
        Assert.assertEquals(fib_v1(10), 55);
    }

    //Time: O(2^N) !
    //Space: O(N)

    //*****************************************************************************************************************
    //*****************************************************************************************************************

    //#2 recursion with Memoization

    HashMap<Integer, Integer> cache = new HashMap<>();

    public int fib_v2(int N) {
        if (cache.containsKey(N)) {
            return cache.get(N);
        }

        int result;

        if (N < 2) {
            result = N;
        } else {
            result = fib_v2(N - 1) + fib_v2(N - 2);
        }

        cache.put(N, result);
        return result;
    }


    @Test
    public void testFib_v2() {
        Assert.assertEquals(fib_v2(10), 55);
    }

    //Time: O(N)
    //Space: O(N)
    //*****************************************************************************************************************
}
