package linkedLists;

import linkedLists.helper.ListNode;

import java.util.StringJoiner;

/**
 * You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.
 *
 * The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing,
 * where ⌊x⌋ denotes the largest integer less than or equal to x.
 *
 * For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
 */

public class DeleteTheMiddleNodeOfALinkedList {

    public static void main(String[] args) {
        ListNode odd = createListNode_odd();
        ListNode even = createListNode_even();
        ListNode two = createListNode_twoNodes();

        solution(odd);
    }

    private static ListNode solution(ListNode head) {
        if (head.next == null) {
            return head.next;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null) {
            if (fast.next == null) {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        // now slow is at the middle so rearrange pointers
        ListNode dummy = head;
        while (dummy.next != slow) {
            dummy = dummy.next;
        }

        dummy.next = slow.next;

        System.out.println(slow.next.val);
        System.out.println("=========");
        return head;
    }

    private static ListNode createListNode_odd() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(6);

        return head;
    }

    private static ListNode createListNode_even() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        return head;
    }

    private static ListNode createListNode_twoNodes() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);

        return head;
    }

}
