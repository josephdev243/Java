package Classwork;
import java.util.Scanner;

public class Thermometer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the current Temp: ");
        double currentTemp = scanner.nextDouble();

        if(currentTemp > 30.0) {
            System.out.println("It is too hot");
            System.out.println("End of weather report");
        }
        else{
            System.out.println("It is warm or cold");
            System.out.println("End of weather report");
        }
    }
}
