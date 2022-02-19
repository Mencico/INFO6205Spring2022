import java.util.HashSet;

public class Q9 {

     // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    class Solution {
        public int numComponents(ListNode head, int[] nums) {
            HashSet<Integer> hs = new HashSet<>();

            for(int i: nums)
                hs.add(i);

            int connected_components = 0;

            ListNode curr = head;

            while(curr != null){
                if(hs.contains(curr.val)){
                    ListNode temp = curr;
                    while(temp != null && hs.contains(temp.val))
                        temp = temp.next;

                    connected_components++;

                    if(temp == null)
                        return connected_components;

                    curr = temp.next;
                }
                else
                    curr = curr.next;
            }
            return connected_components;
        }
    }
}
