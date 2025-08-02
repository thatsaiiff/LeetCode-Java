import java.util.Scanner;

/**
 * Problem: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Status: Solved ✅
 * Time: O(n), Space: O(1)
 * Approach: Track min price and max profit
 */

public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
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

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String stock_name="ITC";
        int sample[] = {172,178,198,110,29,10};
        int maxP=maxProfit(sample);

        System.out.println("Maximum Profit you can generate by Buying or selling the stock "+stock_name+" in the given time period : "+maxP);


    }
}