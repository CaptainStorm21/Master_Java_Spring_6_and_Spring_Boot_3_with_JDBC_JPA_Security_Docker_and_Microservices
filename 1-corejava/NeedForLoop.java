public class NeedForLoop {
  public static void main(String[] args) {
    // Example 1: Printing numbers from 1 to 5 without a loop
    System.out.println("Example 1: Printing numbers from 1 to 5 without a loop");
    System.out.println("1");
    System.out.println("2");
    System.out.println("3");
    System.out.println("4");
    System.out.println("5");

    // Example 2: Printing numbers from 1 to 5 using a for loop
    System.out.println("\nExample 2: Printing numbers from 1 to 5 using a for loop");
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
    }

    // Example 3: Summing numbers from 1 to 5 using a for loop
    System.out.println("\nExample 3: Summing numbers from 1 to 5 using a for loop");
    int total = 0;
    for (int i = 1; i <= 5; i++) {
      total += i;
    }
    System.out.println("Sum: " + total);

    // Example 4: Loop through an array
    String[] colors = { "Red", "Green", "Blue", "Yellow", "Orange" };
    // Print each color using a for loop
    System.out.println("Printing colors using a for loop:");
    for (int i = 0; i < colors.length; i++) {
      System.out.println(colors[i]);
    }
  }
}