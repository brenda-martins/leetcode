package org.leetcode.weekOne;

//Given a binary tree, determine if it is  height-balanced
//
//        A height-balanced binary tree is a binary tree in which the
//        depth of the two subtrees of every node never differs by more than one.
public class BalancedBinaryTree {

     public static class TreeNode {
      public int val;
      public TreeNode left;
      public TreeNode right;
      TreeNode() {}
      public TreeNode(int val) { this.val = val; }
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
