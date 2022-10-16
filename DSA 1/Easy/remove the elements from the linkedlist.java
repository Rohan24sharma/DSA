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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)return null;
        while(head.val == val){
            if(head.next == null)return null;
             head = head.next;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr!=null){
            if(curr.val == val){
                curr = curr.next;
                prev.next = curr;
            }
            else{
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
