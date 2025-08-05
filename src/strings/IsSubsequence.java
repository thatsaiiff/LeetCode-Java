package strings;
/**
 * LeetCode Problem: Is Subsequence
 * https://leetcode.com/problems/is-subsequence/
 *
 * A subsequence is a sequence that can be derived from another sequence by deleting some elements
 * without changing the order of the remaining elements.
 *
 * This method checks whether string 's' is a subsequence of string 't'.
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;  // move pointer in s only when characters match
            }
            j++;  // always move pointer in t
        }

        return i == s.length();  // all chars in s matched in t
    }
}