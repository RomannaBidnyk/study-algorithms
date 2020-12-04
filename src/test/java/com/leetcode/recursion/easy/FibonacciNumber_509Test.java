package com.leetcode.recursion.easy;

import leetcode.recursion.easy.FibonacciNumber_509;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciNumber_509Test {

    @Test
    public void testFibV1() {
        Assert.assertEquals(FibonacciNumber_509.fibV1(0), 0);
        Assert.assertEquals(FibonacciNumber_509.fibV1(1), 1);
        Assert.assertEquals(FibonacciNumber_509.fibV1(5), 5);
        Assert.assertEquals(FibonacciNumber_509.fibV1(30), 832040);
    }

    @Test
    public void testFibV2() {
        Assert.assertEquals(FibonacciNumber_509.fibV2(0), 0);
        Assert.assertEquals(FibonacciNumber_509.fibV2(1), 1);
        Assert.assertEquals(FibonacciNumber_509.fibV2(5), 5);
        Assert.assertEquals(FibonacciNumber_509.fibV2(30), 832040);
    }
}
