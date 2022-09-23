package trees;

import trees.helper.TreeNode;

/**
 * Given the root of a binary tree and an integer targetSum,
 * return true if there is a path from the root to a leaf such that the sum of the nodes on the path is equal to targetSum, and return false otherwise.
 */

public class PathSum {
    public static void main(String[] args) {
        TreeNode root = createTree();
        System.out.println(hasPathSum(root, 22));

    }

    private static boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, 0, targetSum);
    }

    private static boolean dfs(TreeNode root, int sum, int target) {
        // need to establish base cases
        // null node
        // getting to leaf node, we need to see if it equals target
        if (root == null) return false;
        else if (root.left == null && root.right == null) return root.val + sum == target;

        boolean left = dfs(root.left, sum + root.val, target);
        boolean right = dfs(root.right, sum + root.val, target);

        return left || right;

    }

    private static TreeNode createTree() {
        TreeNode root = new TreeNode(5);
        TreeNode one = new TreeNode(4);
        TreeNode two = new TreeNode(8);
        TreeNode three = new TreeNode(11);
        TreeNode four = new TreeNode(13);
        TreeNode five = new TreeNode(4);
        TreeNode six = new TreeNode(7);
        TreeNode seven = new TreeNode(2);
        TreeNode eight = new TreeNode(1);

        root.left = one;
        root.right = two;

        one.left = three;
        three.left = six;
        three.right = seven;
        two.left = four;
        two.right = five;
        five.right = eight;

        return root;
    }
}