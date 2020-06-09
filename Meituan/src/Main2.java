import java.util.Scanner;
import java.util.Vector;

//给定四个数a,b,m,x 然后有个运算法则是x=(a*x+b)%m，因为是取余，所以x是重复的，把重循环长度打印出来
//
//input a,b,m,x
//while true:
//x=(a*x+b)%m
//print(x)
//end while
//输入：依次为a,b,m,x
//2 1 5 2
//输出：由于运算依次输出0,1,3,2,0,1,3,2,0,1,3,2....，循环的长度最小为4
public class Main2 {
    public static void main(String [] args){
        String s = "1";
        Integer.valueOf(s);
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long m = sc.nextLong();
        long x = sc.nextLong();
        Vector v = new Vector();
        while(true){
            x = (a * x + b) % m;
            if(v.contains(x)){
                System.out.println(v.size() - v.indexOf(x));
                return;
            }
            v.add(x);
        }
    }
}
