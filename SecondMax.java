public class SecondMax{
    public static int secondMX(int[] arr) {

        int secondmax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            } else if (arr[i] > secondmax && arr[i] != max) {
                secondmax = arr[i];
            }


        }
        return secondmax;
    }
    public static void main(String[] args){
        int[] a={1,2,3,10,4,7};
        System.out.println(secondMX(a));
    }
}