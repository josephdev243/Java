package Classwork;
import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();

        System.out.print("Enter the day of the week: ");
        System.out.println(day);
        //int day = 4;
        String weekdayString = null;

        switch(day) {
            case 1: weekdayString = "Monday";
               break;
            case 2: weekdayString = "Tuesday";
                break;
            case 3: weekdayString = "Wednesday";
                break;
            case 4: weekdayString = "Thursday";
                break;
            case 5: weekdayString = "Friday";
                break;
            case 6: weekdayString = "Saturday";
                break;
            case 7: weekdayString = "Sunday";
                break;
            default:
                System.out.println("Wrong input");
        }
        System.out.println(weekdayString);
    }
}
