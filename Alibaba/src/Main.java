import java.util.Arrays;
import java.util.Scanner;
//https://zhuanlan.zhihu.com/p/137294096
//n种不同水果，第i种水果数量为m ，需要把水果分为 m个人，
// 分给每个人的水果数量相同，且一个人只能被分到一种水果，每个人最多能分到几个水果？
//
//解析：
//
//一个非常非常明显的二分问题，即给每个人分k 个水果是否可行，
// 如果 sum（a[i] / k）>= m 就可行，否则不可行。找一个最大的k即可
public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(--T >= 0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int [] array = new int[n];
            for(int i = 0; i < n; i++){
                array[i] = scanner.nextInt();
            }
            long sum = 0;
            for(int j = 0; j < n; j++){
                sum+= array[j];
            }
            long maxNumbers = sum / m;
            if(maxNumbers == 0){
                System.out.println(0);
            }
            while(maxNumbers > 0){
                int temp = 0;
                for(int i = 0; i < n; i++){
                    temp += array[i] / maxNumbers;
                }
                if(temp < m)
                    maxNumbers--;
                else{
                    System.out.println(maxNumbers);
                    break;
                }
            }
        }
    }
}
