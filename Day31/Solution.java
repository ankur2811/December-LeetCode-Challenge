class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int max=0;
        int w=0;
        for(int i=0;i<heights.length;i++)
        {
            while(st.peek()!=-1 && heights[st.peek()]>heights[i])
            {
                int idx=st.pop();
                w=i-st.peek()-1;
                max=Math.max(max,w*heights[idx]);
                
            }
            st.push(i);
        }
           
        while(st.peek()!=-1)
        {
             int idx=st.pop();
                w=heights.length-st.peek()-1;
                max=Math.max(max,w*heights[idx]);
            
        }
        return max;
    }
}