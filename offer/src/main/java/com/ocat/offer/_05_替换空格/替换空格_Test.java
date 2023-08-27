package com.ocat.offer._05_替换空格;

import org.junit.Test;

public class 替换空格_Test {
    
    public String replaceSpace(String s) {
        StringBuilder buffer = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i ++) {
            if(chars[i] == ' '){
                buffer.append("%20");
            } else {
                buffer.append(chars[i]);
            }
        }
        return buffer.toString();
    }
    
    @Test
    public void main(){
        String s = "We are happy.";
        System.out.println(replaceSpace(s));;
    }
}
