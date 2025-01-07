public class Main{
    public static void main(String[] args){
        LinkedList myLinkedList= new LinkedList(0);


        myLinkedList.append(10);
        myLinkedList.append(11);
        myLinkedList.append(12);
        myLinkedList.append(13);
        myLinkedList.append(14);
        //myLinkedList.removeLast();
        //myLinkedList.prepend(10);
        //System.out.println("Value at Index is "+ myLinkedList.get(3));;
        //myLinkedList.removeFirst();
        //myLinkedList.set(20,6);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        System.out.println("Mid value is "+myLinkedList.middleValue().value);
        System.out.println("Has Loop"+myLinkedList.hasLoop());

        System.out.println("Kth element from end "+myLinkedList.findKthFromEnd(3).value);


        myLinkedList.printlist();
    }
}