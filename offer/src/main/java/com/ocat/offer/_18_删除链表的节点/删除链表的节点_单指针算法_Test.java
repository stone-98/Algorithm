package com.ocat.offer._18_删除链表的节点;

import org.junit.Test;

/**
 * @author stone-98
 * @date 2023/8/24
 */
public class 删除链表的节点_单指针算法_Test {
    
    /**
     * 删除指定节点
     *
     * @param head 头节点
     * @param val  对应的值
     * @return
     */
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            return head.next;
        }
        ListNode cur = head;
        while (cur.next != null && cur.next.val != val) {
            cur = cur.next;
        }
        if (cur.next != null) {
            cur.next = cur.next.next;
        }
        return head;
    }
    
    @Test
    public void main() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode listNode = deleteNode(l1, 3);
        System.out.println(listNode);
    }
}