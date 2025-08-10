package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem: https://leetcode.com/problems/product-of-array-except-self/
 * Status: Solved ✅
 * Time: O(n), Space: O(1) extra (excluding output)
 * Approach:
 * 1. Store prefix (left) product in output array.
 * 2. Traverse in reverse with a `right` product variable.
 * 3. Multiply `answer[i] = left * right` to get final result.
 */

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Step 1: Left product pass
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        // Step 2: Right product pass (in-place using one variable)
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int sample[] = {2,7,4,1,2,3};


        System.out.println("Product Except self are : "+ Arrays.toString(productExceptSelf(sample)));


    }
}