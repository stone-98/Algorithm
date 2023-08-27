package com.ocat.offer._10_I斐波那契数列;

import org.junit.Test;

/**
 * @author stone-98
 * @date 2023/8/19
 */
public class I斐波纳契数列_暴力解法_Test {
    
    public int fib(int n) {
        int front = 0, behind = 1;
        int sum = 1;
        if (n == 0) {
            return 0;
        }
        for (int i = 2; i < n; ++i) {
            front = behind;
            behind = sum;
            sum = (front + behind) % 1000000007;
        }
        return sum;
        //return sum %% 1000000007 错误
    }
    
    // 1000000007
    @Test
    public void main() {
        System.out.println(fib(1));
    }
}