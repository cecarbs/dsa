package trees;

import trees.helper.TreeNode;

/**
 * Maximum difference between ancestor and node
 */

public class MaxAncestorDiff {

    // initialize result
    private static int result;

    public static void main(String[] args) {
        TreeNode root = createTree();

        System.out.println(maxDiff(root));
    }

    public static int maxDiff(TreeNode root) {
        // keep track of max and min values
        // recursively call dfs on the current node while updating max and min values
        int max = root.val;
        int min = root.val;
        helper(root, max, min);

        return result;
    }

    private static void helper(TreeNode node, int max, int min) {
        if (node == null) return;

        max = Math.max(max, node.val);
        min = Math.min(min, node.val);

        result = Math.max(Math.abs(max - min), result);

        helper(node.left, max, min);
        helper(node.right, max, min);
    }

    public static TreeNode createTree() {
        TreeNode root = new TreeNode(8);
        TreeNode left = new TreeNode(3);
        root.left = left;
        TreeNode one = new TreeNode(1);
        left.left = one;
        TreeNode two = new TreeNode(6);
        left.right = two;
        TreeNode three = new TreeNode(4);
        TreeNode four = new TreeNode(7);
        two.left = three;
        two.right = four;
        TreeNode right = new TreeNode(10);
        root.right = right;
        TreeNode five = new TreeNode(14);
        TreeNode six = new TreeNode(13);
        right.right = five;
        five.left = six;

        return root;

    }


}
