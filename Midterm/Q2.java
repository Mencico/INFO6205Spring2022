public class Q2 {

     // Definition for singly-linked list.
      public class ListNode {
        int val;
          ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    public class Solution{
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int carry = 0;
            ListNode dummy = new ListNode(0);
            ListNode cur = dummy;
            while (l1 != null || l2 != null) {
                int a = (l1 == null)? 0: l1.val;
                int b = (l2 == null) ?0: l2.val;
                int sum = a + b + carry;
                carry = sum /10;
                cur.next = new ListNode(sum % 10);
                cur = cur.next;
                if (l1 != null) l1 = l1.next;
                if(l2!=null) l2 = l2.next;
            }
            if (carry > 0) cur.next = new ListNode(1);
            return dummy.next;
        }
    }
}
