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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2 == null)return null;
        if(list1==null)return list2;
        if(list2==null)return list1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(list1!=null){
            ans.add(list1.val);
            list1 = list1.next;
        }
        while(list2!=null){
            ans.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(ans);
        ListNode head = new ListNode(ans.get(0));
        ListNode temp = new ListNode(ans.get(1)); 
        head.next = temp;
        temp.next=null;
        int i =2;
        while(i<ans.size()){
            ListNode curr = new ListNode(ans.get(i));
            temp.next = curr;
            temp = curr;
            i++;
        }
        return head;
    }
}
