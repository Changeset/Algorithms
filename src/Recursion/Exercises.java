package Recursion;

import java.util.Scanner;

public class Exercises {
    public static int mystery(int a, int b) {
        if (b == 0)     return 1;
        if (b % 2 == 0) return mystery(a*a, b/2);
        return mystery(a*a, b/2) * a;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        System.out.println("mystery of " + m + " and " + n + " is " + mystery(m, n));
    }
}
