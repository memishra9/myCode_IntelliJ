package DataStructureandAlgorithm;
public class ReverseArray{

    public static int[] reverseArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        int temp=0;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.println(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,4,5,6,10};
        printArray(reverseArray(arr));


    }
}