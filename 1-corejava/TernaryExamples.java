public class TernaryExamples {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        // Ternary operator for simple condition
        String result = (x > y) ? "x is greater than y" : "y is greater than or equal to x";
        System.out.println(result); // Output: "y is greater than or equal to x"

        // Ternary operator for multiple conditions
        int age = 20;
        String message = (age >= 18) ? "You are eligible to vote" : "You are not eligible to vote";
        System.out.println(message); // Output: "You are eligible to vote"

        // Ternary operator with nested ternary
        int number = 15;
        String parity = (number % 2 == 0) ? "even" : ((number % 2 != 0) ? "odd" : "invalid");
        System.out.println(parity); // Output: "odd"

        // Ternary operator with method invocation
        int value = 10;
        String resultString = (isPositive(value)) ? "Positive" : "Non-positive";
        System.out.println(resultString); // Output: "Positive"
    }

    // Method to check if a number is positive
    private static boolean isPositive(int number) {
        return number > 0;
    }
}
