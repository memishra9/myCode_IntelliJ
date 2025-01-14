package DataStructureandAlgorithm;

import java.util.Stack;

public class ReverseString{
    public String reverseString(String s){
        Stack<Character> stack= new Stack<>();
        char[] charArray= s.toCharArray();
        for(char c : charArray){
            stack.push(c);
        }
        for(int i=0; i< charArray.length; i++){
            charArray[i]=stack.pop();
        }
        return new String(charArray);

    }

    public static void main(String[] args) {
        ReverseString obj= new ReverseString();
        //char[] rev=result.reverseString("Deepak");

            System.out.print(obj.reverseString("deepak"));
        }
    }

