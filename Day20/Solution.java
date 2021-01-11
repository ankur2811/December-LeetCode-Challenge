class Solution {
    public String decodeAtIndex(String S, int k) {
        int n=S.length();
       long size=0;
        for(char c:S.toCharArray())
        {
            if(Character.isDigit(c)){
				size = size * (c-'0');
			}
			else {
				size++;
			}
        }
        for(int i=n-1;i>=0;i--)
        {
            char c= S.charAt(i);
			k%=size;
            if(Character.isDigit(c)){
				size =size/(c-'0');
			}
            else
            {
                if(k==0 ||k==size)
                    return Character.toString(c);
                else
                    size--;
            }
        }
        return null;
    }
}