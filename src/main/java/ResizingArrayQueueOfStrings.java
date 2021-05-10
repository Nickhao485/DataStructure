public class ResizingArrayQueueOfStrings {
    private String[] a;
    private int N;
    private int first;
    private int last;

    public ResizingArrayQueueOfStrings(int cap) {
        a = new String[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void enqueue(String item) {
        if (N == a.length) {
            resize(2 * a.length);
        }
        N++;
        a[last++] = item;
    }

    public String dequeue() {
        if (isEmpty()) {
            throw new RuntimeException(N + " " + first + " " + last);
        }

        String item = a[first];
        a[first] = null;
        first++;
        N--;

        if (N == a.length / 4) {
            resize(a.length / 2);
        }

        return item;
    }

    private void resize(int cap) {
        String[] newArr = new String[cap];
        for (int i = 0; i < N; i++) {
            newArr[i] = a[first + i];
        }
        first = 0;
        last = N;
        a = newArr;
    }

    public String toString() {
        for (String str : a) {
            System.out.print(str + " ");
        }
        return "";
    }
}
