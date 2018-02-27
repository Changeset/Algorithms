package Recursion;

import java.util.Scanner;

public class gcd {
    static Scanner scanner;
    public static int gcd1(int p, int q) {
        if (q == 0) return p;
        else return gcd1(q, p % q);
    }

    public static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println("gcd1: " + gcd1(m, n));
        System.out.println("gcd2: " + gcd2(m, n));
    }
}
