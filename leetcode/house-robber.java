// https://leetcode.com/problems/house-robber/submissions/1071712706/
class Solution {
    public int rob(int[] nums) {
        int maxAmount = nums[0];
        int prevMaxAmount = 0;
        for (int i = 1; i < nums.length; i++) {
            int temp = maxAmount;
            maxAmount = Math.max(maxAmount, prevMaxAmount + nums[i]);
            prevMaxAmount = temp;
        }
        return maxAmount;
    }

}