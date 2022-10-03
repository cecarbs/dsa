package linkedLists;

import linkedLists.helper.LinkedListHelper;
import linkedLists.helper.ListNode;

/**
 * Given the head of a singly linked list and two integers left and right where left <= right,
 * reverse the nodes of the list from position left to position right, and return the reversed list.
 */

public class ReverseLinkedListII {

    public static void main(String[] args) {
        ListNode test_1 = createTest_1();
        ListNode test_2 = createTest_2();
        ListNode test_3 = createTest_3();


        solution(test_1, 2, 4);
        solution(test_2, 1, 1);
        solution(test_3, 1, 1);

    }

    private static ListNode solution(ListNode head, int left, int right) {
        ListNode tail = null;
        ListNode con = null;
        ListNode prev = null;
        ListNode curr = head;

        // In order to set this up we need to get curr to equal left where we will start the reverse
        // Once we get curr to left, add a pointer(con) where prev is and a pointer (tail) where curr is
        // This will be used later when we have to point con to the end of the reversed list (prev)
        // and tail to point to curr (it will be outside of the reverse)

        // this will set curr to the correct node, if left > 0, it will put it past
        while (left > 1) {
            prev = curr;
            curr = curr.next;
            left--;
            right--;
        }

        // At this point curr is at the first node that needs to be reversed, we can start reversing the list but we need to establish con and & tail
        con = prev;
        tail = curr;

        // this puts curr right past the last node, we need to keep track of curr
        while(right > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            right--;
        }

        // if con is at least the first node then we can point it to the correct node
        if (con != null) {
            con.next = prev;
        } else {
            // con might be nul since it's initially set to where prev is which could be null
            head = prev;
        }

        tail.next = curr;

        LinkedListHelper.printLinkedList(head);
        return head;
    }

    private static ListNode createTest_1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        return head;
    }

    private static ListNode createTest_2() {
        ListNode head = new ListNode(5);

        return head;
    }

    private static ListNode createTest_3() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(5);

        return head;
    }
}
