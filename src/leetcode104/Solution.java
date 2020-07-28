package leetcode104;

/**
 * @author : shen.chong
 * @date : 2020/7/28 20:13
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
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + max(maxDepth(root.left), maxDepth(root.right));
    }

    public int max(int maxDepth, int maxDepth1) {
        return maxDepth > maxDepth1 ? maxDepth : maxDepth1;
    }
}
