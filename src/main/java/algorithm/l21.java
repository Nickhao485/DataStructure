package algorithm;

public class l21 {
    public static void main(String[] args) {
        ListNode l3 = new ListNode(4, null);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        ListNode r3 = new ListNode(4, null);
        ListNode r2 = new ListNode(3, r3);
        ListNode r1 = new ListNode(1, r2);

        mergeTwoLists(l1, r1);
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        ListNode p1 = list1, p2 = list2;

        while (p1 != null && p2 != null) {
            if (p1.val > p2.val) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p1;
                p1 = p1.next;
            }
            p = p.next;
        }

        if (p1 != null) {
            p.next = p1;
        }

        if (p2 != null) {
            p.next = p2;
        }

        return dummy.next;
    }
}
