package p1;

public class UnionFind {
    private int[] id;
    private int count;

    public UnionFind(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /** 在p和q之间添加一条链接 */
    void union(int p, int q) {

    }

    /** p所在分量的标识符 */
//    int find(int p) {
//
//    }

    /** 如果p和q存在于同一个分量中则返回true */
//    boolean connected(int p, int q) {
//        return find(p) == find(q);
//    }

    /** 连通分量的数量 */
    int count() {
        return count;
    }
}
