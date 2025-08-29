package Intervals;

import java.util.*;

public class InsertIntervals {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {
            if (interval[1] < newInterval[0]) {
                // Current interval ends before newInterval starts
                result.add(interval);
            } else if (interval[0] > newInterval[1]) {
                // Current interval starts after newInterval ends
                result.add(newInterval);
                newInterval = interval; // update newInterval for future
            } else {
                // Overlap → merge
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }

        // Add the last interval
        result.add(newInterval);

        return result.toArray(new int[result.size()][]);
    }
}
