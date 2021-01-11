class Solution {
    public int nextGreaterElement(int n) {
        long ans=-1;
         String str = Integer.toString(n);
        int k=str.length()-1;
        while(k>0)
        {
            if(str.charAt(k)>str.charAt(k-1))
            break;
            
            k--;
        }
        if(k==0)
            return -1;
     
        else
        {char ch=str.charAt(k-1);
        int i=k;
        int sm=k;
        while(k<str.length())
        {
            if(str.charAt(k)<=str.charAt(sm) && str.charAt(k)>str.charAt(i-1))
                sm=k;
            k++;
        }
        char ch1=str.charAt(sm);
                str = str.substring(0,sm) + ch  +  str.substring(sm+1);
               StringBuilder sb=new StringBuilder(str.substring(i));  
    sb.reverse();  
      
          String str1=sb.toString();     
            str = str.substring(0,i-1)+ch1+str1; 
   ans=Long.parseLong(str);
        }
        
        return ans > Integer.MAX_VALUE ? -1 : (int)ans;
    }
}