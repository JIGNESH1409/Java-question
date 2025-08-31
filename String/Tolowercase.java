/*
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 

Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely"
*/
class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder(); // also return s.tolowerCase() works but this solution is without using this function 
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){// 65-"A" && 90-"z" can also write >='A' and <='Z' 
                result.append( (char) (s.charAt(i) +32 ));
            }
            else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
