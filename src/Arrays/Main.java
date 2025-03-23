package Arrays;

public class Main {
    public static void main(String[] args) {
        // Q: Store a roll number
        int a = 19;
        System.out.println("I am " + a + " years old");

        // Q: Store a person's name
        String name = "Joseph";
        System.out.println("My name is " + name);

        // Array is a collection of data types.
        // Syntax: datatype[] variable_name = new datatype[size];

        // Declaration & Initialization of Array
        int[] rnos = new int[5]; // Array of size 5 (default values will be 0)

        // Assigning values
        rnos[0] = 23;
        rnos[1] = 45;
        rnos[2] = 67;
        rnos[3] = 89;
        rnos[4] = 12;

        // Printing array elements
        System.out.println("Second element in array (index 1): " + rnos[1]); // Output: 45
        System.out.print("All elements in the array: ");
        for (int num : rnos) {
            System.out.print(num + " ");
        }
    }
}
