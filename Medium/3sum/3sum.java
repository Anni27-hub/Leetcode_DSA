/*
Problem Name: 3sum
Difficulty: Medium
URL: https://leetcode.com/problems/3sum/submissions/2132168388/
Submitted Date: 2026-09-05
Repository: Anni27-hub/Leetcode_DSA
*/

class Solution {//Function to find triplets having sum equals to target
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> tripletSet = new HashSet<>();// Set to store unique triplets
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        // Found a triplet that sums up to target
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        /* Sort the triplet to ensure uniqueness when storing in set*/
                        Collections.sort(temp);
                        tripletSet.add(temp);
                    }
                }
            }
        }
        // Convert set to list of lists (unique triplets)
        List<List<Integer>> ans = new ArrayList<>(tripletSet);
        return ans;
    }
}
