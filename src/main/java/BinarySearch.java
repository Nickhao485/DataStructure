public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int rank2(int key, int[] a) {
        return -1;
    }

    public static int rank2(int key, int[] a, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank2(key , a, lo, mid - 1);
        } else if (key > a[mid]) {
            return rank2(key, a, mid + 1, lo);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4 ,5};
        System.out.println(rank(3, arr));
    }
}
