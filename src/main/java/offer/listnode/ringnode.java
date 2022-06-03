package offer.listnode;

import offer.ListNode;

import java.util.regex.PatternSyntaxException;

public class ringnode {
    public static ListNode fun(ListNode listNode) {

        ListNode fast=listNode; ListNode slow=listNode;
        ListNode slow2=null;
        if(listNode==null){return null;}
        if(listNode.next==null){return null;}
        if(fast.next.next==null){return null;}
        while (slow.next!=null&&fast.next.next!=null) {

            slow=slow.next;
            if(slow2!=null){slow2=slow2.next;}
          fast=fast.next.next;
            if (slow==fast) {
                slow2=listNode;
            }
            if (slow==slow2) {
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        ListNode certer = listNode.add().add().add().add().add().add().add().add().add().add(5);
        certer.add().add().add().add().add().add().add().add().add().add().add().add().add().add(certer);
        System.out.println(fun(listNode).val);

    }
}
