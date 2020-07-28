package leetcode108;

/**
 * @author : shen.chong
 * @date : 2020/7/28 21:26
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return nums == null ? null : builTree(nums, 0, nums.length - 1);
    }

    public TreeNode builTree(int[] nums, int l, int r) {
        if (l > r)
            return null;
        int m = l + (r - l) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = builTree(nums, l, m - 1);
        root.right = builTree(nums, m + 1, r);
        return root;
    }
}
