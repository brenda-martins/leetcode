package org.leetcode.weekOne;

import java.util.Stack;

public class ValidPalindrome {

    public static void main(String[] args) {

        System.out.println("It is a palindrome: " + isPalindrome("ada"));
    }

    public static boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <  s.length(); i++) {

            stack.push(s.charAt(i));
        }

        String palindrome = "";

        while (!stack.isEmpty()){
            palindrome += stack.pop();
        }

        if(palindrome.equalsIgnoreCase(s)){
            return true;
        }

        return false;
    }
}
