
public class lsa_searchInRange {

    public static void main(String[] args) {
        int[] nums = {18, 19, 20, 1, 21, 22, 23};
        int target = 18;
        int result = searchInrange(nums, target, 1, 4);
        System.out.println(result);
    }

    private static int searchInrange(int[] nums, int target, int start, int end) {

        if (nums.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            if (target == nums[index]) {
                return index;
            }
        }
        return -1;

    }
}
