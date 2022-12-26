package org.leetcode.weekOne;

public class LinkedListCycle {


    public boolean hasCycle(ListNode head) {
        var s = head;
        var f = head;

        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;

            if(s == f) return true;
        }
        return false;
    }

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
