
import java.util.Arrays;

public class lsa_searchIn2Darray {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {1, -5, 6, 7, 8}, {11, 22, 33, 44, 55}};
        int target = 22;

        int[] result = searchIn2DArray(arr, target);
        System.out.println(Arrays.toString(result));

        System.out.println(min(arr));
    }

    private static int[] searchIn2DArray(int[][] arr, int target) {
        int[] output = {0, 0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    private static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] i : arr) {
            for (int j : i) {
                if (j < min) {
                    min = j;
                }
                
            }
        }
        return min;
    }
}
