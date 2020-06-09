import sun.reflect.generics.tree.Tree;

import java.util.Scanner;

//牛牛们吃糖果
//n个牛牛，每个牛要吃 ai 个糖果，共有 m个糖果，有一些牛是成对出现的，
// 要么都吃要么都不吃，但是每只牛只能出现在一个pair对中。求能吃上糖果最多的牛的数量？

//解析：
//
//一道非常典型的背包dp。成对的牛牛合并成一个，吃得糖果数量为a[i]+a[j],数量为2. 其余牛牛吃得糖果数量为a[i] ,数量为1.
//dp[i][j] = max(dp[i-1][j],dp[i-1][j-a[i]] + num), num属于{1，2} 取决于是合并的牛还是单个牛。
//其实题目条件没必要每头牛只能出现在一个pari对中。如果是那样子，需要一个BFS 来预处理一下。
public class Main3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        long T = scanner.nextLong();
        long D = scanner.nextLong();
        long X = scanner.nextLong();
        int N = scanner.nextInt();
        long [] arr = new long[N];
        for(int i = 1; i < N; i++){
            if(D > T){
                long nums = D / T;
                if(i <= nums){
                    arr[i] = 2 * D + i * X;
                }else{
                    while(true){
                        for(int m = 0; m <= nums; m++){
                            arr[i] = 2 * D + m * X;
                        }
                        nums = (arr[i-1] + D)/T;
                        if(i<=nums){
                            arr[i] = 2 * D + i * X;
                            break;
                        }
                    }
                }
            }else{

            }
        }
    }
}
