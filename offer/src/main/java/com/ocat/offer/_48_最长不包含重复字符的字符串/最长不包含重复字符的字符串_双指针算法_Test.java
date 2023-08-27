package com.ocat.offer._48_最长不包含重复字符的字符串;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class 最长不包含重复字符的字符串_双指针算法_Test {
    
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        char[] chars = s.toCharArray();
        int left = 0, right = 1, max = 1;
        Map<Character, Integer> indexByChar = new HashMap();
        indexByChar.put(chars[0], 0);
        while (right < chars.length) {
            if (max > chars.length  - left - 1) {
                break;
            } else if (indexByChar.containsKey(chars[right])) {
                int index = indexByChar.get(chars[right]);
                left = index + 1;
                right = left + 1;
                indexByChar.clear();
                indexByChar.put(chars[left], left);
            } else {
                indexByChar.put(chars[right], right++);
                max = Math.max(right - left, max);
            }
        }
        return max;
    }
    
    @Test
    public void main(){
        System.out.println(lengthOfLongestSubstring("pwwkew"));;
    }
}
