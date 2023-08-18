package com.ocat.offer._03_数组中的重复数字;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author stone-98
 * @date 2023/8/18
 */
public class 数组中的重复数字_哈希表解法_Test {
    
    /**
     * 查找重复数字
     *
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (set.size() != (i + 1)) {
                return nums[i];
            }
        }
        return 0;
    }
    
    @Test
    public void main() {
        int[] nums = new int[]{3,4,2,1,1,0};
        System.out.println(findRepeatNumber(nums));
    }
}