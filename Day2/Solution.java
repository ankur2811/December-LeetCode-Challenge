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

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
     private ListNode head;
    private ListNode curr;
    public Solution(ListNode head) {
         this.head = head;
        this.curr = head;
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
         int rand = (int) (Math.random() * 100) + 1;
        
        while (--rand >= 0) {
            if (curr.next == null) {
                curr.next = head;
            }
            
            curr = curr.next;
        }
        
        return curr.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */