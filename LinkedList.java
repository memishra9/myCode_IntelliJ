public class LinkedList {

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
    public LinkedList(int value){
        Node NewNode= new Node(value);
        head=NewNode;
        tail=NewNode;
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

    public void removeLast(){
        Node curr=head;
        Node prev=head;
        while(curr.next!=null){
            prev= curr;

            curr=curr.next;

        }
        tail=prev;
        tail.next=null;
        length--;
    }

    public void prepend(int value){
        Node nNode= new Node(value);
        if(head==null){
            head=nNode;
            tail=nNode;
            length=1;
        }
        else{

            nNode.next=head;
            head=nNode;
            length++;
        }

    }

    public Node removeFirst(){

        if(length==1){
            return null;
        }
        else{
            head=head.next;
            length--;
        }
        return head;
    }

    public int get(int index){
       Node tmp=head;
        for(int i=0; i<index; i++){
            tmp=tmp.next;

        }
        return tmp.value;

    }

    public boolean set(int data, int index){
        if(length<index+1){
            return false;
        }
        else{
            Node tmp= head;
            for(int i=0; i<=index; i++){

                if(index==0){
                    head.value=data;
                    return true;
                }

                else if(i==index){


                    tmp.value=data;

                }
                tmp=tmp.next;
            }
        } return true;
    }



        public Node middleValue(){
            Node fast=head;
            Node slow= head;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;





    }

    public boolean hasLoop(){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }

        } return false;


    }


    public Node findKthFromEnd(int k){
        Node fast=head;
        Node slow=head;
        for(int i=0; i<k; i++){
            fast=fast.next;
        }
        while(fast!=null && fast.next!=null){

            fast=fast.next;
            slow=slow.next;

        }
        return slow.next;


    }
    public void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }

    }
    public void getHead(){
        System.out.println("Head: "+head.value);
    }

    public void getTail(){
        System.out.println("Tail: "+ tail.value);
    }

    public void getLength(){
        System.out.println("Length: "+length);
    }
}
