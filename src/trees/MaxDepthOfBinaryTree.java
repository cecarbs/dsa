package trees;

import trees.helper.TreeNode;

/**
 * Give the root of a binary tree, find the max depth - # of nodes along the longest path from root to leaf
 */
public class MaxDepthOfBinaryTree {

    public static void main(String[] args) {
        TreeNode root = createTree();
        maxDepth(root);
    }

    private static int maxDepth(TreeNode root) {

        return dfs(root);
    }

    private static int dfs(TreeNode root) {
        if (root == null) return 0;

        int left = dfs(root.left) + 1;
        int right = dfs(root.right) + 1;

        return Math.max(left, right);
    }

    private static TreeNode createTree() {
        TreeNode root = new TreeNode(3);
        TreeNode one = new TreeNode(9);
        TreeNode two = new TreeNode(20);
        TreeNode three = new TreeNode(15);
        TreeNode four = new TreeNode(7);

        root.left = one;
        root.right = two;

        two.left = three;
        two.right = four;

        return root;
    }
}
