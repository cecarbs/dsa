package arrays;

/**
 * You are given an integer array nums consisting of n elements, and an integer k.
 *
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
 * Any answer with a calculation error less than 10-5 will be accepted.
 *
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 *
 * Input: nums = [5], k = 1
 * Output: 5.00000
 */

public class MaximumAverageSubarray1 {

    public static void main(String[] args) {
    int[] test = {1,12,-5,-6,50,3};
    int k = 4;
    System.out.println(findMaxAverage(test, k));

    }

    private static double findMaxAverage(int[] nums, int k) {
        int leftBoundary = 0;
        double curr = 0;
        double max = Integer.MIN_VALUE;

        for (int rightBoundary = 0; rightBoundary < nums.length; rightBoundary++) {
            curr += nums[rightBoundary];
            if (rightBoundary - leftBoundary + 1 == k) {
                max = Math.max(curr / k, max);
                curr -= nums[leftBoundary];
                leftBoundary++;
            }
        }

        return max;
    }
}
