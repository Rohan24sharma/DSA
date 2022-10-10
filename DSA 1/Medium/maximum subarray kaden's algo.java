class Solution {
    public int maxSubArray(int[] nums) {
        int cSum = 0;
        int max_sum = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(cSum <0){
                cSum = 0;
            }
            cSum += nums[i];
            max_sum = Math.max(max_sum,cSum);
        }
        return max_sum;
        
    }
}
