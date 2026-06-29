class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int count1=0, count2=0;
        int ele1=0, ele2=0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(count1 == 0 && nums[i]!=ele2){
               count1++;          
               ele1 = nums[i];   
            }else if(count2 == 0 && nums[i]!=ele1){
               count2++;        
               ele2 = nums[i];  
            }else if(ele1 == nums[i]){
                count1++;
            }else if(ele2 == nums[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        int cnt1=0;
        int cnt2=0;
        for(int i=0; i<n; i++){
            if(nums[i]==ele1) cnt1++;
            if(nums[i]==ele2) cnt2++;
        }
        if(cnt1>= (n/3 +1)){
            list.add(ele1);
        }
        if(cnt2>= (n/3 +1)){
            list.add(ele2);
        }
        return list;
    }
}