package leetcode343;

/**
 *
 * 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
 * 2 => 1*1
 * 3 => 2*3
 * 4 => 2*2
 * 5 => 2*3
 * 6 => 3*3
 * 7 => 3*4
 * 8 => 4*4
 * 9 => 3*3*3
 * 10 => 3*3*4
 * 11 => 3*4*4
 * */

public class Solution {
    public int integerBreak(int n) {
        if(n == 2)
            return 1;
        if(n == 3)
            return 2;
        int ans = 1;
        while(n > 4){
            n =n - 3;
            ans =ans * 3;
        }
        return ans * n;
    }
}
