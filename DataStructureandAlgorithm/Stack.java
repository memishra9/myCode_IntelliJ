package DataStructureandAlgorithm;

import java.util.EmptyStackException;

public class Stack{
    private Node top;
    private int length;
    private class Node {
       private int data;
       private Node next;

        Node(int data){
            this.data=data;
        }
    }
    public Stack(){
        top=null;
        length=0;

    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }

    public void push(int data){
        Node tmp= new Node(data);
        tmp.next=top;
        top=tmp;
        length++;


    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result= top.data;
        top =top.next;
        length--;
        return result;
    }
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stack s= new Stack();
        System.out.println("Length is :" +s.length());
        s.push(10);
        s.push(15);
        s.push(20);
        s.pop();
        System.out.println(s.peek());

    }
}