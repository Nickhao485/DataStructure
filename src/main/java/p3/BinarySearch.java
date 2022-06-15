package p3;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi-lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

//    public static int rank2(int key, int lo, int hi) {
//        if (hi < lo) return lo;
//        int mid = lo + (hi - lo) / 2;
//        int cmp = key.compareTo(keys[mid])
//        if (cmp < 0) return rank(key, lo, mid - 1);
//        else if (cmp > 0) return rank(key, mid + 1, hi);
//        else return mid;
//    }

    public static void main(String[] args) {
        int[] whitelist = {5,1,2,4,3};
        Arrays.sort(whitelist);
        int res = rank(2, whitelist);
        StdOut.print(res);
    }
}
