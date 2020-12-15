class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] arr=new int[60];
        for(int i=0;i<time.length;i++)
        {
           arr[time[i]%60]++;
        }
        int count=0;
       
     
        for(int i=1;i<30;i++)
            count+=arr[i]*arr[60-i];
      count+=sumOfN(arr[0]-1) + sumOfN(arr[30]-1);

        return count;
    }
    int sumOfN(int n){
		return n*(n+1)/2;
	}
}