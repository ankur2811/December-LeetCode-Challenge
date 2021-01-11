class Solution {
    public int smallestRangeII(int[] A, int K) {
        Arrays.sort(A);
         int n=A.length;
        int low=A[0];
        int high=A[n-1];
        int ans=high-low;
        for(int i=0;i<n-1;i++)
        {
            int min=Math.min(low+K,A[i+1]-K);
            int max=Math.max(high-K,A[i]+K);
            ans=Math.min(ans,max-min);
        }
        return ans;
    }
    
}