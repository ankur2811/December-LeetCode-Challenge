class Solution {
    int[][] directions = new int[][]{{0,1}, {1,0}, {-1, 0}, {0,-1},{-1,-1},{-1,1},{1,-1},{1,1}};
    public void gameOfLife(int[][] board) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                int k=active(board,i,j);
                
                    if(board[i][j]==1 || board[i][j]==-1)
                    {
                    if(k<2 || k>3)
                        board[i][j]=-1;//0
                    }
                    else
                    {
                        if(k==3)
                            board[i][j]=-2;//1
                    }
                    
                
            }
        }
        
         for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
             if(board[i][j]==-2)
                 board[i][j]=1;
                else if(board[i][j]==-1)
                    board[i][j]=0;
            }
        }
        

        
    }
    
    public int active(int[][] board,int r,int c)
    {
        int count=0;
        for(int d[]:directions)
        {
            int nr=r+d[0];
            int nc=c+d[1];
            
            if(nr>=0 && nc>=0 && nr<board.length && nc<board[0].length && (board[nr][nc]==1 || board[nr][nc]==-1))
                count++;
        }
        return count;
    }
    
}