package Recursion;

import static java.lang.Math.pow;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(3, 2));
    }

    static int power(int n, int x) {
        if (n == 0) return 1;
        return (int) (x * pow(x, n - 1));

    }
}
