class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int k = 1;
        for(int i=1; i<nums.length; i++){
            int j = i-1;
            if(nums[i] != nums[j]){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}