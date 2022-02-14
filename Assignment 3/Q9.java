import java.util.Stack;

public class Q9 {

      //Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    class Solution {
        public int[] nextLargerNodes(ListNode head) {
            ListNode prev = null;
            int n = 0;

            while(head!=null) {
                ListNode next = head.next;
                head.next = prev;
                prev = head;
                head = next;
                n++;
            }

            head = prev.next;
            int[] arr = new int[n];
            arr[n-1] = 0;
            Stack<Integer> stack = new Stack<>();
            stack.push(prev.val);

            for(int i=n-2; i>=0; i--) {
                if(head.val >= prev.val) {
                    while(!stack.isEmpty() && head.val >= stack.peek())
                        stack.pop();

                    arr[i] = stack.isEmpty() ? 0 : stack.peek();
                } else {
                    stack.push(prev.val);
                    arr[i] = stack.peek();
                }
                prev = head;
                head = head.next;
            }

            return arr;
        }
    }
}
