package arrays;

/**
 * Given an integer array nums, return the number of subarrays filled with 0.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * Input: nums = [1,3,0,0,2,0,0,4]
 * Output: 6
 * Explanation:
 * There are 4 occurrences of [0] as a subarray.
 * There are 2 occurrences of [0,0] as a subarray.
 * There is no occurrence of a subarray with a size more than 2 filled with 0. Therefore, we return 6.
 *
 * The number of subarrays that can be formed if it is continiguous is (n * n + 1) / 2 where n = length
 * i.e. if there are 4 consecutive 0's that means 10 different subarrays can be formed ((4 * 5) / 2) = 10
 */
public class NumberOfZeroFilledSubarrays {

    public static void main(String[] args) {
        int[] test = {1,3,0,0,2,0,0,4};
        System.out.println(numberOfSubarrays(test));
    }

    private static long numberOfSubarrays(int[] nums) {
        long curr = 0;
        long total = 0;
        // make sure you use long otherwise your answer will be off
        for (int i : nums) {
            if (i == 0) {
                curr++;
                total += curr;
            } else {
                curr = 0;
            }
        }

        return total;

    }
}
