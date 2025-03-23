package Function;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        int ans = sum2();
        System.out.println(ans);
    }

    static int sum2() {
        Scanner input = new Scanner(System.in);

        int num1, num2, sum;
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        sum = num1 + num2;
        return sum;
    }
    /*
    static void sum() {
        Scanner input = new Scanner(System.in);

        int num1, num2, sum;
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
    */

}
