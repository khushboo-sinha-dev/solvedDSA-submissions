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
    public void reorderList(ListNode head) {
        ListNode newHead=new ListNode(-1);
        ListNode temp=newHead;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode prev=null;
        ListNode curr=slow.next;
        slow.next=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode a=head;
        ListNode b=prev;
        while(a!=null && b!=null){
            temp.next=a;
            a=a.next;
        }
        ListNode first=head;
        ListNode secondHalf=prev;
        while(secondHalf!=null){
            ListNode next1=first.next;
            ListNode next2=secondHalf.next;
            first.next=secondHalf;
            secondHalf.next=next1;
            first=next1;
            secondHalf=next2;
        }
    }
}
