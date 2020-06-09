class ListNode{
    int value;
    ListNode next;
   ListNode(int data){
        this.value = data;
    }
}

//合并两个单链表
public class Main {

        public static void main(String[] args) {
            //Scanner in = new Scanner(System.in);
            //int a = in.nextInt();
            //System.out.println(a);
            System.out.println("Hello World!");
        }

        public ListNode mertgeTwoListUnrecu(ListNode head1, ListNode head2){
            if(head1 == null )
                return head2;
            if(head2 == null )
                return head1;
            ListNode result = new ListNode(-1);

            if(head1.value < head2.value){
                result.next = mertgeTwoListUnrecu(head1.next, head2);
            }else{
                result.next = mertgeTwoListUnrecu(head1, head2.next);
            }

            return result.next;
        }

        public static ListNode mergeTwoList(ListNode head1, ListNode head2){

            if(head1 == null){
                return head2;
            }
            if(head2 == null){
                return head1;
            }

            ListNode result = new ListNode(-1);
            ListNode temp = result.next;

            while(head1 != null && head2 != null){
                if(head1.value < head2.value){
                    temp = head1;
                    temp = temp.next;
                    head1 = head1.next;
                }else{
                    temp = head2;
                    temp = temp.next;
                    head2 = head2.next;
                }
            }

            while(head1 != null){
                temp = head1;
                temp = temp.next;
                head1 = head1.next;
            }

            while(head2 != null){
                temp = head2;
                temp = temp.next;
                head2 = head2.next;
            }
            return result.next;
        }
    }

