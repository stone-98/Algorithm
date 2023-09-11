package com.ocat.offer._58_II_左旋转字符串;

import org.junit.Test;

/**
 * @author stone-98
 * @date 2023/9/11
 */
public class 左旋转字符串_Test {
    
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
    
    @Test
    public void main() {
        System.out.println(reverseLeftWords("abcdefg", 2));
    }
}