class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int n=nums.length;
        

        return Math.max((nums[n-1] -1) * (nums[n-2]-1) , max ) ;
    }
}
