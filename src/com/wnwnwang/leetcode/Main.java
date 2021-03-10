package com.wnwnwang.leetcode;

public class Main {

    public static void main(String[] args) {
        int nums[] = new int[3];
        nums[0] = 2;
        nums[1] = 2;
        nums[2] = 1;
        int a = new Pro136().singleNumber(nums);
        System.out.println(a);
    }
}
