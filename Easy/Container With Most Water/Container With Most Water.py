/*
Problem Name: Container With Most Water
Difficulty: Easy
URL: https://leetcode.com/problems/container-with-most-water/submissions/2132161924/
Submitted Date: 2026-09-05
Repository: Anni27-hub/Leetcode_DSA
*/

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0, left = 0, right = height.length - 1;
        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;        
    }
}
