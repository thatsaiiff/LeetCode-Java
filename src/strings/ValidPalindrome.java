package strings;

/**
 * Problem: https://leetcode.com/problems/valid-palindrome/description/?envType=study-plan-v2&envId=top-interview-150
 * File Path: src/arrays/strings/ValidPalindrome.java
 *
 * ✅ Status: Solved
 * ✅ Approach: Two Pointers
 * ✅ Time Complexity: O(n) — Single pass from both ends of the string.
 * ✅ Space Complexity: O(1) — No extra space used apart from a few variables.
 *
 * A phrase is a palindrome if it reads the same forward and backward after:
 *  - Converting all uppercase letters to lowercase
 *  - Removing all non-alphanumeric characters
 */

public class ValidPalindrome {


    public static void main(String[] args) {
        String name = "A man, a plan, a canal: Panama";
        boolean ans=        isPalindrome(name);
        System.out.println(ans);
    }
    public static boolean isPalindrome(String s){
        int left =0;
        int right = s.length()-1;

        while(left<right){

            while (left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while (left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }


            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;

            }
            left++;
            right--;
        }

        return true;
    }
}