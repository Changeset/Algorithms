package Chapter1;

public class Binary {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int power = 1;
        while (power <= m/2) {
            power *= 2;
        }
        while (power > 0) {
            if (power <= m) {
                System.out.print("1");
                m -= power;
            }
            else {
                System.out.print("0");
            }
            power /= 2;
        }
        System.out.println();
    }
}
