package Leetcode;

import java.util.HashMap;
import java.util.Map;

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

public class TwoSum {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {3, 3};
        int[] twoSum = ts.twoSum(nums, 7);
        for (int i = 0; i < twoSum.length; i++) {
            System.out.println(twoSum[i]);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            } else {
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
            }
        }

        return ans;

    }


}
