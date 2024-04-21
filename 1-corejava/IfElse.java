public class IfElse {
  public static void main(String[] args) {

    int x = 600009;

    if (x < 1000) {
      System.out.println("Hello world");
    } else {
    System.out.println("Good bye");
    }


    int children = 10;
    String child_name = "Mary";

    if (children < 10 && child_name == "Cathy") {
      System.out.println("We have only " +  children + " and we do not have a child by the name of " + child_name);
    } else {
      System.out.println("Today's birthday party is for " + child_name);
    }

    int total_children = 100;
    int min_children = 10;
    int current_children = 30;

    if (min_children == 10  && current_children < total_children){
      System.out.println("Minimum requirement of a group party for children has been met");
    } else {
      System.out.println("We need more children");
    }
  }
}
