package arrays; /**
 * Problem: https://leetcode.com/problems/candy/
 * Status: Solved ✅
 * Time: O(n), Space: O(n)
 * Approach:
 *   1. Initialize all children with 1 candy.
 *   2. Traverse left to right: if the current child has a higher rating than the previous one,
 *      give one more candy than the previous.
 *   3. Traverse right to left: if the current child has a higher rating than the next one,
 *      ensure they have more candies than the next (without reducing any previous assignments).
 *   4. Sum up the candies array to get the total minimum required.
 */


import java.util.Arrays;

public class Candy {
    public int candy(int ratings[]){
        int n=ratings.length;
        int candies[]=new int[n];

        Arrays.fill(candies,1);

        for (int i = 1; i<n; i++) {
            if (ratings[i] > ratings[i-1]){
                candies[i]=candies[i-1]+1;
            }

        }

        for (int i = n-2; i >=0 ; i--) {
            if (ratings[i]>ratings[i+1]){
                candies[i]= Math.max(candies[i],candies[i+1] + 1);
            }
        }

        int total = 0;
        for (int c : candies){
            total+=c;
        }



        return total;
    }
}
