public class p1_3_21 {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");
        queue.enqueue("e");
        Boolean result = queue.find("d");
        System.out.println(result);
    }
}
