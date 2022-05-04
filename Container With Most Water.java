class Solution {
    public int maxArea(int[] height) {
        
        int i, max=0, minh;
        
        int l=0, r=height.length-1;
        
        while(l<r)
        {
            int lh=height[l];
            int rh = height[r];
            minh = Math.min(lh, rh);
            max = Math.max(max, minh*(r-l));
            
            if(lh<rh)
                l++;
            else
                r--;
        }
        return max;
        
    }
}
