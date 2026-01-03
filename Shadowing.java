
public class Shadowing {

    static int x = 45;

    public static void main(String[] args) {
        System.out.println(x);
        int x;  // this declaration is wherein the shadwowing begins and the upper level/higher level declaration is overshadowed by the new declaration
        // System.out.println(x);  // gives error
        x = 60;
        System.out.println(x);
        fun();
    }

    public static void fun() {
        System.out.println(x);
    }
}

// NOTE- shadowing doesn't work in methods, only works in class level