package Intervals;

import java.util.*;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;

        int start = nums[0];  // start of the current range

        for (int i = 0; i < nums.length; i++) {
            // if it's the last element OR next element is not consecutive
            if (i == nums.length - 1 || nums[i] + 1 != nums[i + 1]) {
                if (start == nums[i]) {
                    result.add(String.valueOf(start));  // single number
                } else {
                    result.add(start + "->" + nums[i]); // range
                }
                // reset start for the next range
                if (i != nums.length - 1) {
                    start = nums[i + 1];
                }
            }
        }

        return result;
    }
}
