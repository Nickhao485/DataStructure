package algorithm;

public class l86 {
    public static void main(String[] args) {
        ListNode l6 = new ListNode(2, null);
        ListNode l5 = new ListNode(5, l6);
        ListNode l4 = new ListNode(2, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(4, l3);
        ListNode l1 = new ListNode(1, l2);

        partition(l1, 3);
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode p = new ListNode(-1);
        ListNode p2 = new ListNode(-1);
        ListNode dummy = p;
        ListNode dummy2 = p2;
        ListNode h = head;

        while (h != null) {
            if (h.val < x) {
                p.next = h;
                p = p.next;
            } else {
                p2.next = h;
                p2 = p2.next;
            }
            h = h.next;
        }

        p2.next = null;
        p.next = dummy2.next;

        return dummy.next;
    }
}
