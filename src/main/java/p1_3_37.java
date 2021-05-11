public class p1_3_37 {
    public static void main(String[] args) {
        int N = 10;
        int M = 3;
        Queue queue = new Queue();

        for (int i = 0; i < N; i++) {
            queue.enqueue(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < M - 1; i++) {
                queue.enqueue(queue.dequeue());
            }
//            System.out.print(queue.dequeue());
        }
    }
}
