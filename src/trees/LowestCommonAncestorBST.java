package trees;

import trees.helper.TreeNode;

public class LowestCommonAncestorBST {

    public static void main(String[] args) {
        TreeNode root = createTestCase_1();

    }

    private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
        else if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        else return root;
    }

    private static TreeNode createTestCase_1() {
        TreeNode root = new TreeNode(6);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(8);
        TreeNode c = new TreeNode(0);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(7);
        TreeNode f = new TreeNode(9);
        TreeNode g = new TreeNode(3);
        TreeNode h = new TreeNode(5);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        d.left = g;
        d.right = h;

        return root;
    }
}
