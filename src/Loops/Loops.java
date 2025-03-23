package Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
        Syntax of for loop:
        for(initialisation; condition; increment/decrement) {
            body
        }
        */
        //Q: Print numbers from 1 to 5
        for (int num = 1; num <= 5; num++) {
            System.out.println(num);
        }

        //print numbers from 1 to n
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        for(int num = 1; num <= n; num++) {
            System.out.print(num + " ");
        }

        //while loops
        /*
        Syntax:
        while (condition) {
        body
        }
         */
        int num1 = 1;
        while (num1 <= 5) {
            System.out.println(num1);
            num1++;
        }

        //do while
        /*
        do {
        //body
        }while (condition):
         */
        int num2 = 1;
        do {
            System.out.println(num2);
            num2++;
        } while (num2 <= 5);
    }
}
