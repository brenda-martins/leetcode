package org.leetcode.weekOne;
//Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
// If target exists, then return its index. Otherwise, return -1.
//
// You must write an algorithm with O(log n) runtime complexity.
//
//    Example 1:
//
//        Input: nums = [-1,0,3,5,9,12], target = 9
//        Output: 4
//        Explanation: 9 exists in nums and its index is 4


public class BinarySearch {

    public static void main(String[] args) {

        var array = new int[]{-1, 0, 3, 5 , 9, 12};
        var target = 9;

        System.out.println("Outuput: " + search(array, target));
    }

    public static int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while (l <= r){

           var m = (r + l) / 2;

           if (target < nums[m]){
               r = m - 1;
           }else if(target > nums[m]) {
               l = m + 1;
           }else{
               return m;
           }
        }
        return -1;
    }
}
