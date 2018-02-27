package Algorithms.Sorting.Chap21;

import Algorithms.Stdlib.StdDraw;
import Algorithms.Stdlib.StdRandom;

public class Function {
    public static void randomArray() {
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform();
        }
        for (int i = 0; i < N; i++) {
            double x = 1.0*i/N;
            double y = a[i]/2.0;
            double rw = 0.5/N;
            double rh = a[i]/2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
    public static void func() {
        int N = 10000;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N*N);
        StdDraw.setPenRadius(.01);
        for (int i = 1; i <= N; i++) {
            StdDraw.point(i, i);
            StdDraw.point(i, i*i);

        }
    }

    public static void main(String[] args) {
        randomArray();
//        func();
    }
}
