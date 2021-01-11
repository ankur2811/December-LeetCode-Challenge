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
    int ans=0;
   public int pseudoPalindromicPaths (TreeNode root) {
       if(root==null)
           return 0;
       
      
       int[] freq=new int[10];
       helper(root,freq);
       
       return ans;
       
   }
   
   public void helper(TreeNode root,int[] freq)
   {
       if(root==null)
           return;
       
       freq[root.val]++;
       if(root.left==null && root.right==null)
       {
           if(ispalindrome(freq))
               ans++;
       }
       helper(root.left,freq);
       helper(root.right,freq);
       
       freq[root.val]--;
   }
   
   public boolean ispalindrome(int[] freq)
   {
       boolean temp=false;
       for(int i=0;i<10;i++)
       {
        if(freq[i]%2!=0)
        {
            if(temp)
                return false;
            else
                temp=true;
        }
       }
       
       return true;
   }
}