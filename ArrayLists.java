
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        list.set(2, 90);
        System.out.println(list);

        for (int i = 0; i < 4; i++) {
            list.add(in.nextInt());
        }

        System.out.println(list);

    }
}
