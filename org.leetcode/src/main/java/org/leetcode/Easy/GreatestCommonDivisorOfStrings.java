package org.leetcode.Easy;

// For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

// Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

// Example 1:

// Input: str1 = "ABCABC", str2 = "ABC"

// Output: "ABC"

// Example 2:

// Input: str1 = "ABABAB", str2 = "ABAB"

// Output: "AB"

// Example 3:

// Input: str1 = "LEET", str2 = "CODE"

// Output: ""

// Example 4:

// Input: str1 = "AAAAAB", str2 = "AAA"

// Output: ""​​​​​​​

 

// Constraints:

// 1 <= str1.length, str2.length <= 1000
// str1 and str2 consist of English uppercase letters.

public class GreatestCommonDivisorOfStrings {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC")); // ABC
        System.out.println(gcdOfStrings("ABABAB", "ABAB")); // AB
        System.out.println(gcdOfStrings("LEET", "CODE"));   // ""
        System.out.println(gcdOfStrings("AAAAAB", "AAA"));  // ""
    }


     public static String gcdOfStrings(String str1, String str2) {


        if(!str1.concat(str2)
             .equals(str2.concat(str1))
        ){
            return "";
        }

        int g = gdc(str1.length(), str2.length());


        return str1.substring(0, g);
    }

    public static int gdc(int a, int b){
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}
