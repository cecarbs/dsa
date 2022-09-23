package arrays;

/**
 * Given a binary array nums and an integer k,
 * return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
 * Output: 6
 * Explanation: [1,1,1,0,0,1,1,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 *
 * Because the string can only contain "1" and "0",
 * another way to look at this problem is "what is the longest substring that contains at most one "0"?".
 * This makes it easy for us to solve with a sliding window where our condition is window.count("0") <= 1.
 * Again, we can use an integer curr that keeps track of how many "0" we currently have in our window.
 *
 *
 * Another way to phrase is what is the max length that of integers in an array so that the number of 0's aren't greater
 * than k.
 */

public class MaxConsecutiveOnesIII {

    public static void main(String[] args) {
        int[] test = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(maxConsecutiveOnes(test, k));
    }

    private static int maxConsecutiveOnes(int[] nums, int k) {
        int left = 0;
        int curr = 0;
        int max = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                curr++;
            }
            while(curr > k) {
                if (nums[left] == 0) {
                    curr--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
