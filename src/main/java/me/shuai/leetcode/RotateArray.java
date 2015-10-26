package me.shuai.leetcode;

/**
 * Created by Shuai Zhang on 10/25/15.
 */
public class RotateArray {
    public class Solution {
        public void rotate(int[] nums, int k) {
            int length = nums.length;
            if (k % length == 0) {
                return;
            }

            if (k > length) {
                k = k % length;
            }

            mirror(nums, 0, length - k - 1);
            mirror(nums, length - k, length - 1);
            mirror(nums, 0, length - 1);
        }

        private void mirror(int[] nums, int start, int end) {
            while (start < end) {
                int temp;
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }
}
