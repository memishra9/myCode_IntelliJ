package DataStructureandAlgorithm;
public class ZeroestoEnd{
    public static int[] moveZerotoEnd(int[] arr){
        int j=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0 && arr[j]==0){
                int tmp= arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }
            if(arr[j]!=0){
                j++;
            }

        }
        return arr;
    }
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.println(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={0,1,0,4,12};
        printArray(moveZerotoEnd(arr));


    }
}