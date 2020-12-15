class Solution {
    public List<List<String>> partition(String s) {
        int n=s.length();
        List<List<String>> ans=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        partition(s,temp,ans);
        return ans;
        
    }
    
    public void partition(String s,List<String> temp,List<List<String>> ans)
    {
        if(s.length()==0)
        {
            List<String> small=new ArrayList<>(temp);
               ans.add(small);
            return;
        }
        for(int i=1;i<=s.length();i++)
        {
            String left=s.substring(0,i);
            String right=s.substring(i);
            if(isPalindrome(left))
            {
                ArrayList<String> t=new ArrayList<>(temp);
                t.add(left);
                partition(right,t,ans);
            }
        }
    }
    
    public boolean isPalindrome(String s)
    {
        int l=0,r=s.length()-1;
        while(l<=r && s.charAt(l)==s.charAt(r))
        {
           
                l++;
                r--;
            
        }
        return l>=r;
    }
}