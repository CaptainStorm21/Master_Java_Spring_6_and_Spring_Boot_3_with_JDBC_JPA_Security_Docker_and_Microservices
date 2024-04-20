public class ConversionType {
  public static void main(String[] args) {
    // Integer to String
    int intValue = 42;
    String strValue = String.valueOf(intValue);
    System.out.println("Integer to String: " + strValue);

    // String to Integer
    String strNumber = "123";
    int intNumber = Integer.parseInt(strNumber);
    System.out.println("String to Integer: " + intNumber);

    // Double to String
    double doubleValue = 3.14;
    String strDouble = String.valueOf(doubleValue);
    System.out.println("Double to String: " + strDouble);

    // String to Double
    String strDoubleValue = "3.14";
    double doubleNumber = Double.parseDouble(strDoubleValue);
    System.out.println("String to Double: " + doubleNumber);

    // String to Boolean
    String strBoolean = "true";
    boolean boolValue = Boolean.parseBoolean(strBoolean);
    System.out.println("String to Boolean: " + boolValue);

    // Boolean to String
    boolean bool = true;
    String boolString = String.valueOf(bool);
    System.out.println("Boolean to String: " + boolString);

    // Integer to Double
    double doubleFromInt = (double) intValue;
    System.out.println("Integer to Double: " + doubleFromInt);

    // Double to Integer
    int intFromDouble = (int) doubleValue;
    System.out.println("Double to Integer: " + intFromDouble);

    // Character to String
    char charValue = 'a';
    String strChar = String.valueOf(charValue);
    System.out.println("Character to String: " + strChar);

    // String to Character
    char charFromString = strChar.charAt(0);
    System.out.println("String to Character: " + charFromString);
  }
}
