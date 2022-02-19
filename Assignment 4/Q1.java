public class Q1 {

     //Definition for singly-linked list.
     public class ListNode {
         int val;
         ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }



    class Solution {
        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
            ListNode cur=list1,cur2=list1;
            b++;
            while(b--!=0)
                cur = cur.next;
            a--;
            while(a--!=0)
                cur2 = cur2.next;
            cur2.next=list2;
            while(cur2.next!=null)
                cur2 = cur2.next;
            cur2.next = cur;
            return list1;
        }
    }
}
