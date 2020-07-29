package leetcode110;

/**
 * @author : shen.chong
 * @date : 2020/7/29 12:32
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    public int height(TreeNode root) {
        if (root == null)
            return 0;
        int lh = height(root.left), rh = height(root.right);
        if (lh < 0 || rh < 0 || Math.abs(lh - rh) > 1) {
            return -1;
        } else {
            return Math.max(lh, rh) + 1;
        }
    }
}
