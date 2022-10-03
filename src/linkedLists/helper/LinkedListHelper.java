package linkedLists.helper;

import java.util.StringJoiner;

public class LinkedListHelper {

    public static void printLinkedList(ListNode head) {
        StringJoiner sj = new StringJoiner(" -> ");
        while (head != null) {
            sj.add(String.valueOf(head.val));
            head = head.next;
        }

        System.out.println(sj);
    }
}
