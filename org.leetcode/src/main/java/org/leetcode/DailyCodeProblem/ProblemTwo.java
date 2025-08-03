package org.leetcode.DailyCodeProblem;

import java.util.HashMap;

public class ProblemTwo {

//    Given an array of integers, return a new array such that each element at index i
//    of the new array is the product of all the numbers in the original array except the one at i.

//    For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
//    If our input was [3, 2, 1], the expected output would be [2, 3, 6]


    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5 };

        for (int n: productNumbers2(numbers)) {
            System.out.println(n);
        }
    }

    public  static int[] productNumbers(int[] numbers){
        int[] array = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            var sum = 1;
            for (int number : numbers) {
                if(number != numbers[i]){
                    sum = sum * number;
                }
            }

            array[i] = sum;
        }

        return  array;
    }

    public  static int[] productNumbers2(int[] numbers){
        int n = numbers.length;
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        int[] result = new int[n];

        // numbers      = [1, 2, 3, 4, 5]
        // leftProducts = [1, 1, 2, 6, 24]
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * numbers[i - 1]; // 1, 1, 2, 6, 24
        }

        // numbers       = [1, 2, 3, 4, 5]
        // rightProducts = [120, 60, 20, 5, 1]
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * numbers[i + 1];
        }

        // leftProducts  = [1, 1, 2, 6, 24]
        // rightProducts = [120, 60, 20, 5, 1]
        // result        = [120, 60, 40, 30, 24]
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
    }
}
