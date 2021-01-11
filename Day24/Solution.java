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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;
        return swap(head);
    }
    public ListNode swap(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        ListNode temp=swap(head.next.next);
        ListNode temp1=head.next;
        head.next=temp;
        temp1.next=head;
        return temp1;
    }
}