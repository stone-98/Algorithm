package com.ocat.offer._07_重建二叉树;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author stone-98
 * @date 2023/8/19
 */
public class 重建二叉树_递归算法_Test {
    
    
    /**
     * 哈希映射，帮助快速索引
     */
    private static final Map<Integer, Integer> INDEX_MAP = new HashMap<>();
    
    
    /**
     * <pre>
     * 构建子树
     * 思路： 把每个子树堪称一个单独的树，通过buildSubTree方法进行构建
     * 1、首先判断如果 [前序遍历左边的索引] > [前序遍历右边的索引] 则代表已经没有节点了，则直接返回空。
     * 2、前序列表数组中第一个就是根节点，然后在中序遍历中找到该节点的索引，然后则可以在中序遍历中计算出左子树的节点数量，然后再计算出右子节点的数量
     * 3、然后创建出当前节点的值，并且对左子节点以及右子节点进行赋值，并且返回当前节点
     * </pre>
     *
     * @param preorder      前序遍历
     * @param inorder       中序遍历
     * @param preLeftIndex  前序遍历左边的索引
     * @param preRightIndex 前序遍历右边的索引
     * @param inLeftIndex   中序遍历左边的索引
     * @param inRightIndex  中序遍历右边的索引
     * @return
     */
    public TreeNode buildSubTree(int[] preorder, int[] inorder, int preLeftIndex, int preRightIndex, int inLeftIndex,
            int inRightIndex) {
        if (preLeftIndex > preRightIndex) {
            return null;
        }
        int preRootIndex = preLeftIndex;
        int inRootIndex = INDEX_MAP.get(preorder[preRootIndex]);
        TreeNode root = new TreeNode(preorder[preRootIndex]);
        int sizeLeftSubtree = inRootIndex - inLeftIndex;
        root.left = buildSubTree(preorder, inorder, preLeftIndex + 1, preLeftIndex + sizeLeftSubtree, inLeftIndex,
                inRootIndex - 1);
        root.right = buildSubTree(preorder, inorder, preLeftIndex + sizeLeftSubtree + 1, preRightIndex, inRootIndex + 1,
                inRightIndex);
        return root;
    }
    
    /**
     * 通过前序遍历和中序遍历构建Tree
     *
     * @param preorder 前序遍历
     * @param inorder  中序遍历
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < preorder.length; i++) {
            INDEX_MAP.put(inorder[i], i);
        }
        return buildSubTree(preorder, inorder, 0, preorder.length - 1, 0, preorder.length - 1);
    }
    
    
    @Test
    public void main() {
        int[] pre = new int[] {3, 9, 20, 15, 7};
        int[] in = new int[] {9, 3, 15, 20, 7};
        TreeNode treeNode = buildTree(pre, in);
        System.out.println(treeNode);
    }
    
}