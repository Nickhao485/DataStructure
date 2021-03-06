import java.util.Iterator;

public class Stack<Item> {
    private Node first;
    private int N;
    class Node {
        private Item item;
        private Node next;

        Node() {
        }

        Node(Node x) {
            item = x.item;
            if (first != null) {
                next = new Node(x.next);
            }
        }
    }
    Stack() {

    }
    Stack(Stack<Item> s) {
        first = new Node(s.first);
    }
    public boolean isEmpty() {
        return first == null;
    }
    public int size() {
        return N;
    }
    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }
    public Item pop() {
        Item item = first.item;
        first = first.next;
        --N;
        return item;
    }

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }
    class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;

        public boolean hasNext() {
            return i > 0;
        }

        public Item next() {
            --i;
            return first.next.item;
        }
    }

    public static void copy(Stack<String> stack) {
        Stack<String> newStack = new Stack<>();

    }
}
