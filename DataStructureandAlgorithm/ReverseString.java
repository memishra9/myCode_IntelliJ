package DataStructureandAlgorithm;

import java.util.Stack;

public class ReverseString{
    public char[] reverseString(String s){
        Stack<Character> stack= new Stack<>();
        char[] charArray= s.toCharArray();
        for(char c : charArray){
            stack.push(c);
        }
        for(int i=0; i< charArray.length; i++){
            charArray[i]=stack.pop();
        }
        return charArray;

    }

    public static void main(String[] args) {
        ReverseString result= new ReverseString();
        //char[] rev=result.reverseString("Deepak");
        for(char c : result.reverseString("Deepak")){
            System.out.print(c);
        }
    }

}