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
    int max=0;
public int maxDepth(TreeNode root) {
maxDepth(root,0);
    return max;
}

public void maxDepth(TreeNode root,int c)
{
    if(root==null){
        max=Math.max(max,c);
        return;
    }
    
    maxDepth(root.left,c+1);
    maxDepth(root.right,c+1);
}

}