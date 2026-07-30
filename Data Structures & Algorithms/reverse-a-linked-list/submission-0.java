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
    public ListNode reverseList(ListNode head) {
        if(head==null)return null;
        Stack<ListNode>st= new Stack<>();
        ListNode curr=head;
        while(curr!=null){
            st.push(curr);
            curr=curr.next;
        }
        ListNode newHead=st.pop();
        curr=newHead;
        while(!st.isEmpty()){
           curr.next=st.pop();
           curr=curr.next;
        }
        curr.next=null;
        return newHead;
    }
}
