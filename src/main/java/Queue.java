public class Queue<Item> {
    class Node {
        Item item;
        Node next;
    }

    private Node first;
    private Node last;
    private int N;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        N++;
    }

    public Item dequeue() {
        Item firstItem = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        N--;
        return firstItem;
    }

    public Boolean find(Item key) {
        int i = N;
        for (int j = 0; j < i; j++) {
            Item item = first.item;
            if (!first.item.equals(key)) {
                first = first.next;
            } else {
                System.out.println(j);
                return true;
            }
        }
        return false;
    }

    public void reverse() {
        Node middle = null;

        while (first != null) {
            Node second = first.next;
            first.next = middle;
            middle = first;
            first = second;
        }
    }
}
