package Intervals;

import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        // Step 2: Traverse intervals
        int[] current = intervals[0];
        merged.add(current);

        for (int[] interval : intervals) {
            if (interval[0] <= current[1]) {
                // Overlap → merge
                current[1] = Math.max(current[1], interval[1]);
            } else {
                // No overlap → add new interval
                current = interval;
                merged.add(current);
            }
        }

        // Step 3: Convert list back to array
        return merged.toArray(new int[merged.size()][]);
    }
}

