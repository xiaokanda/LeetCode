package leetcode415;

/**
 * @author : shen.chong
 * @date : 2020/8/3 12:34
 */
public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sum = new StringBuilder();
        int carry = 0, i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            if (i >= 0) carry += num1.charAt(i--) - '0';
            if (j >= 0) carry += num2.charAt(j--) - '0';
            sum.append(carry % 10);
            carry /= 10;
        }
        return sum.reverse().toString();
    }
}
