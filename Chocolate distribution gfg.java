class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        
        Collections.sort(a);
        long min=1000000001;
        
        long i;
        
        for(i=0; i+m-1<n; i++)
        {
            int point=(int)(i+m);
            long d = a.get((int)point-1)-a.get((int)i);
            
            if(d<min)
              min=d;
        }
        return min;
    }
}
