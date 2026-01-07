
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // 3 methods to print array
        // 1) iterating over loop
        //defining array
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        // 2) using tostring(recommended)
        System.out.println(java.util.Arrays.toString(arr));

        // 3) using enhanced for loop
        for (int elem : arr) {
            System.out.print(elem + " ");
        }

    }

    public static char[] toString(int[][] arr2d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }

    public static char[] toString(int[] is) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }
}
