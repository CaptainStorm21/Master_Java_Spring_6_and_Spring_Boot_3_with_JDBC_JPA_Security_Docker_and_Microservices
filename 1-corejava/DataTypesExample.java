import java.util.Random;

public class DataTypesExample {
  public static void displayContent() {
    // Primitive data types in Java
    byte byteExample;
    short shortExample;
    int intExample;
    long longExample;
    float floatExample;
    double doubleExample;
    char charExample;
    boolean booleanExample;

    // Random value generator
    Random rand = new Random();

    // Assigning random values to variables
    byteExample = (byte) rand.nextInt(Byte.MAX_VALUE + 1); // Casting to byte
    shortExample = (short) rand.nextInt(Short.MAX_VALUE + 1); // Casting to short
    intExample = rand.nextInt();
    longExample = rand.nextLong();
    floatExample = rand.nextFloat();
    doubleExample = rand.nextDouble();
    charExample = (char) (rand.nextInt(26) + 'a'); // Generating a random lowercase letter
    booleanExample = rand.nextBoolean();

    // Displaying examples
    System.out.println("byte example: " + byteExample);
    System.out.println("short example: " + shortExample);
    System.out.println("int example: " + intExample);
    System.out.println("long example: " + longExample);
    System.out.println("float example: " + floatExample);
    System.out.println("double example: " + doubleExample);
    System.out.println("char example: " + charExample);
    System.out.println("boolean example: " + booleanExample);
  }
}
