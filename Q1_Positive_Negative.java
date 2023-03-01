/* Q1
    Write a Java program to get a number from the user and print whether it is positive or negative.
*/
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your favorite number: ");
        int number = in.nextInt();
        if(number>0){
            System.out.println("positive number");
        }else{
            System.out.println("negative number");
        }
    }
}