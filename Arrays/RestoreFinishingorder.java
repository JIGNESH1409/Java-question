/*
You are given an integer array order of length n and an integer array friends.

order contains every integer from 1 to n exactly once, representing the IDs of the participants of a race in their finishing order.
friends contains the IDs of your friends in the race sorted in strictly increasing order. Each ID in friends is guaranteed to appear in the order array.
Return an array containing your friends' IDs in their finishing order.

 

Example 1:

Input: order = [3,1,2,5,4], friends = [1,3,4]

Output: [3,1,4]

Explanation:

The finishing order is [3, 1, 2, 5, 4]. Therefore, the finishing order of your friends is [3, 1, 4].

Example 2:

Input: order = [1,4,5,3,2], friends = [2,5]

Output: [5,2]

Explanation:

The finishing order is [1, 4, 5, 3, 2]. Therefore, the finishing order of your friends is [5, 2].
*/

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
       int[] result = new int[friends.length];
       int k=0;
       
       for(int i=0;i<order.length;i++){
         int index= Binarysearch(friends,order[i]); //done binary search as the freind array will always be sorted if it's not sorted try another method eg:bruteforce or mapping
         if(index<0) continue;
         result[k]=friends[index];
         k++;
       }
       return result;
    
    }
    public int Binarysearch(int[] friends,int target){
        int start=0;
        int end=friends.length-1;
        

        while(start<=end){
             int mid=start+(end-start)/2;
            if(target==friends[mid]) return mid;
            if(friends[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
