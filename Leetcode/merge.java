package Leetcode;

// 1,2,2 3
// Input: nums1 = [1,2,3,0,5,6], m = 3, nums2 = [2,5,6], n = 3
// p i q
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
public class merge {
    public static void main(String[] args) {
        merge mr = new merge();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        mr.merge(nums1, m, nums2, n);


    }
    // [0]
    // p i
    // [1]
    // q

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m - 1;
        int q = n - 1;
        int i = m + n - 1;
        while (q >= 0) {
            if (p >= 0 && nums2[q] < nums1[p]) {
                nums1[i] = nums1[p];
                p -= 1;
                i -= 1;

                nums1[i] = nums2[q];
                q -= 1;
                i -= 1;
            } else {
                nums1[i] = nums2[q];
                q -= 1;
                i -= 1;
            }
        }
        for (int j = 0; j < nums1.length; j++) {
            System.out.println(nums1[j]);
        }


    }
}
