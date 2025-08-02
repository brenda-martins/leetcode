package org.leetcode.Easy;

// Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].
// link: https://leetcode.com/problems/range-sum-of-bst/description/


import org.leetcode.weekOne.BalancedBinaryTree;

public class RangeSumOfBST {

    public static void main(String[] args) {
        BalancedBinaryTree.TreeNode root = new BalancedBinaryTree.TreeNode(10);
        root.left = new BalancedBinaryTree.TreeNode(5);
        root.right = new BalancedBinaryTree.TreeNode(15);
        root.left.left = new BalancedBinaryTree.TreeNode(3);
        root.left.right = new BalancedBinaryTree.TreeNode(7);
        root.right.right = new BalancedBinaryTree.TreeNode(18);

        System.out.println(rangeSumBST(root, 5, 15));
    }

     public static int rangeSumBST(BalancedBinaryTree.TreeNode root, int low, int high) {
        if (root == null){
            return 0;
        }

        var sum = 0;
        if (root.val >= low && root.val <= high){
            sum += root.val;
        }

        sum += rangeSumBST(root.left, low, high);
        sum += rangeSumBST(root.right, low, high);

        return sum;
    }
}

