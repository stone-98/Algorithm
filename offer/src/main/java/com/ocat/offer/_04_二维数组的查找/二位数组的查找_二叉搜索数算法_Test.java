package com.ocat.offer._04_二维数组的查找;

import org.junit.Test;

/**
 * @author stone-98
 * @date 2023/8/25
 */
public class 二位数组的查找_二叉搜索数算法_Test {
    
    /**
     * 在数组中判断有没有指定的节点
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        return findNumberInTree(matrix, 1, matrix[0].length, target);
    }
    
    /**
     * 在二叉搜索树中查找指定数
     *
     * @param matrix 二叉树所有元素
     * @param r      行
     * @param c      列
     * @param target 目标数
     * @return
     */
    private boolean findNumberInTree(int[][] matrix, int r, int c, int target) {
        if (r > matrix.length || c <= 0) {
            return false;
        } else if (matrix[r - 1][c - 1] == target) {
            return true;
        }
        if (target < matrix[r - 1][c - 1]) {
            return findNumberInTree(matrix, r, --c, target);
        } else {
            return findNumberInTree(matrix, ++r, c, target);
        }
    }
    
    @Test
    public void main() {
        int[][] ints = new int[][] {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(findNumberIn2DArray(ints, -10));
    }
}