class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count=0;
        int n=A.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int sum=A[i]+B[j];
                hm.put(sum,hm.getOrDefault(sum,0)+1);
            }
        }
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int sum=C[i]+D[j];
                count+=hm.getOrDefault(-sum,0);
            }
        }
       return count; 
    }
}