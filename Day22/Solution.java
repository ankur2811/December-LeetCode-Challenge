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
    class pair{
        boolean ans;
        int height;
        pair(boolean ans,int height)
        {
            this.ans=ans;
            this.height=height;
        }
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        return isBalancedhelper(root).ans;
        
    }
    
    public pair isBalancedhelper(TreeNode root)
    {
        if(root==null)
            return new pair(true,0);
        pair left=isBalancedhelper(root.left);
        pair right=isBalancedhelper(root.right);
        if(left.ans==false || right.ans==false || Math.abs(left.height-right.height)>1)
            return new pair(false,0);
        
        return new pair(true,Math.max(left.height,right.height)+1);
    }
}