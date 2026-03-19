package Recursion;

public class nNumbers_withoutLoop_asc {
    public static void main(String[] args) {

        printASC(10);
    }

    static void printASC(int n) {
        if (n < 1) return;
        printASC(n - 1);
        System.out.print(n + " ");
    }
}
