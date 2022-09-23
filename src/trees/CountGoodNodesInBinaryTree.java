package trees;

import trees.helper.TreeNode;

public class CountGoodNodesInBinaryTree {


    public static void main(String[] args) {
        TreeNode root = createTestTree_1();
        System.out.println(goodNodes(root));

    }

    private static int goodNodes(TreeNode root){
        int maxValueAlongPath = Integer.MIN_VALUE;

        return dfs(root, maxValueAlongPath);
    }

    private static int dfs(TreeNode node, int max) {
        if (node == null) return 0;

        int totalNumOfGoodNodes = 0;

        if (node.val >= max) {
            max = node.val;
            totalNumOfGoodNodes ++;
        }

        totalNumOfGoodNodes += dfs(node.left, max);
        totalNumOfGoodNodes += dfs(node.right, max);

        return totalNumOfGoodNodes;

    }

    private static TreeNode createTestTree_1() {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(4);
        TreeNode left_l = new TreeNode(3);
        TreeNode right_l = new TreeNode(1);
        TreeNode right_r = new TreeNode(5);

        root.left = left;
        root.right = right;
        left.left = left_l;
        right.left = right_l;
        right.right = right_r;

        return root;
    }
}
