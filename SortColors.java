class Solution {
    public void sortColors(int[] nums) {
        int lo=0, mid=0, high=nums.length-1;
        
        while(mid <= high)
        {
            switch(nums[mid])
            {
                case 0:
                    {
                        swap(nums, mid, lo);
                        lo++;mid++;
                        break;
                    }
                case 1:
                    {
                        mid++;break;
                    }
                case 2:
                    {
                        swap(nums, mid, high);
                        high--;
                        break;
                    }
            }
        }
        
    }
    public void swap(int[] nums, int t1, int t2)
    {
        int temp;
        temp=nums[t1];
        nums[t1]=nums[t2];
        nums[t2]=temp;
    }
}
