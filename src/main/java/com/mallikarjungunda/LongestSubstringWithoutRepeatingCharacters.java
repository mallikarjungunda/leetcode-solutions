package com.mallikarjungunda;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "pwkwew";
        System.out.println(maxLengthOfSubString(str));
        System.out.println(maxLengthOfSubString2(str));
    }

    private static int maxLengthOfSubString(String str) {
        int result = 0;
        for (int i=0; i < str.length(); i ++){
            Set<Character> chatSet = new HashSet<>();
            for (int j=i; j<str.length(); j++){
                System.out.println("Char :::: " + str.charAt(j));
                if(chatSet.contains(str.charAt(j))){
                    break;
                }
                chatSet.add(str.charAt(j));
            }
            System.out.println(chatSet);
            result = Math.max(result, chatSet.size());
        }
        return result;
    }


    private static int maxLengthOfSubString2(String s){
        int[] lastSeen = new int[128];
        int left = 0;
        int maxLength = 0;

        for (int right=0; right<s.length();right++) {
            char ch = s.charAt(right);

            left=Math.max(left,lastSeen[ch]);

            maxLength=Math.max(maxLength,right-left+1);

            lastSeen[ch]=right+1;
        }

        return maxLength;
    }
}
