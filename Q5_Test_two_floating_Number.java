/* 
Test two floating-point numbers are same upto three decimal places
Test Data
-------------
Input floating-point number: 25.586
Input floating-point another number: 25.589
*/
import java.util.*;
public class Q5_Test_two_floating_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();

        x= Math.round(x*1000);
        x=x/1000;
        y= Math.round(x*1000);
        y=y/1000;
        
        if (x==y){
            System.out.println("They are same");
        }else{
            System.out.println("They are different");
        }
    }
}
