class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        int i;
        
        List<Integer> arr = new ArrayList<Integer>();
        
        for(int n: nums)
        {
            n=Math.abs(n);
            if(nums[n-1]>0)
                nums[n-1]*=-1;
            else if(nums[n-1]<0)
                arr.add(n);
        }
return arr;        
    }
}
