package Leetcode;

public class SingleNumber {

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int[] nums = {2, 2, 4, 1, 1};
        System.out.println(sn.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans ^= nums[i];
        }


        return ans;
    }

}
