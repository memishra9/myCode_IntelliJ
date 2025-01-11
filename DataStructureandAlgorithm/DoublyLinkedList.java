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
    DoublyLinkedList(int data){
        Node newNode= new Node(data);
        head=newNode;
        tail=newNode;
        length=1;
    }


    public static void main(String[] args) {
        SinglyLinkedList sll= new SinglyLinkedList(1);
        System.out.println(sll.head.data);
    }

}