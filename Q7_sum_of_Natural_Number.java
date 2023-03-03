/*
 Write a program in Java to display n terms of natural numbers and their sum.

Test Data
---------------
Input the number: 2
Expected Output :
*/
import java.util.Scanner;

public class Q7_sum_of_Natural_Number {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n_th = in.nextInt();
        int sum =0;
        System.out.println("The first n natural numbers are :  ");
        for(int i=1; i<=n_th; i++){
            sum = sum+i;
            System.out.println(i);
        }
        System.out.println("The Sum of Natural Number upto n terms : "+sum);
    }
}
