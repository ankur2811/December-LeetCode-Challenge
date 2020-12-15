class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int i=0,j=0,c=0;
        nums[c++]=nums[0];
        for(int k=1;k<nums.length;k++)
        {
            if(nums[k]==nums[k-1])
            {
                j++;
                if(j-i<2)
                {
                    nums[c++]=nums[k];
                }
            }
            else
            {
                i=k;
                j=k;
                nums[c++]=nums[k];
            }
        }
        return c;
    }
}