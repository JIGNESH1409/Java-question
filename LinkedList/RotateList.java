/*
Given the head of a linked list, rotate the list to the right by k places.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:


Input: head = [0,1,2], k = 4
Output: [2,0,1]
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        ListNode temp =head;
        int length=1;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        int pos=k%length;
        if(pos==0){
            return head;
        }
        ListNode current=head;
        for(int i=0;i<length-pos;i++){
            current=current.next;
        }
        ListNode newhead=current.next;
        current.next=null;
        temp.next=head;
        return newhead;
    }
}
