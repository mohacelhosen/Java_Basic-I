/* Q2 
        Write a Java program to solve quadratic equations (use if, else if and else).

        Example 1: Find the roots of the equation  x^2 – 5x + 6 = 0 using the quadratic formula.
        Example 2: Find the roots of 4x^2 + 3x + 5 = 0 using quadratic formula.(a = 4, b = 3, c = 5)

        Note
        -----------
        x = [-b ± √(b^2 – 4ac)]/ 2a
         b^2 – 4ac is called the discriminant and is denoted by D
        The nature of the roots of a quadratic equation can be determined based on the value of D.
        If D = 0, the two roots are real and equal
        If D > 0, the roots are real and unequal
        If D < 0, the roots are not real, i.e. imaginary
 */
import java.util.Scanner;
public class Q2_Quadratic_Equations {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a =  in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        String x1, x2;

        int discriminant  =(b*b)-4*a*c;
        if(discriminant>0){
            x1 =String.valueOf(( -b + (int)Math.sqrt(discriminant)) / 2*a);
            x2 =String.valueOf(( -b - (int)Math.sqrt(discriminant)) / 2*a);
        }else if(discriminant == 0){
            x1 =String.valueOf(( -b + (int)Math.sqrt(discriminant)) / 2*a);
            x2 =String.valueOf(( -b - (int)Math.sqrt(discriminant)) / 2*a);
        }else{
            x1 =-b +" + i sqrt("+discriminant+")/"+(2*a);
            x2 =-b +" - i sqrt("+discriminant+")/"+(2*a);
        }
        System.out.println("X : "+x1);
        System.out.println("X : "+x2);
    }
}
