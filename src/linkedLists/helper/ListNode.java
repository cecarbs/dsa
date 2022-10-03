package linkedLists.helper;

import java.util.StringJoiner;

public class ListNode {
     public int val;
     public ListNode next;
     public ListNode() {}
     public ListNode(int val) { this.val = val; }
     public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

     public static void printList(ListNode head) {
          StringJoiner sj = new StringJoiner(" -> ");
          while (head != null) {
               sj.add(String.valueOf(head.val));
               head = head.next;
          }
          System.out.println(sj);
     }

}
