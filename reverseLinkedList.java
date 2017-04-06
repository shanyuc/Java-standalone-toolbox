public class reverseLinkedList{
    ListNode reverse(ListNode node){
        ListNode newHead = null;
        ListNode cur = node;
        while(cur!=null){
            ListNode tmp = cur.next;
            cur.next = newHead;
            newHead = cur;
            cur = tmp;
        }
        return newHead;
    }

}
