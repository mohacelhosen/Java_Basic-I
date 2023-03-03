import java.util.Scanner;

public class Q12_n_terms_of_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int term = in.nextInt();
        int sum=0;
        System.out.print("The odd numbers are : ");
        for(int i=1; i<=term; i++){
            if(i%2!=0){
                System.out.print(i+" ");
                sum= sum+i;
            }
        }

        System.out.printf("\nThe Sum of odd Natural Number upto %d terms is: %d",term,sum);
    }
}
