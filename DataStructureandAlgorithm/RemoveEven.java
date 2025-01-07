package DataStructureandAlgorithm;
public class RemoveEven{
    public int[] remEven(int[] arr){
        int oddcount=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2!=0){
                oddcount++;
            }
        }
        int[] result= new int[oddcount];
        int idx=0;
        for(int elem : arr){
            if(elem %2!=0){
                result[idx]=elem;
                idx++;
            }
        }
        return result;
    }
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] myArray={1,4,5,7,8,11};
        RemoveEven obj= new RemoveEven();
        printArray(obj.remEven(myArray));
    }

}