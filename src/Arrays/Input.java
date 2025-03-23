package Arrays;

import java.util.Scanner;
import java.util.Arrays;  // Import Arrays class

public class Input { // Class name should match the file name (Input.java)
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        // Predefined values
        arr[0] = 50;
        arr[1] = 73;
        arr[2] = 530;
        arr[3] = 85;
        arr[4] = 235;

        // Print the fourth element (index 3)
        System.out.println("Predefined value at index 3: " + arr[3]);

        // Input values using a loop
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Print array elements using Arrays.toString()
        System.out.println("Updated array: " + Arrays.toString(arr));

        // Print array elements using enhanced for-loop
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        input.close(); // Close scanner to prevent resource leak
    }
}
