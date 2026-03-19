package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.print(fin(i) + " ");
        }
    }

    static int fin(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fin((n - 1)) + fin((n - 2));
        }

    }
}


