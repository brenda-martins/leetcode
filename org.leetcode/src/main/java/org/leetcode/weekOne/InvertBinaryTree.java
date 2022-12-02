package org.leetcode.weekOne;

//Given the root of a binary tree, invert the tree, and return its root.
//
//           4              4
//          / \            / \
//         2   7          7   2
//        /\   /\        /\   /\
//        1 3 6  9     9  6   3 1

//Input: root = [4,2,7,1,3,6,9]
//Output: [4,7,2,9,6,3,1]

public class InvertBinaryTree {

    public static TreeNode invertTree(TreeNode root) {

        if(root != null){
            var newLeft = root.right;
            root.right = root.left;
            root.left = newLeft;

            invertTree(root.left);
            invertTree(root.right);
        }

        return  root;
    }
}


 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }