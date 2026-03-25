package Patterns;

import java.util.HashSet;

/**
 * Given an array, check if any element appears more than once
 **/
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4};
        boolean result = Duplicate(nums);
        System.out.println(result);
    }

    static boolean Duplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);

            }
        }
        return false;
    }

}
