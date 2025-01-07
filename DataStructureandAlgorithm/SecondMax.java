package DataStructureandAlgorithm;
public class SecondMax{

    public static int secondMax(int[] arr){
        int max= Integer.MIN_VALUE;
        int second_max= Integer.MIN_VALUE;
        for(int i : arr){
            if (i>max){

                second_max=max;
                max=i;

            }
            else if (second_max<i && i!=max){
                second_max=i;
            }
        } return second_max;
    }

    public static void main(String[] args) {
        int[] arr={12,34,2,34,33,1};
        System.out.println(secondMax(arr));
    }
}
