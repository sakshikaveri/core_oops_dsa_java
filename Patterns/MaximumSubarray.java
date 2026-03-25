package Patterns;

/**
 * Find subarray with maximum sum
 **/
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {5, 4, 1, 7, 8};
        int result = maxsubarray(nums);
        System.out.println(result);
    }

    public static int maxsubarray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
