package Recursion;

public class nNumbers_withoutLoop {
    public static void main(String[] args) {
        System.out.println(numbers(10));
    }

    public static String numbers(int num){
        if(num>0){
            return num+" "+(numbers(num-1));
    }
    return "";
}
}