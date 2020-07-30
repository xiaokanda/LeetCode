package leetcode113;

/**
 * @author : shen.chong
 * @date : 2020/7/29 13:20
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, sum);
        return ans;
    }

    private void dfs(TreeNode root, int sum) {
        if (root == null)
            return;
        path.add(root.val);
        if (root.left == null && root.right == null && sum == root.val)
            ans.add(new ArrayList<>(path));
        dfs(root.left, sum - root.val);
        dfs(root.right, sum - root.val);
        path.remove(path.size() - 1);
    }
}
