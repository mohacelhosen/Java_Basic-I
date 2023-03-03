import java.util.*;
public class Q11_multiplication_table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mtn = in.nextInt();
        for(int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d\n",mtn,i,(mtn*i));
        }
    }
}
