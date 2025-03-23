package Classwork;

import java.util.Scanner;
public class Iteration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n= input.nextInt();

        int count = 0;
        int i = 1;
        //int sum = 0;
        while(i <= n) {
            if(n % i == 0) {
                //System.out.println(i);
                count++;

            }
            i++;
        }
            if(count == 2) {
                System.out.println(n + " is a prime number");

            }
            else{
                System.out.println(n + " is not a prime");
            }
    }
        //System.out.println(sum);



        //for(int i = 1; i <= 10; i++) {
           // System.out.println("Hello World!");
        //}
}

