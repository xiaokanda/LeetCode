package other;

public class Solution {
    public int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= nums.length)
                return -1;
            if (nums[i] > i)
                i = nums[i];
            if (nums[i] == i)
                return i;
        }
        return -1;
    }
}
