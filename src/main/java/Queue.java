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

    public void showQueue() {

    }
}
