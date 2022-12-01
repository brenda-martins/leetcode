package org.leetcode.weekOne;

import java.util.Stack;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println("[First solution] It is a palindrome: " + isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("[Second solution] It is a palindrome: " + isPalindromeSolutionTwo("A mana, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {

        final var string = removeNonAlphanumeric(s).toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <  string.length(); i++) {
            stack.push(string.charAt(i));
        }

        String palindrome = "";

        while (!stack.isEmpty()){
            palindrome += stack.pop();
        }

        if(palindrome.equalsIgnoreCase(string)){
            return true;
        }
        return false;
    }


    public static boolean isPalindromeSolutionTwo(String s) {
        final var string = removeNonAlphanumeric(s).toLowerCase();

        var l = 0;
        var r = string.length() - 1;

        while(l < r){
            if (string.charAt(l) != string.charAt(r))  return false;
            l++;
            r--;
        }
        return true;
    }
    private static String removeNonAlphanumeric(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "");
    }
}
