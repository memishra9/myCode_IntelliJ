public class Palindrome{
    public static boolean isPalindrome(String str){
        char[] charArray = str.toCharArray();
        int start=0;
        int end= charArray.length-1;
        boolean result=true;
        while(start<end){
            if (charArray[start] != charArray[end]){
                 result=false;
            }
            start++;
            end--;
        }
        return result;

    }
    public static void main(String[] args){
        String word="teacher";
        System.out.println(isPalindrome(word));
    }
}