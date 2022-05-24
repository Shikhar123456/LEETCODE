package Leetcode;



// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
public class Majority {
    public static void main(String[] args) {
        Majority mj = new Majority();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int ans = mj.majorityElement(nums);
        System.out.println(ans);
    }

    public int majorityElement(int[] nums) {
        int cnt = 0;
        int ele = 0;
        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                ele = nums[i];
            }
            if (nums[i] == ele) {
                cnt += 1;
            } else {
                cnt -= 1;
            }
        }
        return ele;


    }
}
