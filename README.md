# LeetCode-Java

🚀 My daily LeetCode practice in Java.

## Arrays

| #   | Title                             | Source                                 | Approach                              |
|-----|-----------------------------------|----------------------------------------|---------------------------------------|
| 121 | Best Time to Buy and Sell Stock  | [Code](src/arrays/BestTimeToBuySellStock.java) | Greedy, O(n)                          |
| 238 | Product of Array Except Self     | [Code](src/arrays/ProductExceptSelf.java)     | Prefix-Suffix, O(n), No division     |
| 134 | Gas Station                      | [Code](src/arrays/GasStation.java)           | Greedy, Single Pass                   |
| 135 | Candy                           | [Code](src/arrays/Candy.java)                | Greedy, Two Pass (Left-Right), O(n)  |
| 42  | Trapping Rain Water             | [Code](src/arrays/TrappingRainWater.java)     | Two-Pointer, O(n) time, O(1) space |
| 209 | Minimum Size Subarray Sum          | [Code](src/arrays/MinimumSizeSubarraySum.java)  | Sliding Window, O(n)                 |
| 36  | Valid Sudoku | [Code](src/arrays/ValidSudoku.java) | HashSet for rows, columns, boxes, O(1) |
| 48  | Rotate Image | [Code](src/arrays/RotateImage.java) | Transpose + Reverse rows, O(n^2) |
| 54  | Spiral Matrix | [Code](src/arrays/SpiralMatrix.java) | Boundary traversal simulation, O(m*n) |
| 73  | Set Matrix Zeroes | [Code](src/arrays/SetMatrixZeroes.java) | Constant space markers, O(m*n) |
| 289 | Game of Life | [Code](src/arrays/GameOfLife.java) | In-place state encoding, O(m*n) |
| 380 | Insert Delete GetRandom O(1) | [Code](src/arrays/RandomizedSet.java) | HashMap_Programs + ArrayList + Random, O(1) avg |
| 68  | Text Justification | [Code](src/arrays/TextJustification.java) | Greedy packing & space distribution |

## Strings

| #   | Title                             | Source                                 | Approach                              |
|-----|-----------------------------------|----------------------------------------|---------------------------------------|
| 13  | Roman to Integer                | [Code](src/strings/RomanToInteger.java)        | Greedy, O(n), Subtractive Logic    |
| 12  | Integer to Roman                | [Code](src/strings/IntegerToRoman.java)        | Greedy, Symbol Mapping |
| 151 | Reverse Words in a String       | [Code](src/strings/ReverseWordsInString.java) | String Manipulation, O(n) |
| 58  | Length of Last Word              | [Code](src/strings/LengthOfLastWord.java) | String, O(n)              |
| 14  | Longest Common Prefix           | [Code](src/strings/LongestCommonPrefix.java)  | Horizontal Scanning, O(n * m) |
| 6   | Zigzag Conversion               | [Code](src/strings/ZigZagConversion.java)         | String Manipulation, Simulation      |
| 28  | Find the Index of the First Occurrence      | [Code](src/strings/StrStr.java)                | Built-in `indexOf()`, O(n*m)         |
| 125 | Valid Palindrome                  | [Code](src/strings/ValidPalindrome.java) | Two Pointers, Clean-up then Compare  |
| 392 | Is Subsequence                     | [Code](src/strings/IsSubsequence.java)  | Two Pointers, O(n) time, O(1) space  |
| 3   | Longest Substring Without Repeating Characters | [Code](src/strings/LongestSubstringWithoutRepeatingCharacters.java) | Sliding Window + HashSet, O(n) |
| 30  | Substring with Concatenation of All Words | [Code](src/strings/SubstringWithConcatenationOfAllWords.java) | Sliding Window + HashMap_Programs, O(n * wordLen) |

## HashMap_Programs

| #   | Title                             | Source                                 | Approach                              |
|-----|-----------------------------------|----------------------------------------|---------------------------------------|
| 383 | Ransom Note | [Code](src/HashMap_Programs/RansomNote.java) | HashMap + Frequency Array, O(n) |
| 205 | Isomorphic Strings | [Code](src/HashMap_Programs/IsomorphicsStrings.java) | HashMap for char mapping, O(n) |
| 290 | Word Pattern | [Code](src/HashMap_Programs/WordPattern.java) | HashMap + Bijection check, O(n) |
| 242 | Valid Anagram | [Code](src/HashMap_Programs/ValidAnagram.java) | Sorting or HashMap, O(n) |
| 49  | Group Anagrams | [Code](src/HashMap_Programs/GroupAnagrams.java) | HashMap with sorted key, O(n * k log k) |
| 1   | Two Sum | [Code](src/HashMap_Programs/TwoSum.java) | HashMap complement lookup, O(n) |
| 202 | Happy Number | [Code](src/HashMap_Programs/HappyNumber.java) | HashSet cycle detection, O(log n) |
| 219 | Contains Duplicate II | [Code](src/HashMap_Programs/ContainsDuplicateII.java) | HashMap index tracking, O(n) |
| 128 | Longest Consecutive Sequence | [Code](src/HashMap_Programs/LongestConsecutiveSequence.java) | HashSet boundary check, O(n) |

## Intervals

| #   | Title                             | Source                                 | Approach                              |
|-----|-----------------------------------|----------------------------------------|---------------------------------------|
| 56  | Merge Intervals                   | [Code](src/Intervals/MergeIntervals.java) | Sorting + Merge Overlap, O(n log n)  |
| 57  | Insert Interval                  | [Code](src/Intervals/InsertIntervals.java) | Linear scan + merge overlaps, O(n)   |
| 452 | Minimum Number of Arrows to Burst Balloons | [Code](src/Intervals/FindMinArrowShots.java) | Sorting by end coordinate + greedy, O(n log n) |
| 228 | Summary Ranges                  | [Code](src/Intervals/SummaryRanges.java) | Linear traversal, O(n)                |

## ICSE

| Title           | Source                                 | Approach                              |
|-----------------|----------------------------------------|---------------------------------------|
| SwapOrBuzzMenu  | [Code](src/ICSE/SwapOrBuzzMenu.java)   | Basic menu-driven program (practice) |

















---

## 🛠️ Projects

| Project Name      | Description                              | Status     | Link         |
|-------------------|------------------------------------------|------------|--------------|
| Fire TV CLI Tool  | Lightweight CLI to interact with Fire TV via ADB: launch apps, capture logs, and navigate | Planned 🚧 | [Notes](notes/ProjectIdeas.md) |

---

## 🔥 FireTV CLI Tool (Project)

A Java-based CLI project to support Fire TV troubleshooting and automation.  
Functions include:
- Listing installed apps
- Uninstalling sideloaded apps
- Clearing cache of all apps
- Future plans: Wi-Fi troubleshooting & voice command integration

📂 GitHub Repository: [FireTV-CLI-Tool](https://github.com/thatsaiiff/FireTV-CLI-Tool)