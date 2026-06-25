/*
Leetcode problem -03

Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
       int[] freq = new int[256];
       int left =0;
       int right = 0;
       int maxLength=0;

       for(right = 0;right<s.length();right++){
        char ch = s.charAt(right);
        freq[ch]++;

        while(freq[ch]>1){
            freq[s.charAt(left)]--;
            left++;
        }
        maxLength=Math.max(maxLength,right-left+1);
       }
       return maxLength;
    }

}
