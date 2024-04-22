public class WhileLoopExample {
  public static void main(String[] args) {
    // Example 1: Print numbers from 1 to 5 using a while loop
    System.out.println("Example 1: Print numbers from 1 to 5 using a while loop");
    int i = 1;
    while (i <= 5) {
      System.out.println(i);
      i++;
    }

    // Example 2: Calculate the sum of numbers from 1 to 5 using a while loop
    // and print a value outside of the loop
    System.out.println("\nExample 2: Calculate the sum of numbers from 1 to 5 using a while loop");
    int sum = 0;
    int j = 1;
    while (j <= 5) {
      sum += j;
      j++;
    }
    System.out.println("Sum: " + sum);
    System.out.println("Good bye: " + j);

    // Example 3 : Nested while loop with another while loop condition
    int outerCounter = 1;

    // Outer loop
    while (outerCounter <= 5) {
      int innerCounter = 1;

      // Nested loop
      while (innerCounter <= outerCounter) {
        System.out.println("Hi " + innerCounter);
        innerCounter++;
      }

      // Print "Good morning" with an incrementing number
      System.out.println("Good morning " + outerCounter);
      outerCounter++;
    }
  }
}
