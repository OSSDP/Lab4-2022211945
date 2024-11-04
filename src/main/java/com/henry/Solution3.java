package com.henry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组长度计算问题：在初始化 dp 数组时，len 的计算可能有误。应该将 len 初始化为 nums.length 而不是 nums.length-1。
 * 循环索引问题：在循环中，j 应该从 0 开始，而不是 1。
 * 最大值计算问题：初始化最大值索引 maxVal 时，应该是 maxVal = 0 而不是 maxVal = dp[0]。
 * 最大子集倒推问题：存储最大子集时应该使用 nums[maxVal] 而不是 nums[i]，并且应该将 maxVal 赋值为 nums[i] 而不是 maxVal = nums[i]
 */
public class Solution3 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);

        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        int maxSize = 1;
        int maxVal = 0;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if (dp[i] > maxSize) {
                maxSize = dp[i];
                maxVal = i;
            }
        }

        List<Integer> res = new ArrayList<>();
        if (maxSize == 1) {
            res.add(nums[0]);
            return res;
        }

        for (int i = maxVal; i >= 0; i--) {
            if (dp[i] == maxSize && nums[maxVal] % nums[i] == 0) {
                res.add(nums[i]);
                maxVal = i;
                maxSize--;
            }
        }
        return res;
    }
}
