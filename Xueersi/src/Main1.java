import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


//给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数
public class Main1 {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String [] strings = str.split(",");
        int [] nums = new int[strings.length ];

        for(int i = 0; i < strings.length; i++){
            nums[i] = Integer.parseInt(strings[i]);
        }

        System.out.println(method(nums));
    }

    public static String method(int [] nums){
        String temp;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if((o1.toString() + o2.toString()).compareTo(o2.toString() + o1.toString()) > 0){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        if(list.get(list.size() -1 ) == 0){
            return "0";
        }
        temp = "";
        while(!list.isEmpty()){
            temp = temp + list.remove(list.size() - 1);
        }
        return temp;
    }
}
