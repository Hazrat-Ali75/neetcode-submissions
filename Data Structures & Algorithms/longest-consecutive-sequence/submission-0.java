class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        Set<Integer> s = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            s.add(nums[i]);
        }

        int longest_streak = 0;
        for(int num : s){
            if(!s.contains(num-1)){
                int current_num = num;
                int current_streak = 1;
                while(s.contains(current_num+1)){
                   current_num++;
                   current_streak++;
                }
                longest_streak = Math.max(longest_streak, current_streak);
            }
        }
        return longest_streak;
    }
}