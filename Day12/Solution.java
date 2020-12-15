/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public class pair{
        TreeNode node;
        int id;
        pair(int i,TreeNode r)
        {
            node=r;
            id=i;
        }
    }
  
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root==null)
            return null;
      return subtree(root).node;
         
    }
    public pair subtree(TreeNode root)
    {
        if(root==null)
            return new pair(0,null);
        pair left=subtree(root.left);
        pair right=subtree(root.right);
        if(left.id==right.id)
        {
         
            return new pair(left.id+1,root);
        }
        if(left.id<right.id)
            return new pair(right.id+1,right.node);
        
        return new pair(left.id+1,left.node);
    }
}