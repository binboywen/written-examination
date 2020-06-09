import java.util.Arrays;
import java.util.Scanner;

//给n个数，每一次从a[i]中取出一个最大的减去n，其他的n-1个数加上1，一直重复直到最大的a[i]<n
//执行次数记为k，求最少执行多少次操作使得n个数都小于n
public class Main_2 {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long [] arr = new long[num];
        for(int j = 0; j < num; j++){
            arr[j] = sc.nextLong();
        }
        Arrays.sort(arr);
        if(arr[num - 1] < num){
            System.out.println(0);
            return;
        }
        long times = 0;
        while(arr[num -1] >= num) {
            long sub_x = arr[num - 1] / num;
            times += sub_x;
            for (int i = 0; i < num - 1; i++) {
                arr[i] += sub_x;
            }
            arr[num - 1] -= num * sub_x;
            Arrays.sort(arr);
        }
        System.out.println(times);
    }
}
