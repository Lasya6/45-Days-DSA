class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int i;
        int[] counts = new int[k];
        
        int sum=0;
        
        for(int x: nums)
        {
            sum+=(x%k + k )%k;
            counts[sum%k]++;
        }
        int res=counts[0];
        
        for(int c: counts)
        {
         res += (c*(c-1))/2;
            
        }
        return res;
    }
}
