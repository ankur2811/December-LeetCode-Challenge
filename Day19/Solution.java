class Solution {
    public int cherryPickup(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][][] dp=new int[n][m][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                Arrays.fill(dp[i][j],-1);
        }
        
        return cherry(0,0,m-1,grid,dp);
    }
    
    public int cherry(int r,int c1,int c2,int[][] grid,int[][][] dp)
    {
        int n=grid.length;
        int m=grid[0].length;
        if(r<0 || r>=n || c1>=m || c2<0 || c1<0 || c2>=m)
            return Integer.MIN_VALUE;
       if (dp[r][c1][c2]!=-1)
           return dp[r][c1][c2];
           int ans=grid[r][c1];
            if(c1!=c2)
                ans+=grid[r][c2];
            
        if(r==n-1)
        {
         return ans;
        }
        
        int temp=0;
        for(int i=-1;i<=1;i++)
        {
            for(int j=-1;j<=1;j++)
            {
                int nc1=c1+i;
                int nc2=c2+j;
                temp=Math.max(temp,cherry(r+1,nc1,nc2,grid,dp));
            }
        }
        ans+=temp;
        return dp[r][c1][c2]=ans;
        
    }
    
}