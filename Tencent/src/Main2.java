import java.util.Scanner;
//输入n，A集合中有n个点的坐标；
// B集合中有n个坐标，求A集合中某个点和B集合中的某个点之间的最小距离，即sqrt ( (x1-x2)^2+(y1-y2)^2 )最小

public class Main2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T>0){
            int n = scanner.nextInt();
            long [][] A = new long[n][2];
            long [][] B = new long[n][2];
            for(int i = 0; i < n; i++){
                A[i][0] = scanner.nextLong();
                A[i][1] = scanner.nextLong();
            }
            for(int i = 0; i < n; i++){
                B[i][0] = scanner.nextLong();
                B[i][1] = scanner.nextLong();
            }
            double res = getMinDistance(A,B,n);
            System.out.println(String.format("%.3f",res));
            T--;
        }
    }

    public static double getMinDistance(long[][]A, long [][] B, int n){
        double minDistance = Double.MAX_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                double temp = Math.sqrt((A[i][0] - B[j][0])*(A[i][0] - B[j][0]) + (A[i][1] - B[j][1])*(A[i][1] - B[j][1]));
                if( temp < minDistance)
                    minDistance = temp;
            }
        }
        return minDistance;
    }
}
