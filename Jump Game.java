class Solution {
    public boolean canJump(int[] nums) {
        
        int i;
        int l = nums.length;
        int reachable=0;
        for(i=0; i<l; i++)
        {
            if(reachable < i)
            {
                return false;
            }
            reachable = Math.max(reachable, i+nums[i]);
        }
        return true;
        
    }
}
