package trees;

import trees.helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 */
public class BinaryLevelOrderTraversal {

    public static void main(String[] args) {

    }

    private static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> values = new ArrayList<>();


        values = bfs(root, values);

        return values;

    }

    private static List<List<Integer>> bfs(TreeNode root, List<List<Integer>> values) {
        if (root == null) {
            return values;
        }

        List<Integer> list = new ArrayList<>();


        list.add(root.left.val);
        list.add(root.right.val);

        for (int i : list) {

        }


        values.add(list);

        return values;

    }

    private static TreeNode createTestTree() {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        TreeNode right_l = new TreeNode(15);
        TreeNode right_r = new TreeNode(7);

        root.left = left;
        root.right = right;
        right.left = right_l;
        right.right = right_r;

        return root;
    }

}
