package DP;

public class Sequence {
    public static String show(int a, int b) {
        if (a == b) return ("" + a);
        else if (b % 2 != 0) return ("(" + show(a, b-1) + " + 1)");
        else if (b < 2 * a) return "(" + show(a, b-1) + " + 1)";
        else return show(a, b/2) + " * 2"; 
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (a <= b) System.out.println(b + " = " + show(a, b));
        else System.out.println("Error: second argument is less than first one");
    }
}
