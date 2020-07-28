package leetcode103;

/**
 * @author : shen.chong
 * @date : 2020/7/28 19:40
 */

import java.util.*;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
        queue.add(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            LinkedList<Integer> arr = new LinkedList<>();
            int count = queue.size();
            while (count > 0) {
                TreeNode node = queue.poll();
                arr.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
                count--;
            }
            if (!flag)
                Collections.reverse(arr);
            ans.add(arr);
            flag = !flag;
        }
        return ans;
    }
}
