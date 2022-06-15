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
        while (list1.next != null && list2 != null) {
            if (list2.val >= list1.val) {
                list1.next = list2;
            }
        }
        System.out.println(list1.toString());
        return list1;
    }
}
