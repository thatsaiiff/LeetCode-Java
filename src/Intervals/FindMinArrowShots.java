package Intervals;

import java.util.*;

public class FindMinArrowShots {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        // Sort balloons by end coordinate
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1;
        int lastArrow = points[0][1]; // place arrow at end of first balloon

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > lastArrow) {
                // Current balloon starts after last arrow → need new arrow
                arrows++;
                lastArrow = points[i][1];
            }
        }

        return arrows;
    }
}
