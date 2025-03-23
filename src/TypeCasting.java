import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float num = input.nextFloat();
        System.out.println(num);

        //Type casting
        int number = (int)(75.789f);
        System.out.println(number);

        //automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); //adding 257 % 256 = 1

        System.out.println(b);
    }
}
