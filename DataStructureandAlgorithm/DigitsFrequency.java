package DataStructureandAlgorithm;
public class DigitsFrequency{
    public int frequency(int num, int digit){

        int r=0;
        int cnt=0;
        while(num>0){

             r=num%10;
             if(r==digit){
                 cnt++;
             }
             num=num/10;


        }
        return cnt;
    }

    public static void main(String[] args) {
        DigitsFrequency fre= new DigitsFrequency();
        System.out.println(fre.frequency(123452346,2));

    }
}