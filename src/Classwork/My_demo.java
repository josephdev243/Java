package Classwork;

public class My_demo {
    public static void main(String[] args) {
        String name = "John";
        display(name);
        int value = Sum(5 , 10 , 15);
        System.out.println(value);
    }
    public static void display(String Str){
        System.out.println(Str);
    }

    public static int Sum(int a, int b, int c) {
        int total = a + b + c;
        return total;

    }
}
