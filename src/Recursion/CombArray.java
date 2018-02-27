package Recursion;

public class CombArray {
    public static void showCombination(int[] s) {
        for (int i = 0; i < s.length; i++) 
            System.out.print(s[i] + " ");
        System.out.println();
    }

    public static void generate(int[] s, int position, int nextInt, int k, int n) {
        if (position == k) {
            showCombination(s);
            return;
        }
        for (int i = nextInt; i < n; i++) {
            s[position] = i;
            generate(s, position + 1, i + 1, k, n);
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        int[] s = new int[k];
        generate(s, 0, 0, k, n);
    }
}
