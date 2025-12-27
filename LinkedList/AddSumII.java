/**

LEETCODE:-445
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
    public ListNode reverseList(ListNode head) {

      ListNode pres = head;
      ListNode prev = null;

      while(pres!=null){
        ListNode Next = pres.next;
        pres.next=prev;
        prev=pres;
        pres=Next;
      }
      return prev;
    }
}
