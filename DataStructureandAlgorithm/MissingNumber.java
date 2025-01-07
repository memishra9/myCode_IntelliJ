package DataStructureandAlgorithm;
public class MissingNumber{
    public static int findMissingNo(int[] arr){
        int n=arr.length+1;
        int sum=0;
        int missing=0;
        for(int ele : arr){
            sum+=ele;

             missing=(n*(n+1)/2)-sum;
        }
        return missing;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
        System.out.println(findMissingNo(arr));
    }
}