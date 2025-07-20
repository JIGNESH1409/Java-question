/*Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

 

Example 1:

Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.
Example 2:

Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it was not in the typed output.
  */
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int len1 = name.length();
        int len2 = typed.length();
        int l1 = 0;
        int l2 = 0;
        while(l2 < len2){
            if(l1 < len1 && name.charAt(l1) == typed.charAt(l2)){
                l1++;
            }else if(l2 == 0 || typed.charAt(l2) != typed.charAt(l2 - 1)){
                return false;
            }
            l2++;
        }
        return l1 == len1;
    }
}
