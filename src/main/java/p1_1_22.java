public class p1_1_22 {
    public static int binarySearch(int key, int[] a) {
        return binarySearch(key ,a, 0, a.length - 1);
    }

    public static int binarySearch(int key, int[] a, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;

        if (key < a[mid]) {
            return binarySearch(key, a, lo, hi -1);
        } else if (key > a[mid]) {
            return binarySearch(key, a, lo + 1, hi);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(binarySearch(6, a));
    }
}
