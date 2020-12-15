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
    TreeNode ans=null,curr=null;
    public TreeNode increasingBST(TreeNode root) {
        increasing(root);
        return ans;
    }
    
    public void increasing(TreeNode root)
    {
        if(root==null)
            return;
        increasing(root.left);
        if(ans==null)
        {
            ans=new TreeNode(root.val);
            curr=ans;
        }
        else
        {
            curr.right=new TreeNode(root.val);
            curr=curr.right;
        }
        increasing(root.right);
    }
}