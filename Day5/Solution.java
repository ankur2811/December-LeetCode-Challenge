class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m=flowerbed.length;
        if(n==0)
            return true;
        if(m==1)
        {
            if(n==1 && flowerbed[0]==0)
                return true;
            else
                return false;
        }
       
        int count=0;
        if(flowerbed[0]==0 && flowerbed[1]==0)
        {
            count++;
            flowerbed[0]=1;
        }
        for(int i=1;i<flowerbed.length-1;i++)
        {
            if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0)
            {
                flowerbed[i]=1;
                count++;
            }
           
        }
         if(flowerbed[flowerbed.length-1]==0 &&flowerbed[flowerbed.length-2]==0)
                count++;
        return count>=n;
    }
}