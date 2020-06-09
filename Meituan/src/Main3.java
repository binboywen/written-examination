import java.util.Arrays;
import java.util.Scanner;


//第一行两个数n和k，n表示有多少个数字，k表示输出第k小的有序数对（m,n）。
// 有序数对比较规则是第一个数大的大，第一个数相等则第二个数大的大。输出第k小的有序数对

//输入：第一行依次为n，k；第二行有n个数
//3 4
//2 1 3
//输出：2,1,3可以组成有序数对从小到大排序：（1,1）、（1,2）、（1,3）、
// （2,1），（2,2），（2,3），（3,1），（3,1），（3,3），第4晓得数对为（2,1）
public class Main3 {

    public static void main(String[] args) {
        int num;
        long m;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        m = sc.nextLong();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        long a1 = 0;
        a1 = (m - 1) / num;
        long a2 = 0;
        a2 = m - a1 * num - 1;
        System.out.println("(" + arr[(int) a1] + "," + arr[(int) a2] + ")");
    }
}
