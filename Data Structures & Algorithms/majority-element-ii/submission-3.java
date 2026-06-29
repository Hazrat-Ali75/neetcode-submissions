class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            int count = map.getOrDefault(nums[i],0)+1;
            map.put(nums[i], count);
            if(map.get(nums[i])>(n/3) && !list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        return list;
    }
}