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
    public ListNode deleteMiddle(ListNode head) {
        ListNode newHead = head;
        ListNode slow = new ListNode(0);
        slow.next = head;
        ListNode prev = slow;
        ListNode fast = head;
        if(head == null){
            return null;
        }
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return prev.next;
    }
    }