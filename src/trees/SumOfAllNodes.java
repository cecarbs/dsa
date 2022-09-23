package trees;

import trees.helper.TreeNode;

/**
 * Given the root of a binary tree, return the sum of all values in the tree.
 * Assume that the tree only contains number values.
 */

public class SumOfAllNodes {

    public static void main(String[] args) {
        TreeNode root = createTestTree_1();
        System.out.println(sumOfNodes(root));

    }

    private static int sumOfNodes(TreeNode root) {
        if (root == null) return 0;

//        int sum = 0;
//        sum += root.val;
//
//        sum += sumOfNodes(root.left);
//        sum += sumOfNodes(root.right);
//
//        return sum;

        return sumOfNodes(root.left) + root.val + sumOfNodes(root.right);

    }

    private static int dfs(TreeNode root){
        return 0;
    }

    private static TreeNode createTestTree_1() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(3);
        TreeNode left_l = new TreeNode(9);
        TreeNode left_r = new TreeNode(7);

        root.left = left;
        root.right = right;
        left.left = left_l;
        left.right = left_r;

        return root;
    }
}
