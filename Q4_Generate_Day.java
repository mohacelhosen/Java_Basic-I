/*
Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday. 
*/
import java.util.Scanner;
public class Q4_Generate_Day {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number (1-7): ");
		int day=in.nextInt();
		switch(day){
			case 1: System.out.print("Sunday");
						break;
			case 2: System.out.print("Monday");
						break;
			case 3: System.out.print("Tuesday");
						break;
			case 4: System.out.print("Wednesday");
						break;
			case 5: System.out.print("Thursday");
						break;
			case 6: System.out.print("Friday");
						break;
			case 7: System.out.print("Saturday");
						break;
			default:
				System.out.print("Invalid input");
			
		}
	}
}
