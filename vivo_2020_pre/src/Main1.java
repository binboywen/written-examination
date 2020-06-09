import java.util.Scanner;

public class Main1 {
    /**
     *给定一个长为N的数组，值取01两种情况，
     * 求最多可以种多少颗树（0变为1），不能出现相邻为1的情况
     */

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] array = new int[N];
        for(int i = 0; i < N; i++){
            array[i] = sc.nextInt();
        }
        int first = 0;
        int cnt = 0;
        for(int i = 0; i < N; ){
            if(array[i] != 0){
                i++;
                continue;
            }
            else {
                first = i;
                while (array[i] == 0) {
                    i++;
                    if (i >= N)
                        break;
                }
                if(first == 0 || i == N){
                    cnt += (i - first) / 2;
                }else{
                    cnt += ((i - first) % 2 == 0) ? (i - first - 1) / 2 : (i - first) / 2;
                }

            }
        }
        System.out.println(cnt);
    }
}
