import java.util.*;
public class Main3 {
    public static void main(String[] args) {
        //n个数组合并，每个数组一行，第一行为数组个数n
        //其实也可以用小根堆
        TreeMap<Integer,Integer> sortedMap=new TreeMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String x=sc.nextLine();
            String[] strings=x.split(" ");
            for(String s:strings){
                int tm=Integer.valueOf(s);
                sortedMap.put(tm,sortedMap.getOrDefault(tm,0)+1);
            }
        }
        Iterator iter = sortedMap.keySet().iterator();
        while (iter.hasNext()) {
            Integer key = (Integer) iter.next();
            Integer value = (Integer)sortedMap.get(key);
            for (int i = 0; i < value; i++) {
                System.out.print(key+" ");
            }
        }
    }
}