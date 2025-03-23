package Assignment;

import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Triangle Area Calculator (Heron's Formula)");
        System.out.println("Enter the lengths of the three sides:");

        System.out.print("Side a: ");
        double a = scanner.nextDouble();

        System.out.print("Side b: ");
        double b = scanner.nextDouble();

        System.out.print("Side c: ");
        double c = scanner.nextDouble();

        // Calculate s (half perimeter)
        double s = (a + b + c) / 2;

        // Calculate area using Heron's formula: A = √(s(s-a)(s-b)(s-c))
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Print result to 3 decimal places as specified
        System.out.printf("Triangle Area: %.3f\n", area);

        scanner.close();
    }
}
