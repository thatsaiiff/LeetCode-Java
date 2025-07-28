/**
 * Problem: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Status: Solved ✅
 * Time: O(n), Space: O(1)
 * Approach: Track min price and max profit
 */

public class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }
}