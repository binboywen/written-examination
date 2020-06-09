import java.util.HashSet;
import java.util.Scanner;

//n个学生，m个科目，现在学校要给优秀学生颁奖，评判标准是至少在一个科目上获得了最高分【并列第一的情况！！这个当时没考虑到】
//输入：第一行两个参数，分别是n：学生人数；m：科目数；接着下面有n行m列数据，每行数据表示每个同学每一门科目的成绩
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//学生人数
        int m = sc.nextInt();//考试科目
        int [][] score = new int[n][m];

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                score[i][j] = sc.nextInt();
            }
        }
        System.out.println(Main1.personCount(score));

    }
    public static int personCount(int[][] score) {
        if(score.length==0||score[0].length==0) {
            return 0;
        }
        HashSet<Integer> h = new HashSet<Integer>();
        for(int m=0;m<score[0].length;m++) {
            //找每一列的最大值
            int max = score[0][m];
            int mark = 0;
            for(int i=0;i<score.length;i++) {
                if(score[0][i]>max) {//最大值的哪一行准备删除
                    max = score[0][i];
                    mark = m;//第i个学生已经获奖
                }
            }
            h.add(mark);
        }
        return h.size();
    }

}
