package leetcode101;

/**
 * @author : shen.chong
 * @date : 2020/7/28 13:45
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
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricTree(root,root);
    }

    public boolean isSymmetricTree(TreeNode p,TreeNode q){
        if(p == null && q == null)
            return true;
        if(p == null || q == null || p.val != q.val){
            return false;
        }else{
            return isSymmetricTree(p.left,q.right) && isSymmetricTree(p.right,q.left);
        }
    }
}
