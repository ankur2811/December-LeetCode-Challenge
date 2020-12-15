class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        
        int[][] dp = new int[n][n];
        for(int[] d: dp)Arrays.fill(d,-1);
        
        return maxCoins(nums,0,n-1,dp);
    }
    public int maxCoins(int[] nums,int si,int ei ,int[][] dp) {
        if(dp[si][ei] != -1) return dp[si][ei];
        
        int liVal = (si - 1 == -1) ? 1 : nums[si - 1];
        int riVal = (ei + 1 == nums.length) ? 1 : nums[ei + 1];
        
        int myCost = 0;
        
        for(int cut = si;cut<=ei;cut++){
            int leftTree = (cut == si)?0:maxCoins(nums,si,cut-1,dp);
            int rightTree = (cut == ei)?0:maxCoins(nums,cut+1,ei,dp);
            
            myCost = Math.max(myCost, leftTree + liVal * nums[cut] * riVal + rightTree); 
        }
        
        return dp[si][ei] = myCost;
    }
}