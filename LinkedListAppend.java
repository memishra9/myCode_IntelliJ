public class LinkedListAppend{
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

    Node(int value){
        this.value=value;
    }
    }

    public LinkedListAppend(int value){
        Node LL= new Node(value);
        head=LL;
        tail=LL;
        length=1;
    }

    public void append(int value){
        Node newNode= new Node(value);
        if(head==null){

            head=newNode;
            tail=newNode;
            length=1;
        }
        else{

            tail.next=newNode;
            tail=newNode;

        }
        length++;

    }
    public void printLL(){
        Node tmp=head;
        while(tmp!=null){
            System.out.println(tmp.value);
            tmp=tmp.next;
        }
    }


}