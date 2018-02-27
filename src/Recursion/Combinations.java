package Recursion;

public class Combinations {
    public static void comb1(String s) { comb1("", s); }

    public static void comb1(String prefix, String s) {
        if (s.length() > 0) {
            System.out.println(prefix + s.charAt(0));
            comb1(prefix + s.charAt(0), s.substring(1));
            comb1(prefix,               s.substring(1));
        }
    }

    public static void comb2(String s) { comb2("", s); }

    public static void comb2(String prefix, String s) {
        System.out.println(prefix);
        for (int i = 0; i < s.length(); i++) {
            comb2(prefix + s.charAt(i), s.substring(i + 1));
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String elements = alphabet.substring(0, n);

        comb1(elements);
        System.out.println();
        comb2(elements);
        System.out.println();
    }
}
