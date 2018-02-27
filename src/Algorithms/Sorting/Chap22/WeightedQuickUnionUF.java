package Algorithms.Sorting.Chap22;
import Algorithms.Stdlib.*;
public class WeightedQuickUnionUF {
    private int[] id;
    private int count;
    private int[] sz;
    public WeightedQuickUnionUF(int N) {
        count = N;
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }
    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        while (p != id[p]) p = id[p];
        return p;
    }

    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (i == j) return;
        //小树的根节点连接到大树的根节点
        if (sz[i] < sz[j]) {id[i] = j; sz[j] += sz[i];}
        else               {id[j] = i; sz[i] += sz[j];}
        count--;
    }
    public static void main(String[] args) {
        Stopwatch timer = new Stopwatch();
        int N = StdIn.readInt();
        QuickUnion uf = new QuickUnion(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + "components");
        double time1 = timer.elapsedTime();
        System.out.printf("total (%.2f seconds)\n", time1);
    }
}
