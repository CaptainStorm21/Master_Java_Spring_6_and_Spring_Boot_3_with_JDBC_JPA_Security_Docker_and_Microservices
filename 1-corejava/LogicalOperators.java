/**
 * Logical AND (&&): Returns true if both operands are true.
 * Logical OR (||): Returns true if at least one of the operands is true.
 * Logical NOT (!): Reverses the logical state of its operand.
 * Additionally, examples of combining multiple conditions using logical
 * operators in if statements and loop conditions are provided. You can run this
 * Java file to see the output of each logical operation.
 */

public class LogicalOperators {
  public static void main(String[] args) {
    
    boolean a = true;
    boolean b = false;

    // Logical AND (&&)
    System.out.println("Logical AND: a && b -> " + (a && b)); // false

    // Logical OR (||)
    System.out.println("Logical OR: a || b -> " + (a || b)); // true

    // Logical NOT (!)
    System.out.println("Logical NOT: !a -> " + (!a)); // false

    // Combining multiple conditions
    int x = 5;
    int y = 10;
    int z = 15;

    // Example of combining conditions using logical operators in an if statement
    if (x > y && y < z) {
      System.out.println("x is greater than y AND y is less than z");
    }

    // Example of using logical operators in a loop condition
    while (x < z || y < z) {
      System.out.println("x or y is less than z");
      x++;
      y++;
    }
  }
}
