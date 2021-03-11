package com.wnwnwang.leetcode

import java.util.*

class Pro217 {
    fun containsDuplicate(nums: IntArray): Boolean {
        var r = HashSet<Int>()
        for (index in nums) {
            if (r.contains(index)) {
                return true
            }
            r.add(index)
        }
        return false
    }
}