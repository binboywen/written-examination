import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//作者：pdsu-怪兽
//链接：https://www.nowcoder.com/discuss/418008
//来源：牛客网
//
//第一题：实现队列操作，输入“PUSH”时，将数插入队尾；输入“TOP”时，
// 输出队首；输入“POP”时，弹出队首；输入“SIZE”，输出队列长度；输入“CLEAR”，清空队列
//一开始用队列超时了，就换成了数组AC了

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T;
        T =sc.nextInt();
        String nextline="";
        List<Integer> queue=new LinkedList<>();
        while(T-->0){
            queue.clear();
            int k=sc.nextInt();
            sc.nextLine();
            for(int i=0;i<k;i++){
                nextline=sc.nextLine();
                String[] odor=nextline.split(" ");
                if(odor[0].equals("PUSH")){
                    queue.add(Integer.valueOf(odor[1]));
                }else if(odor[0].equals("TOP")){
                    if(queue.size()==0)
                        System.out.println(-1);
                    else
                        System.out.println(queue.get(0));
                }else if(odor[0].equals("POP")){
                    if(queue.size()==0)
                        System.out.println(-1);
                    else
                        queue.remove(0);
                }else if(odor[0].equals("SIZE")){
                    System.out.println(queue.size());
                }else{
                    queue.clear();
                }
            }
        }
    }
}