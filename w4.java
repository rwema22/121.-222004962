public class w4 {
    public static void main(String args[]) {
        // Declaring and initializing int values
        int x = 10, sum = 0;

        // Do-while loop
        do {

            // Execution statements(Body of loop)

            // Here, the line will be printed even if the condition is false
            sum += x;
            x--;
        }

        // Now checking condition
        while (x > 5);

        // Summing up
        System.out.println("Summation: " + sum);
    }
}
