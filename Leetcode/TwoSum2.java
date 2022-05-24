package Leetcode;

public class TwoSum2 {
    public static void main(String[] args) {
        TwoSum2 ts2 = new TwoSum2();
        int[] numbers = {2, 7, 11, 15};
        int[] A = ts2.twoSum(numbers, 9);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        // Using 2 Pointer algorithm
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                ans[0] = left + 1;
                ans[1] = right + 1;
                break;
            } else if (numbers[left] + numbers[right] > target) {
                right -= 1;
            } else {
                left += 1;
            }
        }
        return ans;

    }

}



// {2,7,11,15}
