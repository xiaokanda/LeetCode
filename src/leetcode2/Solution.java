package leetcode2;

/**
 * @author : shen.chong
 * @date : 2020/8/2 8:37 上午
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int var1 = l1 != null ? l1.val : 0;
            int var2 = l2 != null ? l2.val : 0;
            int sum = var1 + var2 + carry;
            carry = sum / 10;
            cursor.next = new ListNode(sum % 10);
            cursor = cursor.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return root.next;
    }
}
