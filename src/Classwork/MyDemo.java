package Classwork;

public class MyDemo {
    public static void main(String[] args) {
        String name = "John";
        display(name); // Call display method

        int value = sum(5, 10, 15); // Call sum method
        System.out.println("Sum: " + value);
    }

    public static void display(String str) { // Parameter name should be lowercase
        System.out.println("Hello, " + str);
    }

    public static int sum(int a, int b, int c) { // Method name in camelCase
        return a + b + c;
    }
}

