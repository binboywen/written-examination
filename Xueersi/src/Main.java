import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//字符串转整数 ac60%
//如果字符串是空格开头，则移除空格后，遍历字符串直到最后一个非数字字符，然后输出这个整型数值
//1234xes  4567 ->1-1234
//xes 1234 ->0-0
//1234xes 1234xes ->?

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char [] charArray = str.toCharArray();
        int index = 0;
        while(charArray[index++] == ' '){}
        System.out.println(str2Int(charArray));
    }
    public static StringBuilder str2Int(char [] charArray){
        Queue queue = new LinkedList<>();
        for(int i = 0; i < charArray.length; i++){
            if(charArray[i] >= '0' && charArray[i] <= '9'){
                queue.add(charArray[i]);
            }
            //if((charArray[i] >= 'a' && charArray[i] <= 'z') | (charArray[i] >= 'A' && charArray[i] <= 'Z'))
            else {
                break;
            }
        }
        if(queue.isEmpty()){
            return new StringBuilder("0-0");
        }
        StringBuilder sb = new StringBuilder("1-");
        while(!queue.isEmpty()){
            sb.append(queue.poll());
        }
        return  sb;
    }
}
