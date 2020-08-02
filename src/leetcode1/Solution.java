package leetcode1;

import java.util.HashMap;

/**
 * @author : shen.chong
 * @date : 2020/8/2 8:07 上午
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int differ = target - nums[i];
            if (hashMap.containsKey(differ))
                return new int[]{i, hashMap.get(differ)};
            hashMap.put(nums[i], i);
        }
        return null;
    }
}
