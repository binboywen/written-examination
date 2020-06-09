public class Main2 {
    /**
     * 输入一个链表，翻转链表从N到M个节点
     * 输入描述：1，2，3，4，5，6       3，5
     * 输出描述：1，2，5，4，3，6
     * */
    class ListNode{
        int val;
        ListNode next;
        ListNode(int data){
            val = data;
        }
    }
    public ListNode reverseListNode(ListNode head, int m, int n){
        if(head == null)
            return null;
        ListNode result = new ListNode(-1);
        result.next = head;
        ListNode start = head;
        ListNode pre = null;
        for(int i = 1; i < m; i++){
            pre = start;
            start = start.next;
        }

        for(int i = m; i < n; i++){
            ListNode temp = start.next;
            start.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }

        return result.next;
    }
}
