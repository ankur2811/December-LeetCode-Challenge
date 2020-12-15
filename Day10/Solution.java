class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)
            return false;
        int c=0,d=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                if(d==0)
                {
                    c=1;
                }
                else
                    return false;
                
            }
            else if(arr[i]<arr[i-1])
            {
                if(c==1)
                    d=1;
                else
                    return false;
            }
            else 
                return false;
        }
        
        return (d==1)?true:false;
    }
}