/*
In Java, a literal is a source code representation of a fixed value. It's a way to directly 
represent values in code without requiring computation or evaluation. Literals can be 
of various types including:

Integer literals: Representing integer values like 10, -5, 1000, etc.
Floating-point literals: Representing decimal values like 3.14, 0.001, -2.5, etc.
Character literals: Representing single characters enclosed in single quotes, like 'A', 'b', '%', etc.
String literals: Representing sequences of characters enclosed in double quotes, like "Hello", "Java", "123", etc.
Boolean literals: Representing the boolean values true and false.
Null literal: Representing the null reference.
In Java, literals are used to initialize variables, pass values to methods, and represent constants. 
They provide a straightforward and readable way to express fixed values directly in code.
*/

public class LiteralExample {
  public static void main(String[] args) {
    // Integer literals
    int intLiteral = 10;
    long longLiteral = 10000000000L;

    // Floating-point literals
    float floatLiteral = 3.14f;
    double doubleLiteral = 3.14159;

    // Character literal
    char charLiteral = 'A';

    // String literal
    String stringLiteral = "Hello, world!";

    // Boolean literals
    boolean booleanLiteral1 = true;
    boolean booleanLiteral2 = false;

    // Null literal
    Object nullLiteral = null;

    // Output
    System.out.println("Integer literal: " + intLiteral);
    System.out.println("Long literal: " + longLiteral);
    System.out.println("Float literal: " + floatLiteral);
    System.out.println("Double literal: " + doubleLiteral);
    System.out.println("Character literal: " + charLiteral);
    System.out.println("String literal: " + stringLiteral);
    System.out.println("Boolean literal 1: " + booleanLiteral1);
    System.out.println("Boolean literal 2: " + booleanLiteral2);
    System.out.println("Null literal: " + nullLiteral);
  }
}
