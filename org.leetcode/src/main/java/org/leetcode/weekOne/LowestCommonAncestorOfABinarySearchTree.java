package org.leetcode.weekOne;

public class LowestCommonAncestorOfABinarySearchTree {


    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        var current = root;

        while(current != null){
            if(p.val > current.val && q.val > current.val) {
                current = current.right;
            }else if(p.val < current.val && q.val < current.val){
                current = current.left;
            }else{
                break;

            }
        }
        return current;
    }
}
