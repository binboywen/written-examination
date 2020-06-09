import java.util.Scanner;

//斐波那契数列的第N项能否被3整除
public class Main {
    public static long[] Fibonacci_dpA(){
        long [] fib = new long[1000000000 + 1];
        fib[0] = 1;
        fib[1] = 0;
        fib[2] = 1;
        fib[3] = 1;
        for(int i = 4; i <= 1000000000; i++){
            fib[i] = fib[i-1] + fib[i - 2];
        }
        return fib;
    }
    public static long[] Fibonacci_dpB(){
        long [] fib = new long[1000000 + 1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i <= 1000000; i++){
            fib[i] = fib[i-1] + fib[i - 2];
        }
        return fib;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long [] arrayB = Fibonacci_dpB();

        int T = sc.nextInt();
        while(--T >= 0){

            int A = sc.nextInt();
            int B = sc.nextInt();
            int N = sc.nextInt();
            long tempA = N == 0? 1 : arrayB[N -1];
            String result = ((A*tempA + B*arrayB[N]) % 3 == 0)? "YES" : "NO";
            System.out.println(result);
        }
    }
}
