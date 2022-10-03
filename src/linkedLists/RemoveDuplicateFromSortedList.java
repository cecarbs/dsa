package linkedLists;

import linkedLists.helper.LinkedListHelper;
import linkedLists.helper.ListNode;

public class RemoveDuplicateFromSortedList  {

    public static void main(String[] args) {
        ListNode head_1 = createLinkedList();
        ListNode head_2 = createLinkedList_2();

        solution(head_1);
        solution(head_2);
    }

    private static ListNode solution(ListNode head) {
        // set two pointers one at the start and one after
        // can modify in place

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null) {
            if (slow.val == fast.val) {
                slow.next = fast.next;
                fast = fast.next;
            } else {
                slow = slow.next;
                fast = fast.next;
            }
        }
        LinkedListHelper.printLinkedList(head);
        return head;
    }

    private static ListNode createLinkedList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        return head;
    }

    private static ListNode createLinkedList_2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        return head;
    }
}
