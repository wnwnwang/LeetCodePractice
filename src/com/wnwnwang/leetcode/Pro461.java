package com.wnwnwang.leetcode;

public class Pro461 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}
