package DataStructureandAlgorithm;


//Create SinglyLinkedList class
public class SinglyLinkedList{
    Node head;
    Node tail;
    int length;
 // Create Node class
    public class Node {
        int data;
        Node next;
//Node constructor
        Node(int data) {
            this.data=data;

        }
    }
 //SinglyLinkedList Constructor
    SinglyLinkedList(int data){
        Node newNode = new Node(data);
        head=newNode;
        tail=newNode;
        length=1;

    }
 // append method to append new Nodes to linkedlist
    public void append(int value){
        Node NewNode= new Node(value);
        if(head==null){
            head=NewNode;
            length++;
        }
        else{

            tail.next=NewNode;
            tail=NewNode;
            length++;
        }
    }
 //add Node to beginning
    public void prepend(int value){
        Node newNode= new Node(value);
        if(head==null){
            head=newNode;
            length++;
        }
        else{
            Node tmp= head;
            head=newNode;
            head.next=tmp;
            length++;
        }
    }
// Insert node at given position
    public void insertNode(int value, int pos){
        Node newNode= new Node(value);
        Node curr=head;
        for(int i=1; i<pos;i++){
            curr=curr.next;
        }
        newNode.next=curr.next;
        //System.out.println(newNode.next.data);
        curr.next=newNode;
        length++;


    }
// Reverse the Singlylinkedlist
public void reverseLinkedList() {
    Node previous = null;
    Node curr = head;
    Node next = null;

    while (curr != null) {  // Loop until we reach the end of the list
        next = curr.next;  // Store next node
        curr.next = previous;  // Reverse current node's pointer
        previous = curr;  // Move previous to current node
        curr = next;  // Move to the next node
    }

    head = previous;  // Update head to the new first node
}
//find middle of sll
public Node middleList(){
        Node ptr=head;
        Node fastptr=head;
        while(fastptr!=null && fastptr.next!=null){
            ptr=ptr.next;
            fastptr=fastptr.next.next;
        }
        return ptr;
}
//Kth node from end
public Node kthNode(int k){
        Node slowptr=head;
        Node fastptr=head;
        int ctr=1;
        while(ctr<k ){
            fastptr= fastptr.next;
            ctr++;
        }
        while(fastptr!=null && fastptr.next!=null){
            fastptr=fastptr.next;
            slowptr=slowptr.next;
        }
        return slowptr;
}
// remove duplicate data from sll
public void remDuplicate(){

        Node current=head;
        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }

        }
}
//Insert Node to a sorted list
public void insertNodeSortedList(int value){
        Node newNode= new Node(value);
        Node current=head;
        Node temp=current;
        while(current!=null && current.data<newNode.data){
            temp=current;
            current=current.next;

        }
        temp.next=newNode;
        newNode.next=current;
}

//remove a given key
    public void remKey(int value){
        Node current=head;
        Node tmp=null;
        while(current!=null && current.data!=value){
            tmp=current;
            current=current.next;
        }
        if(current==null){
            return;
        }
        if(head.data==value){
            head=head.next;
            return;
        }
        tmp.next=current.next;
    }
//check if the sll has a loop using two pointer
    public boolean hasLoop(){
        Node slowPtr=head;
        Node fastPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
            if(slowPtr==fastPtr){
                return true;
        }

        }

         return false;
    }
//create a linkedlist that has loop
    public void createALoopinLinkedList(){
        Node first= new Node(1);
        Node second = new Node(2);
        Node third= new Node(3);
        Node fourth= new Node(4);
        Node fifth= new Node(5);
        Node sixth= new Node(6);

        head=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=third;


    }
//main method
    public static void main(String[] args) {
        SinglyLinkedList myLinkedList= new SinglyLinkedList(1);
        myLinkedList.append(11);
        myLinkedList.append(0);
        myLinkedList.append(2);
        myLinkedList.append(5);
        myLinkedList.append(12);
        myLinkedList.append(17);
        myLinkedList.append(21);
        myLinkedList.append(30);
        myLinkedList.remDuplicate();
        myLinkedList.createALoopinLinkedList();
        myLinkedList.hasLoop();
        myLinkedList.insertNodeSortedList(10);
        myLinkedList.remKey(2);

        myLinkedList.prepend(1);
        System.out.println(myLinkedList.head.data);

        myLinkedList.insertNode(20,2);
        myLinkedList.reverseLinkedList();
        Node current= myLinkedList.head;
        int len=0;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
            len++;
        }
        System.out.println("Length is: "+myLinkedList.length);
        System.out.println("Mid of the LinkedList is "+ myLinkedList.middleList().data);
        System.out.println("Kth item is "+myLinkedList.kthNode(4).data);
        System.out.println(myLinkedList.hasLoop());

    }

}