class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int area;
        for(int i=0; i<heights.length-1; i++){
            for(int j=i+1; j<heights.length; j++){
                int width = j-i;
                int height = Math.min(heights[i],heights[j]);
                area = width * height;
                if(area>max){
                    max = area;
                }
            }
        }
        return max;
    }
}
