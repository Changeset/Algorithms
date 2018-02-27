package Recursion;

public class CombinationsK {
    public static void comb1(String s, int k) { comb1("", s, k); }

    public static void comb1(String prefix, String s, int k) {
        if (s.length() < k) return;
        else if (k == 0) System.out.println(prefix);
        else {
            comb1(prefix + s.charAt(0), s.substring(1), k-1);
            comb1(prefix, s.substring(1), k);
        }
    }
    public static void comb2(String s, int k) { comb2("",s, k); }
    public static void comb2(String prefix, String s, int k) {
        if (k == 0) 
            System.out.println(prefix);
        else {
            for (int i = 0; i < s.length(); i++)
                comb2(prefix + s.charAt(i), s.substring(i + 1), k-1);
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String elements = alphabet.substring(0,n);
        comb1(elements, k);
        comb2(elements, k);
    }
}
