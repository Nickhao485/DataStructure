import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class p1_3_4 {
    public static void main(String[] args) throws IOException {
        Stack4<Character> stack = new Stack4<>();
        try (InputStream inputStream = new FileInputStream("src/main/resources/p1_3_4File.txt");) {
            int n;
            while ((n = inputStream.read()) != -1) {
                char str = (char) n;

                if (str == '[' || str == '{' || str == '(') {
                    stack.push(str);
                }
                if (!stack.isEmpty()) {
                    if (str == ']') {
                        Character item = stack.pop();
                        if (!item.equals('[')) {
                            System.out.println(str + " " + item +" false");
                            return;
                        }
                    } else if (str == ')') {
                        Character item = stack.pop();
                        if (!item.equals('(')) {
                            System.out.println(str + " " + item +" false");
                            return;
                        }
                    } else if (str == '}') {
                        Character item = stack.pop();
                        if (!item.equals('{')) {
                            System.out.println(str + " " + item +" false");
                            return;
                        }
                    }
                }
            }
            System.out.println(true);
        }
    }
}

class Stack4<Item> {
    class Node {
        Item item;
        Node next;
    }
    private int N;
    private Node first;

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
        if (isEmpty()) {
            first = null;
        } else {
            first = first.next;
        }
        N--;
        return item;

    }
}
