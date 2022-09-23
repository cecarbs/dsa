package arrays;

/**
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 */

public class ContainerWithMostWater {
    // set two pointers
    // move pointer with the lower amount to see if we can do better

    public static void main(String[] args) {
//        int[] height = {1,8,6,2,5,4,8,3,7};
        int[] height = {2, 3, 4, 5, 18, 17, 6};
        System.out.println(containerWithMostWater(height));

    }

    private static int containerWithMostWater(int[] height) {
        int startingPointer = 0;
        int endingPointer = height.length - 1;
        int largestArea = Integer.MIN_VALUE;

        while (startingPointer < endingPointer) {
            int curr = findArea(endingPointer - startingPointer, Math.min(height[endingPointer], height[startingPointer]));
            largestArea = Math.max(curr, largestArea);

            if (height[startingPointer] < height[endingPointer]) {
                startingPointer++;
            } else {
                endingPointer--;
            }
        }

        return largestArea;
    }

    private static int test(int[] height) {
        int leftBoundary = 0;
        int rightBoundary = height.length - 1;
        int largestArea = Integer.MIN_VALUE;

        while (leftBoundary < rightBoundary) {
            int curr = findArea(Math.min(height[leftBoundary], height[rightBoundary]), rightBoundary - leftBoundary);
            largestArea = Math.max(largestArea, curr);

            if (leftBoundary < rightBoundary) {
                leftBoundary++;
            } else {
                rightBoundary--;
            }
        }

        return largestArea;
    }

    private static int findArea(int length, int height) {
        return length * height;
    }


}

/**
 * 2 POINTER SOLUTION
 */