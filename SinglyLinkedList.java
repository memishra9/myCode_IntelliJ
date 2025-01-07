public class SinglyLinkedList{
    ListNode head;

    public static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+ "-->");
            current=current.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args){
        SinglyLinkedList sll= new SinglyLinkedList();
        sll.head= new ListNode(10);
        ListNode second= new ListNode(1);
        ListNode third= new ListNode(8);
        ListNode fourth= new ListNode(11);
        //connect nodes together
        sll.head.next=second;
        second.next= third;
        third.next= fourth;
        sll.display();
    }


}