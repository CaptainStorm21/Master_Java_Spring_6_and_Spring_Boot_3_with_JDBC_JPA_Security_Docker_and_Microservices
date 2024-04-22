public class ForLoopExamples {
  public static void main(String[] args) {

    System.out.println("Example 1: A for loop through a list of books");
    String[] bookTitles = {
        "To Kill a Mockingbird",
        "1984",
        "The Great Gatsby",
        "Pride and Prejudice",
        "The Catcher in the Rye",
        "Animal Farm",
        "Brave New World",
        "The Lord of the Rings",
        "The Hobbit",
        "Fahrenheit 451"
    };

    for (String title : bookTitles) {
      System.out.println(title);
    }

    System.out.println();
    System.out.println("Example 2: For loop through a nested for loop");
    String[][] authorLists = {
        { "Harper Lee" },
        { "George Orwell" },
        { "F. Scott Fitzgerald" },
        { "Jane Austen" },
        { "J.D. Salinger" },
        { "George Orwell" },
        { "Aldous Huxley" },
        { "J.R.R. Tolkien" },
        { "J.R.R. Tolkien" },
        { "Ray Bradbury" }
    };

    for (String[] authors : authorLists) {
      for (String author : authors) {
        System.out.println(author);
      }
    }
    System.out.println();
    System.out.println("Example 3: For loop through a nested for loop");
    int rows = 5;

    for (int i = 0; i < rows; i++) {
      int number = 1;
      System.out.format("%" + (rows - i) * 2 + "s", "");
      for (int j = 0; j <= i; j++) {
        System.out.format("%4d", number);
        number = number * (i - j) / (j + 1);
      }
      System.out.println();
    }

  }
}
