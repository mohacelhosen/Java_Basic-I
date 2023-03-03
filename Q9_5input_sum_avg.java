/*
    Test Data
    -----------
    Input the 5 numbers : 1 2 3 4 5

    Expected Output :
    ---------------------
    Input the 5 numbers :                                                            
    1                                                                                
    2                                                                                
    3                                                                                
    4                                                                                
    5                                                                                
    The sum of 5 no is : 15                                                          
    The Average is : 3.0 
*/
import java.util.Scanner;
public class Q9_5input_sum_avg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum=0;
        System.out.print("Input the 5 numbers : ");
        for(int i=1; i<=5; i++){
            int temp = in.nextInt();
            System.out.println(temp);
            sum =sum + temp;
        }
        double average = (double)sum/5;

        System.out.println("The sum of 5 no is : "+sum);
        System.out.println("The Average is : "+average);

    }
}
