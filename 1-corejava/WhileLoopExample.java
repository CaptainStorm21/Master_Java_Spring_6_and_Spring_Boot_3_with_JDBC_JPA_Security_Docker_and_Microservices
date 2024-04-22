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
  }
}
