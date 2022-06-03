package offer;

import javax.xml.soap.Node;

public class ListNode {
    public int val;
    public ListNode next;


    public ListNode(int val) {
        this.val = val;
        next=null;

    }
    public ListNode(int val, ListNode node) {
        this.val = val;
        next=node;

    }
    public ListNode( ListNode node) {
        this.val = 0;
        next=node;

    }
    public ListNode() {
        this.val = 0;
        next=null;

    }
   public ListNode add(int val){
       ListNode next=new ListNode(val);
        this.next=next;
        next.next=null;
        return next;
    }
    public ListNode add(int val,ListNode node){
        ListNode next=new ListNode(val,node);
        this.next=next;
        next.next=null;
        return next;
    }
    public ListNode add(ListNode node){

        this.next=node;

        return next;
    }
    public ListNode add(){
        ListNode next=new ListNode();
        this.next=next;
        next.next=null;
        return next;
    }
    public int length(){
        int size=0;
        ListNode cur=this;
        while (cur!=null) {

            size++;
            cur=cur.next;

        }
        return size;
    }
    public void foreach(){
      ListNode cur=this;
      while (cur!=null){
          System.out.println(cur.val);
          cur=cur.next;
      }
    }
    public ListNode reverse( ListNode head) {
        ListNode pre=null;
        ListNode cur=head;
        while (cur!=null) {
            ListNode next=cur.next;
            cur.next=pre;    //这个是核心代码 就一句，
            pre=cur;
            cur=next;

        }
        return pre;


    }

}
/*
class test{
    public static void main(String[] args) {
        offer.ListNode listNode = new offer.ListNode(3);
        listNode.add(2).add(3).add(3).add(6).add(78);
        System.out.println(listNode.length());
    }
}
*/
