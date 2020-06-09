import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//https://www.nowcoder.com/discuss/410187?type=2
//n个学生，m个科目，现在学校要给优秀学生颁奖，评判标准是至少在一个科目上获得了最高分【并列第一的情况！！这个当时没考虑到】
//输入：第一行两个参数，分别是n：学生人数；m：科目数；接着下面有n行m列数据，每行数据表示每个同学每一门科目的成绩
public class Main {
    static class Node{
        int xuhao;
        int val;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numOfstu,numOfSjb;
        numOfstu=sc.nextInt();
        numOfSjb=sc.nextInt();
        int[] vis=new int[numOfstu];
        int[][] map=new int[numOfstu][numOfSjb];
        for(int i=0;i<numOfstu;i++){
            for(int j=0;j<numOfSjb;j++){
                map[i][j]=sc.nextInt();
            }
        }
        int ans=0;
        Node[] tmp=new Node[numOfstu];
        for(int j=0;j<numOfSjb;j++){
            for(int i=0;i<numOfstu;i++){
                tmp[i]=new Node();
                tmp[i].val=map[i][j];
                tmp[i].xuhao=i;
            }
            Arrays.sort(tmp, new Comparator<Node>() {
                @Override
                public int compare(Node o1, Node o2) {
                    return o2.val-o1.val;
                }
            });
            for(int k=0;k<numOfstu-1;k++){
                if(vis[tmp[k].xuhao]==0) {
                    vis[tmp[k].xuhao] = 1;
                    ans++;
                }
                if(tmp[k].val!=tmp[k+1].val)
                    break;
            }
        }
        System.out.println(ans);
    }
}