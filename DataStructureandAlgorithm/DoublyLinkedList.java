package DataStructureandAlgorithm;
public class DoublyLinkedList{
    Node head;
    Node tail;
    int length;

    public class Node{
        int data;
        Node next;
        Node previous;

        Node(int data){
            this.data=data;
        }

    }
    DoublyLinkedList(){
        this.head=head;
        this.tail=tail;
        this.length=0;

    }


    public static void main(String[] args) {
        SinglyLinkedList sll= new SinglyLinkedList(1);
        System.out.println(sll.head);
    }

}