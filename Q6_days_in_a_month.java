/* 
Write a Java program to find the number of days in a month. 

Test Data
--------------
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days

*/
import java.util.*;
public class Q6_days_in_a_month{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int year = in.nextInt();
        System.out.println("Days in that month: "+getDaysInMonth(month, year));
    }

    public static int getDaysInMonth(int month, int year){
        int daysInMonth;
        switch(month){
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                daysInMonth = 31;
                break;
                case 4: // April
                case 6: // June
                case 9: // September
                case 11: // November
                daysInMonth=30;
                break;
            case 2:
                if(year%4==0 && (year%100!=0 || year%400==0)){
                    daysInMonth=29;
                    break;
                }else{ 
                    daysInMonth =28;
                    break;
                }
            default: daysInMonth=-1;
        }
        return daysInMonth;
    }
}