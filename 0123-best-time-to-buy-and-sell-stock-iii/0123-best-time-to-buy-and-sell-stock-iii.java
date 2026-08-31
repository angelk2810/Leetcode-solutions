class Solution {
    public int maxProfit(int[] prices) {
        int buyOne = Integer.MAX_VALUE;
        int SellOne = 0;
        int buyTwo = Integer.MAX_VALUE;
        int SellTwo = 0;
        for(int p : prices) {
            buyOne = Math.min(buyOne, p);
            SellOne = Math.max(SellOne, p - buyOne);
            buyTwo = Math.min(buyTwo, p - SellOne);
            SellTwo = Math.max(SellTwo, p - buyTwo);
        }
        return SellTwo;
    }
}