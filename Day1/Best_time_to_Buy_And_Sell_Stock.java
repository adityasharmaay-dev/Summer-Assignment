package Week1.Day1;
import java.util.*;

class Stock{
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        int best = BestTime(prices);
        System.out.println(best);
    }

    public static int BestTime(int[] prices){
        int minPrices = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            minPrices = Math.min(minPrices, prices[i]);
            int profit = prices[i] - minPrices;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}