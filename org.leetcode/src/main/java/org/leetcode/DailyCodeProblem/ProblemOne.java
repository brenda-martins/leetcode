package org.leetcode.DailyCodeProblem;

import java.util.HashMap;



//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//
//  For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

public class ProblemOne {

    public static void main(String[] args) {
        var numbers = new int[]{10, 15, 3, 7};
        var k = 17;

        System.out.println(verify2(numbers, k));
    }

    public static boolean verify(int[] numbers, int k){
        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == k){
                    return true;
                }
            }
        }

        return false;
    }


    public static boolean verify2(int[] numbers, int k){
        var map = new HashMap<>();
        for (int number : numbers) {
            var diff = k - number;
            if (map.containsKey(diff)) {
                return true;
            }

            map.put(number, 1);
        }

        return false;
    }
}
