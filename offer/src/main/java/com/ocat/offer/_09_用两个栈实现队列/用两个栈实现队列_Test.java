package com.ocat.offer._09_用两个栈实现队列;

import org.junit.Test;

import java.util.Stack;

/**
 * @author stone-98
 * @date 2023/8/19
 */
class 用两个栈实现队列_Test {
    
    /**
     * 栈1
     */
    private final Stack<Integer> s1 = new Stack<>();
    
    /**
     * 栈2
     */
    private final Stack<Integer> s2 = new Stack<>();
    
    
    public void appendTail(int value) {
        s1.push(value);
    }
    
    public int deleteHead() {
        // s2如果为空
        // 判断s1是否为空
        // 如果s1也为空，则删除失败，返回-1
        // 如果s1不为空，则将s1的元素全部push到s2
        // 然后再进行删除操作
        if (s2.isEmpty()) {
            if (s1.isEmpty()) {
                return -1;
            } else {
                while (!s1.isEmpty()) {
                    Integer val = s1.pop();
                    s2.push(val);
                }
            }
        }
        return s2.pop();
    }
    
    
    @Test
    public void main() {
        用两个栈实现队列_Test cq = new 用两个栈实现队列_Test();
        cq.appendTail(1);
        cq.appendTail(2);
        cq.appendTail(3);
        cq.appendTail(4);
        System.out.println(cq.deleteHead());
        System.out.println(cq.deleteHead());
        System.out.println(cq.deleteHead());
        System.out.println(cq.deleteHead());
    }
}
