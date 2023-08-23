package com.ocat.offer._11盛水最多的容器;

import org.junit.Test;

/**
 * @author stone-98
 * @date 2023/8/23
 */
public class 盛水最多的容器_双指针解法_Test {
    
    /**
     * 思路：盛水最多相当于面积要最大。
     */
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while(i < j) {
            res = height[i] < height[j] ?
                    Math.max(res, (j - i) * height[i++]):
                    Math.max(res, (j - i) * height[j--]);
        }
        return res;
    }
    
    
    @Test
    public void main() {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}