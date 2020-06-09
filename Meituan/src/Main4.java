import java.util.Arrays;
import java.util.Scanner;

//作者：知更鸟女孩！！
//链接：https://www.nowcoder.com/discuss/410187?type=2
//第一行两个数n和k，n表示有多少个数字，k是伪中位数。伪中位数定义：
// 第 |_（n+1）/2_| 个数，|__| 表示向下取整。输出为至少需要增加多少个数才能使伪中位数为k
//
//输入：第一行依次为n，k；第二行有n个数
//4 2
//2 3 3 3
//输出：要想使2,3,3,3的伪中位数为2，可以是1,1,2,3,3,3，这个数组的伪中位数就是12，因此至少要增加2个数
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, k;
        num = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int p1 = -1;
        int p2 = -1;
        for (int i = 0; i < num; i++) {
            if (arr[i] == k) {
                if (p1 == -1)
                    p1 = i;
                p2 = i;
            }
        }
        int mid = (num + 1) / 2 - 1;
        if (mid >= p1 && mid <= p2) {
            System.out.println(0);
            return;
        }
        int add = 0;
        if (mid > p2) {
            while (((num + add + 1) / 2 - 1) != p2) {
                add++;
                p2++;
            }
            System.out.println(add);
            return;
        } else {
            while (((num + add + 1) / 2 - 1) != p1) {
                add++;
            }
            System.out.println(add);
            return;
        }
    }
}
