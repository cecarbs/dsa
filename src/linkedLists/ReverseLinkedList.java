package linkedLists;

import linkedLists.helper.LinkedListHelper;
import linkedLists.helper.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode test_1 = createTest_1();

        solution(test_1);

    }

    private static ListNode solution(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        LinkedListHelper.printLinkedList(prev);

        return prev;
    }

    private static ListNode createTest_1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        return head;
    }
}

