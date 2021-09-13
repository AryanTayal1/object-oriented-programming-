package lab02;

public class SumDemo {
    public static void main(String[] args) {
        int sum=0;
        for(int i=41;i<250;i++) {
            if(i%5==0) {
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println("The sum of integers between 41 and 250 that are divisible by 5 is:"+sum);
    }

}
