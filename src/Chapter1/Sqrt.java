package Chapter1;

public class Sqrt {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        double estimate = 1e-13;
        double t = c;
        while (Math.abs(t - c/t) > estimate) {
            t = (t + c/t) / 2.0;
        }
        System.out.println(t);
        System.out.println(Math.sqrt(c));
    }
}
