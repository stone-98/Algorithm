package com.github.notes.algorithm.offer03_数组中的重复数字;

import org.junit.Test;

/**
 * @author stone-98
 * @date 2023/8/18
 */
public class 数组中的重复数字_原地交换解法_Test {
    
    /**
     * 查找重复数字
     *
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            // 如果值和索引相等，则跳过，开始下一个索引的处理
            if (nums[i] == i) {
                i++;
                continue;
            }
            // 如果数组指定索引的值和索引不相等，则打算交换nums[nums[i]]和nums[i]
            // 在交换前先判断，当前的字段值是否和目标索引的指是否相等，如果相等则代表重复，直接返回
            if (nums[nums[i]] == nums[i]){
                return nums[i];
            }
            // 如果不相等，则开始交换
            // 其中nums[i]代表这个索引现在的值
            // nums[nums[i]]代表目标索引的值
            int tmp = nums[nums[i]];
            nums[nums[i]] = nums[i];
            nums[i] = tmp;
        }
        // 如果遍历到最后都没有找到，那么代表没有重复的数字
        return -1;
    }
    
    @Test
    public void main() {
        int[] nums = new int[]{3,4,2,1,1,0};
        System.out.println(findRepeatNumber(nums));
    }
}