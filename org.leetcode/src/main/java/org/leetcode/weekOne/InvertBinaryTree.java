package org.leetcode.weekOne;

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