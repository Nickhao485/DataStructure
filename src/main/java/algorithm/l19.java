package algorithm;

public class l19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p1 = head;

        for (int i = 0; i < n + 1; i++) {
            p1 = p1.next;
        }
        ListNode p2 = head;

        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        p2.next = p2.next.next;
        return dummy.next;
    }
}
