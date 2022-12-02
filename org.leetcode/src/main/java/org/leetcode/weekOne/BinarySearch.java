package org.leetcode.weekOne;

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
