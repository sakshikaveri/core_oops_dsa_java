import java.util.Arrays;
import java.util.Scanner;

public class multiDimensionalArrays {

    public static void main(String[] args) {

        int[][] arr2d = new int[3][3];

        Scanner input = new Scanner(System.in);

        // length of arrays gives no of rows
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                arr2d[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < arr2d.length; i++) {
            // System.out.print(Arrays.toString(arr2d));
            System.out.println(Arrays.toString(arr2d[i]));
        }

    }

}
