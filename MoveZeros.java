class Solution {
    public void moveZeroes(int[] nums) {
        
        int left=0, right=0, temp;
        
        for(right=0; right<nums.length; right++)
        {
         
            if(nums[right]!=0)
            {
                temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }
            
        }
        
    }
}
