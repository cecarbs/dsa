package trees;

import trees.helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary tree, imagine yourself standing on the right side of it,
 * return the values of the nodes you can see ordered from top to bottom.
 *
 * Input: root = [1,2,3,null,5,null,4]
 * Output: [1,3,4]
 */

public class BinaryTreeRightSideView {

    public static void main(String[] args) {
        TreeNode root = createTree();
        rightSideView(root);
    }

    private static List<Integer> rightSideView(TreeNode root) {
        List<Integer> solution = new ArrayList<>();
        solution = dfs(root, solution);
        System.out.println(solution);
        return solution;
    }

    private static List<Integer> dfs(TreeNode root, List<Integer> soln) {
        if (root == null) return soln;
        // add value to the array and pass the array
        soln.add(root.val);
        // recursively call the right side of the tree
        return dfs(root.right, soln);
        // return the array;
    }

    private static TreeNode createTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);

        return root;
    }
}
