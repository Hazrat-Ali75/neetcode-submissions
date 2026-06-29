class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int pre_sum = 0;
            for(int j=i; j<nums.length; j++){
                pre_sum += nums[j];
                if(pre_sum == k){
                    count++;
                }
            }
        }
        return count;
    } 
}