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
//Display List

    public void display(){
        Node current= head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
 //merge two sorted Linked Lists
    public  Node mergeSortedLL(Node a ,Node b ){
        Node dummy= new Node(0);
        Node tail=dummy;
        while(a!=null && b!=null){
            if(a.data<b.data){
                tail.next=a;
                a=a.next;

            }
            else {
                tail.next=b;
                b=b.next;

            }
            tail=tail.next;

        }
        if(a==null){
            tail.next=b;
        }
        else{
            tail.next=a;
        }

        return dummy.next;
    }

// add numbers
    public Node AddNumbers(Node a, Node b) {

        Node dummy= new Node(0);
        Node tail=dummy;
        int c=0;
        while(a!=null || b!=null){
            int x= (a!=null)? a.data:0;
            int y= (b!=null)? b.data:0;
            int sum=x+y+c;
            int r= sum%10;
            int q=sum/10;
            tail.next= new Node(r);
            tail=tail.next;
            if(a!=null) a=a.next;
            if(b!=null) b=b.next;
            c=q;
            if(c!=0){
                tail.next=new Node(c);
            }
        }
        return dummy.next;

    }
//main method
    public static void main(String[] args) {
        SinglyLinkedList sll1=new SinglyLinkedList(7);
        sll1.append(4);
        sll1.append(9);
        SinglyLinkedList sll2= new SinglyLinkedList(5);
        sll2.append(6);
        //sll2.append(1);
        SinglyLinkedList result= new SinglyLinkedList(0);
        result.head= result.AddNumbers(sll1.head,sll2.head);
        sll1.display();
        sll2.display();
        result.display();

//        SinglyLinkedList sllA= new SinglyLinkedList(1);
//        SinglyLinkedList sllB= new SinglyLinkedList(5);
//        sllA.append(2);
//        sllA.append(4);
//        sllA.append(7);
//        sllA.append(10);
//
//        sllB.append(6);
//        sllB.append(8);
//        sllB.append(9);
//        //sllA.display();
//        //sllB.display();
//        SinglyLinkedList result= new SinglyLinkedList(0);
//        result.head=result.mergeSortedLL(sllA.head,sllB.head);
//        result.display();



//        SinglyLinkedList myLinkedList= new SinglyLinkedList(1);
//        myLinkedList.append(11);
//        myLinkedList.append(0);
//        myLinkedList.append(2);
//        myLinkedList.append(5);
//        myLinkedList.append(12);
//        myLinkedList.append(17);
//        myLinkedList.append(21);
//        myLinkedList.append(30);
//        myLinkedList.remDuplicate();
//        myLinkedList.createALoopinLinkedList();
//        myLinkedList.hasLoop();
//        myLinkedList.insertNodeSortedList(10);
//        myLinkedList.remKey(2);
//
//        myLinkedList.prepend(1);
//        System.out.println(myLinkedList.head.data);
//
//        myLinkedList.insertNode(20,2);
//        myLinkedList.reverseLinkedList();
//        Node current= myLinkedList.head;
//        int len=0;
//        while(current!=null){
//            System.out.println(current.data);
//            current=current.next;
//            len++;
//        }
//        System.out.println("Length is: "+myLinkedList.length);
//        System.out.println("Mid of the LinkedList is "+ myLinkedList.middleList().data);
//        System.out.println("Kth item is "+myLinkedList.kthNode(4).data);
//        System.out.println(myLinkedList.hasLoop());

    }

}