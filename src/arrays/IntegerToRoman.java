package arrays;

/**
 * Problem: https://leetcode.com/problems/integer-to-roman/
 * Status: Solved ✅
 * Time: O(1) because the number has a fixed max length
 * Approach: Greedy — match largest Roman values first
 */

public class IntegerToRoman {
    public String intToRoman(int num) {
        // Predefined Roman values from largest to smallest
        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40,  10, 9,   5, 4,  1};
        String[] symbols ={"M",  "CM","D", "CD","C", "XC","L","XL","X","IX","V","IV","I"};

        StringBuilder result = new StringBuilder();

        // Go through each value-symbol pair
        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];  // Subtract the value
            }
        }

        return result.toString();
    }
}