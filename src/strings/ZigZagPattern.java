package strings;//
//https://leetcode.com/problems/zigzag-conversion/?envType=study-plan-v2&envId=top-interview-150

public class ZigZagPattern  {
    public String convert(String s, int numRows) {
        // Edge case: if numRows is 1 or s is too short to zigzag, return original
        if (numRows == 1 || s.length() <= numRows) return s;

        // Create an array of StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++)
            rows[i] = new StringBuilder();

        int row = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[row].append(c);

            // Reverse direction if we’re at top or bottom row
            if (row == 0 || row == numRows - 1)
                goingDown = !goingDown;

            row += goingDown ? 1 : -1;
        }

        // Combine all rows into final result
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : rows)
            result.append(sb);

        return result.toString();
    }
}
