package DataStructureandAlgorithm;

import java.util.EmptyStackException;

public class StackArray{
    int top;
    int length;
    int [] stack;

    StackArray(int capacity){
        top=-1;
        length=0;
        stack= new int[capacity];
    }
    public void push(int data){
        top++;
        stack[top]=data;
        length++;


    }
    public int peek(){
       if(isEmpty()){
           throw new EmptyStackException();
       }
        return stack[top];
    }
    public boolean isEmpty(){
       return  top<0;
    }

    public void pop(){
        if(top<0){
            throw new EmptyStackException();
        }

        stack[top]=0;
        top--;


    }

    public static void main(String[] args) {
        StackArray s= new StackArray(3);
        s.push(10);
        s.push(15);
        s.pop();
        s.pop();
        System.out.println(s.peek());


    }
}