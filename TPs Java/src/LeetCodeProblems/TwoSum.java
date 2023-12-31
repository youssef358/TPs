package LeetCodeProblems;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int reste = target - nums[i];
            if (mp.containsKey(reste)) {
                return new int[]{mp.get(reste), i};
            }
            mp.put(nums[i], i);
        }
        throw new IllegalArgumentException("No Solution");
    }
}
