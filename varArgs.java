import java.util.Arrays;

public class varArgs {

    public static void main(String[] args) {

        fun(2,3,4,5,6,7,8,9);  // gets stored as array- collection of integers
        multiple(10,20,"Sakshi","Kaveri");
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(c));
    }
}
