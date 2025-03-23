import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.print("Please enter some input: ");

        int rollNo = inputs.nextInt();

        System.out.println("Your roll number is " + rollNo);

        String name = inputs.next();
        System.out.println(name);

        float marks = inputs.nextFloat();
        System.out.println(marks);
    }
}
