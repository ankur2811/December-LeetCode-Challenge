class Solution {
    public int reachNumber(int target) {
     if(target<0)
         target=-target;
        int step=0;
        int tsum=0;
        while(target>tsum)
        {
            step++;
            tsum+=step;
        }
        if(target==tsum)
            return step;
        
        int diff=tsum-target;
        
        if(diff%2==0)
            return step;
        
        if((step+1)%2!=0)
            return step+1;
        
        else
            return step+2;
        
        
        
    }
}