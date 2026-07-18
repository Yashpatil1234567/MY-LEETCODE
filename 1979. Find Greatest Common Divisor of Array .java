class Solution {
    public int findGCD(int[] nums) {

        int small = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            small = Math.min(small, num);
            max = Math.max(max, num);
        }

        while (small != 0) {
            int temp = small;
            small = max % small;
            max = temp;
        }

        return max;
    }
}
