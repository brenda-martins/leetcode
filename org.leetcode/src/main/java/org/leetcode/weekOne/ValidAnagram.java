package org.leetcode.weekOne;
import java.util.Arrays;
import java.util.HashMap;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once.


public class ValidAnagram {

    public static void main(String[] args) {

        var s = "anagram";
        var t = "nagaram";

        System.out.println("[FIRST SOLUTION]Is an anagram? " + isAnagram(s, t));

        isAnagramSecondSolution(s, t);

        System.out.println("[SECOND SOLUTION]Is an anagram? " + isAnagramSecondSolution(s, t));
    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return  false;

        var sMap = new HashMap<Character, Integer>();
        var tMap = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++){

            var sChar = s.charAt(i);
            var sTotal = sMap.get(sChar) != null ? sMap.get(sChar) + 1 : 1 ;

            var tChar = t.charAt(i);
            var tTotal = tMap.get(tChar) != null ? tMap.get(tChar) + 1 : 1;

            sMap.put(sChar, sTotal);
            tMap.put(tChar, tTotal);
        }

      for (Character c : sMap.keySet()){
          if(!sMap.get(c).equals(tMap.get(c))){
              return  false;
          }
      }

        return true;
    }

    public static boolean isAnagramSecondSolution(String s, String t) {

       if(s.length() != t.length()) return false;

       var sArray = s.toCharArray();
       var tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

       return Arrays.equals(sArray, tArray);
    }
}
