package leetcode115;

/*
 *    *  b  a  b  g  b  a  g
 * *  1  1  1  1  1  1  1  1
 * b  0  1  1  2  2  3  3  3
 * a  0  0  1  1  1  1  4  4
 * g  0  0  0  0  1  1  1  5
 */

public class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[t.length() + 1][s.length() + 1];
        for (int j = 0; j <= s.length(); j++)
            dp[0][j] = 1;
        for (int i = 1; i <= t.length(); i++) {
            for (int j = 1; j <= s.length(); j++) {
                if (s.charAt(j - 1) == t.charAt(i - 1)) {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[t.length()][s.length()];
    }
}
