class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int output = 0;
        int left = 0, right = height.length-1;
        while(left<right){
            output = Math.max(output, (right-left)*Math.min(height[left], height[right]));
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return output;
    }
}