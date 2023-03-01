import java.util.Scanner;

public class Q3_Greatest_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        String greatest = (a>b)?((a>c)?"A = "+a:"C = "+c):((b>c)?"B = "+b:"C = "+c);
        System.out.println("Greatest "+greatest);
    }
}
