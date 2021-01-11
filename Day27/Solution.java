class Solution {
    public int minJumps(int[] arr) {
        int n=arr.length;
       ArrayList[] graph=new ArrayList[arr.length];
        for(int i=0;i<n;i++)
            graph[i]=new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
                hm.get(arr[i]).add(i);
            else
            {
                hm.put(arr[i],new ArrayList<>());
                 hm.get(arr[i]).add(i);
            }
        }
         
        
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                graph[i].add(i+1);
            }
            else if(i==n-1)
                graph[i].add(i-1);
            else
            {
                graph[i].add(i+1);
                graph[i].add(i-1);
            }
            
           /* if(hm.containsKey(arr[i]))
            {
                int m=hm.get(arr[i]).size();
                for(int j=0;j<m;j++)
                {
                    int k=hm.get(arr[i]).get(j);
                    if(k!=i && k!=i-1 && k!=i+1)
                        graph[i].add(k);
                }
                hm.remove(arr[i]);
            }*/
        }
        
     
        boolean[] vis=new boolean[n];
        int d=0;
        int src=0;
        Queue<Integer> qu=new ArrayDeque<>();
        qu.add(src);
        int c=0;
        while(qu.size()>0)
        {
            int s=qu.size();
            
            while(s-->0)
            {
            int sr=qu.poll();
            vis[sr]=true;
           
            if(sr==n-1)
              return d;
            
            int m=graph[sr].size();
            for(int i=0;i<m;i++)
            {
                int j=(int)graph[sr].get(i);
                if(!vis[j]){
                    qu.add(j);
                    vis[j]=true;}
            }
                   if(hm.containsKey(arr[sr]))
            {
                int ms=hm.get(arr[sr]).size();
                for(int j=0;j<ms;j++)
                {
                    int k=hm.get(arr[sr]).get(j);
                    if(k!=sr && !vis[k])
                        qu.add(k);
                }
                hm.remove(arr[sr]);
            }
                graph[sr].clear();
            }
             d++;
        }
        return d;
    }
}