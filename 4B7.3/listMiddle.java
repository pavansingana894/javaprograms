class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while((f.next!=null) && (f.next.next!=null)){
            f=f.next.next;
            s=s.next;
        }
        if(f.next==null) return s;
        else return s.next;
    }
}