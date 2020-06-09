public class Main3 {
    /**
     * 总钱数total，有n件礼品，每件礼品有相应的热度，购买其中一件或多件礼品，
     * 使热度最大。
     * 输入描述：第一行输入总钱数，第二行输入礼品价格，第三行输入对应的热度
     * 输出描述：最大热度
     * 1000
     * 200 600 100 180 300 450
     * 6 10 3 4 5 8
     * 输出：21
     */
    public int pack(int [] prices, int [] vals, int total){
        int [] dp = new int[1005];
        for(int i = 1; i <= 6; i++){
            for(int j = total; j >= prices[i]; j--){
                dp[j] = Math.max(dp[j - prices[i]] + vals[i], dp[j]);
            }
        }
        return dp[total];
    }
}
