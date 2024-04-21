/*
 * In Java, assignment operators are used to assign values to variables. They
 * are shorthand notations for simple assignment operations combined with
 * arithmetic or bitwise operations. Here are the commonly used assignment
 * operators in Java:
 * 
 * =: Simple assignment operator. Assigns the value on the right-hand side to
 * the variable on the left-hand side.
 * +=: Addition assignment operator. Adds the value on the right-hand side to
 * the variable on the left-hand side and assigns the result to the left-hand
 * side variable.
 * -=: Subtraction assignment operator. Subtracts the value on the right-hand
 * side from the variable on the left-hand side and assigns the result to the
 * left-hand side variable.
 * =: Multiplication assignment operator. Multiplies the value on the right-hand
 * side with the variable on the left-hand side and assigns the result to the
 * left-hand side variable.
 * /=: Division assignment operator. Divides the value on the left-hand side by
 * the value on the right-hand side and assigns the result to the left-hand side
 * variable.
 * %=: Modulus assignment operator. Divides the value on the left-hand side by
 * the value on the right-hand side and assigns the remainder to the left-hand
 * side variable.
 * <<=: Left shift assignment operator. Shifts the bits of the left-hand side
 * operand to the left by the number of bits specified by the right-hand side
 * operand and assigns the result to the left-hand side variable.
 * >>=: Right shift assignment operator. Shifts the bits of the left-hand side
 * operand to the right by the number of bits specified by the right-hand side
 * operand and assigns the result to the left-hand side variable.
 * &=: Bitwise AND assignment operator. Performs a bitwise AND operation between
 * the left-hand side and right-hand side operands and assigns the result to the
 * left-hand side variable.
 * |=: Bitwise OR assignment operator. Performs a bitwise OR operation between
 * the left-hand side and right-hand side operands and assigns the result to the
 * left-hand side variable.
 * ^=: Bitwise XOR assignment operator. Performs a bitwise XOR operation between
 * the left-hand side and right-hand side operands and assigns the result to the
 * left-hand side variable.
 */

public class AssignmentOperators {
  public static void main(String[] args) {
    // Simple assignment operator (=)
    int a = 10;
    System.out.println("Simple assignment: a = " + a);

    // Addition assignment operator (+=)
    int b = 5;
    b += 3; // Equivalent to: b = b + 3;
    System.out.println("Addition assignment: b += 3 -> b = " + b);

    // Subtraction assignment operator (-=)
    int c = 10;
    c -= 4; // Equivalent to: c = c - 4;
    System.out.println("Subtraction assignment: c -= 4 -> c = " + c);

    // Multiplication assignment operator (*=)
    int d = 7;
    d *= 2; // Equivalent to: d = d * 2;
    System.out.println("Multiplication assignment: d *= 2 -> d = " + d);

    // Division assignment operator (/=)
    int e = 20;
    e /= 4; // Equivalent to: e = e / 4;
    System.out.println("Division assignment: e /= 4 -> e = " + e);

    // Modulus assignment operator (%=)
    int f = 15;
    f %= 4; // Equivalent to: f = f % 4;
    System.out.println("Modulus assignment: f %= 4 -> f = " + f);

    // Left shift assignment operator (<<=)
    int g = 8;
    g <<= 2; // Equivalent to: g = g << 2;
    System.out.println("Left shift assignment: g <<= 2 -> g = " + g);

    // Right shift assignment operator (>>=)
    int h = 16;
    h >>= 2; // Equivalent to: h = h >> 2;
    System.out.println("Right shift assignment: h >>= 2 -> h = " + h);

    // Bitwise AND assignment operator (&=)
    int i = 12;
    i &= 9; // Equivalent to: i = i & 9;
    System.out.println("Bitwise AND assignment: i &= 9 -> i = " + i);

    // Bitwise OR assignment operator (|=)
    int j = 6;
    j |= 3; // Equivalent to: j = j | 3;
    System.out.println("Bitwise OR assignment: j |= 3 -> j = " + j);

    // Bitwise XOR assignment operator (^=)
    int k = 10;
    k ^= 7; // Equivalent to: k = k ^ 7;
    System.out.println("Bitwise XOR assignment: k ^= 7 -> k = " + k);
  }
}
