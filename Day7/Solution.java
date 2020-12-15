class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int count=1;
        int sr=0,sc=0,er=n-1,ec=n-1;
        while(sr<=er && sc<=ec)
        {
            for(int i=sc;i<=ec;i++)
            {
                arr[sr][i]=count++;
              
            }
              sr++;
            for(int i=sr;i<=er;i++)
            {
                arr[i][ec]=count++;
            }
            ec--;
            for(int i=ec;i>=sc;i--)
            {
                arr[er][i]=count++;
            }
            er--;
            for(int i=er;i>=sr;i--)
            {
                arr[i][sc]=count++;
            }
            sc++;
        }
        return arr;
    }
}