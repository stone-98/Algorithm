package com.ocat.offer._45_把数组排成最小的数;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author stone-98
 * @date 2023/8/28
 */
public class 把数组排成最小的数_排序算法_Test {
    
    public String minNumber(int[] nums) {
        return Arrays.stream(nums).mapToObj(String::valueOf).sorted((s1, s2) -> (s1 + s2).compareTo(s2 + s1))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
    }
    
    @Test
    public void main() {
        int[] nums = new int[] {3, 30, 34, 5, 9};
        System.out.println(minNumber(nums));
    }
}