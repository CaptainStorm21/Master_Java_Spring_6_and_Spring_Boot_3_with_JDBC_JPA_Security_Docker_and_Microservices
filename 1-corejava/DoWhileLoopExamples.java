
public class DoWhileLoopExamples {
  public static void main(String[] args) {
    System.out.println("Example 1: Do While Simple Example ");
    int count = 1;
    do {
      System.out.println("Count is: " + count);
      count++;
    } while (count <= 5);

    System.out.println("Example 2: Do while Loop in an array");
    // Array of colors
    String[] colors = { "Red", "Green", "Blue", "Yellow", "Orange", "Purple", "Pink", "Brown", "Black", "White" };
    // Initialize index variable
    int index = 0;
    // Iterate over the array using a do-while loop
    do {
      System.out.println("Color: " + colors[index]);
      index++;
    } while (index < colors.length);

    System.out.println();
    System.out.println("Example 3: An book bag with 10 titles, and after display 'Your bag of books is empty'  ");

    // Create an array of famous book titles
    String[] bookTitles = {
        "To Kill a Mockingbird",
        "1984",
        "The Great Gatsby",
        "The Catcher in the Rye",
        "The Lord of the Rings",
        "Pride and Prejudice",
        "Harry Potter and the Philosopher's Stone",
        "The Chronicles of Narnia",
        "The Hobbit",
        "Animal Farm"
    };

    // Initialize index variable
    int index_books = 0;

    // Use a do-while loop to remove books until the array is empty
    do {
      // Remove the book at the current index
      if (index_books < bookTitles.length) {
        System.out.println("This summer I have read: " + bookTitles[index_books]);
        bookTitles[index_books] = null; // Marking the book as read
        index_books++;
      }
    } while (index_books < bookTitles.length);

    // Display message when the array is empty
    System.out.println("You have read a lot of books. Please add more books to your library.");
  }

}
