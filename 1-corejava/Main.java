// Main.java
public class Main {
    public static void main(String[] args) {
        // Create an instance of the HelloWorld class
        HelloWorld helloWorld = new HelloWorld();
        VariableExample variableExample = new VariableExample();

        // Call the sayHello() method of HelloWorld
        System.out.println();

        helloWorld.sayHello();
        System.out.println();

        variableExample.displayContent();
        System.out.println();

        DataTypesExample.displayContent();
        System.out.println();
    }
}
