package Loops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.println(largest(5, 10));
    }
    public static int largest(int a, int b){
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }
}
