package Chapter1;

public class Prime {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        boolean isPrime = true;
        if (n < 2) isPrime = false;
        for (int factor = 2; factor < Math.sqrt(n); factor++) {
            if (n % factor == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) System.out.println(n + " is Prime");
        else         System.out.println(n + " is not Prime");

    }
}
