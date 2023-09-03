package com.ocat.offer._31_栈的压入弹出序列;

import org.junit.Test;

import java.util.Stack;

public class 栈的压入弹出序列_Test {
    
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int popIndex = 0, pushIndex = 0;
        while (pushIndex < pushed.length) {
            if (!stack.empty() && stack.peek() == popped[popIndex]){
                stack.pop();
                popIndex++;
            } else if (pushed[pushIndex] == popped[popIndex]){
                popIndex++;
                pushIndex++;
            } else {
                stack.push(pushed[pushIndex++]);
            }
        }
        while (!stack.empty()) {
            if (stack.pop() != popped[popIndex++]) {
                return false;
            }
        }
        return true;
    }
    
    @Test
    public void main() {
        int[] pushed = new int[] {2, 1, 0};
        int[] popped = new int[] {1, 2, 0};
        System.out.println(validateStackSequences(pushed, popped));
    }
}
