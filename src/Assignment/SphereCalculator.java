package Assignment;

import java.util.Scanner;

public class SphereCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sphere Calculator");
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Calculate volume: V = (4/3)πr³
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        // Calculate surface area: A = 4πr²
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        // Print results to 4 decimal places as specified
        System.out.printf("Volume: %.4f\n", volume);
        System.out.printf("Surface Area: %.4f\n", surfaceArea);

        scanner.close();
    }
}
