/*
 * Equal to (==): Checks if two values are equal.
Not equal to (!=): Checks if two values are not equal.
Greater than (>): Checks if the left operand is greater than the right operand.
Less than (<): Checks if the left operand is less than the right operand.
Greater than or equal to (>=): Checks if the left operand is greater than or equal to the right operand.
Less than or equal to (<=): Checks if the left operand is less than or equal to the right operand.
Additionally, an example of using these operators in an if-else statement is provided. 
You can run this Java file to see the output of each relational operation.
 */

public class RelationalOperators {
  public static void main(String[] args) {
    int a = 5;
    int b = 10;

    // Equal to (==)
    System.out.println("a == b: " + (a == b)); // false

    // Not equal to (!=)
    System.out.println("a != b: " + (a != b)); // true

    // Greater than (>)
    System.out.println("a > b: " + (a > b)); // false

    // Less than (<)
    System.out.println("a < b: " + (a < b)); // true

    // Greater than or equal to (>=)
    System.out.println("a >= b: " + (a >= b)); // false

    // Less than or equal to (<=)
    System.out.println("a <= b: " + (a <= b)); // true

    // Using relational operators in if-else statements
    if (a == b) {
      System.out.println("a is equal to b");
    } else {
      System.out.println("a is not equal to b");
    }
  }
}
