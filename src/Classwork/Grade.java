package Classwork;

import java.util.Scanner;
public class Grade {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        double grade;
        while (true) {
            System.out.print("Enter the marks: ");
            grade = scanner.nextDouble();
            if(grade >= 0) {
                break;
            }
            else{
                System.out.println("Grade must be positive.");
            }
        }

        if(grade >= 70 && grade < 100){
            System.out.println("A");
        }
        else if(grade >= 60 && grade < 70){
            System.out.println("B");
        }
        else if(grade >= 50 && grade < 60){
            System.out.println("C");
        }
        else if(grade >= 40 && grade < 50){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}

