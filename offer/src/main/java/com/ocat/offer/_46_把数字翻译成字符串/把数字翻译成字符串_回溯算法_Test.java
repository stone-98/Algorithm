package com.ocat.offer._46_把数字翻译成字符串;

import org.junit.Test;

/**
 * @author stone-98
 * @date 2023/8/26
 */
public class 把数字翻译成字符串_回溯算法_Test {
    
    public int translateNum(int num) {
        if (num <= 9) {
            return 1;
        }
        int ba = num % 100;
        if (ba <= 9 || ba >= 26) {
            return translateNum(num / 10);
        } else {
            return translateNum(num / 10) + translateNum(num / 100);
        }
    }
    
    @Test
    public void main() {
        System.out.println(translateNum(12258));
    }
}