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
        int max;
        int min;
        boolean ans;
        pair()
        {
            
        }
        pair(int ma,int mi,boolean a)
        {
            max=ma;
            min=mi;
            ans=a;
        }
    }
    public boolean isValidBST(TreeNode root) {
        return isValid(root).ans;
    }
    public pair isValid(TreeNode root)
    {
      if(root==null)
      {
          return new pair(-(int)1e8,(int)1e8,true);
      }
        pair left=isValid(root.left);
        pair right=isValid(root.right);
        if(left.ans==false || right.ans==false)
              return new pair(left.min,left.max,false);
        if(left.max>=root.val)
            return new pair(left.min,left.max,false);
           if(right.min<=root.val)
            return new pair(left.min,left.max,false);
        
        pair a=new pair();
        a.ans=true;
        a.min=Math.min(left.min,Math.min(right.min,root.val));
        a.max=Math.max(left.max,Math.max(right.max,root.val));
        return a;
        
        
    }
    
}