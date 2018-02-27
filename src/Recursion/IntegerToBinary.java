package Recursion;

public class IntegerToBinary {

    public static void convert(int n) {
        if (n == 0) return;
        convert(n / 2);
        System.out.print(n % 2);
    }

//    public static void convert2(int n) {
//        if (n == 0) return;
//        convert(n / 2);
//        StdOut.print(n % 2);
//    }


    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        convert(n);
        System.out.println();
//        convert2(n);
//        StdOut.println();
    }
}
