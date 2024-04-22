// Main.java
public class Main {
    public static void main(String[] args) {
        // Create an instance of the HelloWorld class
        HelloWorld helloWorld = new HelloWorld();
        VariableExample variableExample = new VariableExample();
        // Call the sayHello() method of HelloWorld
        System.out.println();

        System.out.println("Hello world");
        helloWorld.sayHello();
        System.out.println();

        System.out.println("Variables");
        variableExample.displayContent();
        System.out.println();

        System.out.println("Data Types");
        DataTypesExample.displayContent();
        System.out.println();

        System.out.println("Literal examples");
        LiteralExample.main(args);
        System.out.println();

        System.out.println("Conversion Type");
        ConversionType.main(args);
        System.out.println();

        System.out.println("Assignment Operators");
        AssignmentOperators.main(args);
        System.out.println();

        System.out.println("Relational Operators");
        RelationalOperators.main(args);
        System.out.println();

        System.out.println("Logical Operators");
        LogicalOperators.main(args);
        System.out.println();

        System.out.println("Logical Operators");
        LogicalOperators.main(args);
        System.out.println();

        System.out.println("If Else");
        IfElse.main(args);
        System.out.println();

        System.out.println("If Else If");
        IfElseIf.main(args);
        System.out.println();

        System.out.println("Ternary Examples");
        TernaryExamples.main(args);
        System.out.println();

        System.out.println("Switch Example");
        SwitchExample.main(args);
        System.out.println();
        
        System.out.println("For Loop");
        NeedForLoop.main(args);
        System.out.println();

        System.out.println("While Loop");
        WhileLoopExample.main(args);
        System.out.println();
    }
}
