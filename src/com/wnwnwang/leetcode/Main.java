package com.wnwnwang.leetcode;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        test(null);
    }

    public static void test(Object o) {
        if (o instanceof Map) {
            System.out.println("map");
        } else {
            System.out.println("else");
        }
    }
}
