package org.leetcode.weekOne;

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

         var listNode = mergeTwoLists(list1, list2);

        System.out.println("Solution One");
        while(listNode.next != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

        var listNodeSolutionTwo = mergeTwoListsSolutionTwo(list1, list2);

        System.out.println("Solution two");
        while(listNodeSolutionTwo.next != null) {
            System.out.println(listNodeSolutionTwo.val);
            listNodeSolutionTwo = listNodeSolutionTwo.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while(list1 != null && list2 != null){

            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        if(list1 != null){
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }

         return dummy.next;
    }

    private static ListNode mergeTwoListsSolutionTwo(ListNode list1, ListNode list2){
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        var restNode = new ListNode();

        if(list1.val > list2.val){
            restNode.val = list2.val;
            list2 = list2.next;
        }else{
            restNode.val = list1.val;
            list1 = list1.next;
        }

        var lastNode = restNode;

        while(list1 != null && list2 != null){

            var nowNode = new ListNode();

            if(list1.val > list2.val){
                nowNode.val = list2.val;
                list2 = list2.next;
            }else{
                nowNode.val = list1.val;
                list1 = list1.next;

            }

            lastNode.next = nowNode;
            lastNode = nowNode;
        }

        if(list1 != null){
            lastNode.next = list1;
        }else{
            lastNode.next = list2;
        }

        return  restNode;
    }

}


  class ListNode {
     int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

  }

