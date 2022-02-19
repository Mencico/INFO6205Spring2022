public class Q10 {

     // Definition for singly-linked list.
      public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }



    class Solution {
        public ListNode getMidNode(ListNode head){
            ListNode slow = head, fast = head;
            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        public ListNode reverseList(ListNode head){
            ListNode curr = head, prev = null, next = null;
            while(curr!= null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
        public int pairSum(ListNode head) {
            ListNode midNode = getMidNode(head);
            ListNode nHead = midNode.next;
            midNode.next = null;
            nHead = reverseList(nHead);
            ListNode c1 = head;
            ListNode c2 = nHead;
            int max = Integer.MIN_VALUE;
            while(c1 != null){
                max = Math.max(c1.val+c2.val, max);
                c1 = c1.next;
                c2 = c2.next;
            }
            nHead = reverseList(nHead);
            midNode.next = nHead;
            return max;
        }
    }

}
