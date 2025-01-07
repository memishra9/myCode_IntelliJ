package DataStructureandAlgorithm;
public class Palindrome {
    public static boolean isPalindrome(String s){
        char[] charArray= s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="madam";
        System.out.println(isPalindrome(s));
    }
}