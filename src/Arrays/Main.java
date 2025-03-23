package Arrays;

public class Main {
    public static void main(String[] args) {
        //Q: Store a roll number
        int a = 19;

        //Q: Store a person's name
        String name = "Joseph";

        //Array is a collection of data types.
        //Syntax
        //datatype[] variable_name = new datatype[size]

   //     int [] rnos = new int[5];
        int[] rnos; //declaration of array. rnos is getting defined in the stack;
        rnos = new int[5];//initialization: actually here object is being created in the memory(heap)

        System.out.println(rnos[1]);

    }
}
