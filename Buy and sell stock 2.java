class Solution {
    public int maxProfit(int[] prices) {
        
        int i,l, maxp=0;
        l=prices.length;
        
        for(i=1; i<l; i++)
        {
            if(prices[i]>prices[i-1])
                maxp+=prices[i]-prices[i-1];
        }   
        return maxp;
    }
}
