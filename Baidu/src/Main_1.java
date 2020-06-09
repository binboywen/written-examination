import java.util.Scanner;

//找出两个数a，b，满足1<=a,b<=n且lcm(a,b) - gcd(a,b)尽量大，输出最大的
//lcm(a,b) - gcd(a,b)，lcm(a,b)表示a和b的最小公倍数，gcd(a,b)表示a和b的
//最大公约数
public class Main_1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(n * (n - 1) - 1);
    }
}
