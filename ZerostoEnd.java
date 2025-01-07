public class ZerostoEnd{
    public static int[] moveZerostoEnd(int [] arr){
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
            if(arr[j]!=0){
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] a={1,0,2,0,3,0,5};
        moveZerostoEnd(a);
        for(int val: a){
            System.out.print(val+" ");
        }
    }
}