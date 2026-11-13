package org.leetcode.Medium;

// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
// You must write an algorithm that runs in O(n) time and without using the division operation.

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

// Constraints:

// 2 <= nums.length <= 105
// -30 <= nums[i] <= 30
// The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.

// Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.err.println(productExceptSelf2(arr));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int mult = 1;
            var pos = i;

            for (int x = 0; x < nums.length; x++) {
                if (x != pos) {
                    mult = mult * nums[x];
                }
            }
            answer[pos] = mult;
        }

        return answer;
    }

    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        int prefix = 1;

        for (int i = 0; i < n; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    }
}
