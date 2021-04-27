public class p1_1_19 {
    public static void main(String[] args) {
        for (int i = 0; i < 20000; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
