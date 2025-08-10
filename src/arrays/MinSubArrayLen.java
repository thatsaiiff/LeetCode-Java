package arrays;

public class MinSubArrayLen {
    /**
     * Finds the minimal length of a contiguous subarray of which the sum is at least target.
     * Uses a sliding window approach to achieve O(n) time complexity.
     *
     * Approach:
     * - Initialize two pointers (left and right) and a running sum.
     * - Expand the right pointer to add elements to the window until the sum >= target.
     * - Then, shrink the window from the left to find the minimal length subarray.
     *
     * Time Complexity: O(n) - each element is visited at most twice.
     * Space Complexity: O(1) - only a few variables are used.
     *
     * Reference: https://leetcode.com/problems/minimum-size-subarray-sum/
     *
     * @param target the target sum to reach or exceed
     * @param nums the input array of positive integers
     * @return the minimal length of a contiguous subarray with sum >= target, or 0 if none exist
     */
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
