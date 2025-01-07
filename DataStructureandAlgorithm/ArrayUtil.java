package DataStructureandAlgorithm;

public class ArrayUtil {

    public void printArray(int[] arr){

        for(int i: arr){
            System.out.println(i+" ");
        }
    }

    public void demoArray(){
        int[] myArray= new int[5];
        myArray[0]=1;
        myArray[1]=0;
        myArray[2]=10;
        myArray[3]=3;
        myArray[4]=7;
        printArray(myArray);
    }

    public static void main(String[] args){

        ArrayUtil arrUtil= new ArrayUtil();
        arrUtil.demoArray();
    }
}
