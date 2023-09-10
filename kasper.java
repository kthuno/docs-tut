/**
 * This is a simple Java class that prints "Hello, World!" to the console
 * and contains some random functions for demonstration purposes.
 */
public class kasper {

    /**
     * This is the main function that is called when the program is executed.
     * It prints "Hello, World!" to the console.
     *
     * @param args The command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        // Calling some random functions
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);

        String reversed = reverseString("Java");
        System.out.println("Reversed String: " + reversed);
    }

    /**
     * This function adds two integers and returns the result.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of a and b.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * This function reverses a given string.
     *
     * @param str The input string to be reversed.
     * @return The reversed string.
     */
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
