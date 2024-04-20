import java.time.LocalTime;

public class VariableExample {
  public void displayContent() {
    // Assigning values to variables
    String city = "New York";
    String state = "state";
    String country = "USA";
    LocalTime currentTime = LocalTime.now();

    // Displaying variables on the same line
    System.out.println("Location: " + city + ", " + state + ", " + country + ", Current Time: " + currentTime);
  }
}