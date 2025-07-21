/*
Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

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
        int i=1 , j=1;
    
    //Checking the first character
    if(name.charAt(0) != typed.charAt(0))
        return false;
    
    
    //Traversing the Strings using two pointer
    while(i<name.length() && j<typed.length()){
        if(name.charAt(i) == typed.charAt(j)){
            i++;
            j++;
        }
        
        else {  
            if(typed.charAt(j) == typed.charAt(j-1))
                j++;
            
            else
                return false;    
        }
    }
    
    
    //Case 1 : i and j both reached end of the String
    if(i == name.length() && j == typed.length())
        return true;
    
    //Case 2 : First word is not yet complete traversed. The second word is complete
    else if(i != name.length() && j == typed.length())
        return false;
    
    //Case 3: First word complete. The second word still has some characters left.
    else{
        while(j != typed.length()){
            if(typed.charAt(j) == typed.charAt(j-1))
                j++;
            
            else
                return false;
        }
    }
    return true;
    }
}
