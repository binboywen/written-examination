import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//给定一棵树，树上的第u个节点有点权au，请找出一条最长的路径(u,v)使得从u沿着唯一路径走到v的途中
//点权不断严格递增
//输出最长满足条件的路径的长度
public class Main_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] val = new int[num];
        for (int i = 0; i < num; i++) {
            val[i] = sc.nextInt();
        }
        List<Integer>[] g = new ArrayList[num];
        for (int i = 0; i < num; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < num - 1; i++) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            a -= 1;
            b -= 1;
            g[a].add(b);
            g[b].add(a);
        }
        int ans = 0;
        int[] dp = new int[num];
        for (int i = 0; i < num; i++) {
            if (dp[i] == 0) {
                dp[i] = dfs(i, dp, g, val);
            }
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);
    }

    public static int dfs(int index, int[] dp, List<Integer>[] g, int[] val) {
        if (dp[index] != 0) {
            return dp[index];
        }
        dp[index] = 1;
        for (int i = 0; i < g[index].size(); i++) {
            int u = g[index].get(i);
            if (val[u] > val[index]) {
                dp[index] = Math.max(dp[index], dfs(u, dp, g, val) + 1);
            }
        }
        return dp[index];
    }
}
