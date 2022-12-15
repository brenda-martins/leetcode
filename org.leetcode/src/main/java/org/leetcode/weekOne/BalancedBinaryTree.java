package org.leetcode.weekOne;

public class BalancedBinaryTree {

     public class TreeNode {
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

  public class Dfs{
         boolean balanced;
         int heigth;

         Dfs(boolean balanced, int heigth){
             this.balanced = balanced;
             this.heigth = heigth;
         }
  }
    public boolean isBalanced(TreeNode root) {
        return dfs(root).balanced;
    }

    public Dfs dfs(TreeNode root){
         if (root == null) return new Dfs(true, 0);

         var left = dfs(root.left);
         var right = dfs(root.right);

         var balanced = (left.balanced && right.balanced && Math.abs(left.heigth - right.heigth) <= 1);

         return new Dfs(balanced, 1 + Math.max(left.heigth, right.heigth));


    }
}
