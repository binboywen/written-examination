import java.util.Scanner;

//5.	给你一个满二叉树
//例：（1节点，2节点，3节点***********）
//     1
//   2  3
//  4 5 6 7
//-----------
//现在输入一个x，代表第x节点，输入一个k代表深度。（1<=x<=10^18）
//判断n节点存不存在深度为k的父节点（或祖父节点，曾祖父节点*****）
//有则输出节点编号，没有输出-1
//————————————————
//版权声明：本文为CSDN博主「KnightHONG」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//原文链接：https://blog.csdn.net/KnightHONG/article/details/105781283
public class Main5 {
    public static long getParent(long x, int k) {
        long begin = (long) Math.pow(2, k - 1);
        long end = (long) Math.pow(2, k) - 1;
        long ans = -1;
        if (x <= end)
            return ans;
        while (true) {
            if (x >= begin && x <= end) {
                ans = x;
                break;
            }
            x = x / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        long x;
        int k;
        for (int i = 0; i < Q; i++) {
            x = sc.nextLong();
            k = sc.nextInt();
            System.out.println(getParent(x, k));
        }
    }
}