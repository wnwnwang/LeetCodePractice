package com.wnwnwang.leetcode;

import java.util.HashSet;

public class Pro349 {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> n1 = new HashSet<>();
        for (int i = 0;i<nums1.length;i++) {
            n1.add(nums1[i]);
        }


        HashSet<Integer> rSet = new HashSet<>();

        for (int i = 0;i<nums2.length;i++) {
            if (n1.contains(nums2[i])) {
                rSet.add(nums2[i]);
            }
        }

       Integer[] a = new Integer[rSet.size()];
        rSet.toArray(a);
        int[] b = new int[rSet.size()];

        for (int i=0;i<b.length;i++) {
            b[i] = a[i];
        }

        return b;
    }



}
