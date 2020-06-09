import java.util.Scanner;
import java.util.Stack;

//用两个栈实现队列
public class Main4 {
    public static class TwoStacksQueue {
        private Stack<Integer> stackPush;
        private Stack<Integer> stackPop;

        public TwoStacksQueue() {
            stackPush = new Stack<Integer>();
            stackPop = new Stack<Integer>();
        }

        public void add(int pushInt) {
            stackPush.push(pushInt);
        }

        public void poll() {
            if (stackPop.empty() && stackPush.empty()) {
                throw new RuntimeException("Queue is empty!");
            } else if (stackPop.empty()) {
                while (!stackPush.empty()) {
                    stackPop.push(stackPush.pop());
                }
            }
            stackPop.pop();
        }

        public int peek() {
            if (stackPop.empty() && stackPush.empty()) {
                throw new RuntimeException("Queue is empty!");
            } else if (stackPop.empty()) {
                while (!stackPush.empty()) {
                    stackPop.push(stackPush.pop());
                }
            }
            return stackPop.peek();
        }
    }
    public static void main(String [] args){
        TwoStacksQueue queue = new TwoStacksQueue();
        Scanner sc = new Scanner(System.in);
        int N = Integer.valueOf(sc.nextLine());
        for(int i = 0; i < N; i++){
            String nextline = sc.nextLine();
            if("peek".equals(nextline)){
                System.out.println(queue.peek());
            }else if("poll".equals(nextline)){
                queue.poll();
            }else if("add".equals(nextline.substring(0,3))){
                int add = Integer.valueOf(nextline.substring(4));
                queue.add(add);
            }
        }
    }
}
