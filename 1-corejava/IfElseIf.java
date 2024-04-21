public class IfElseIf {
  public static void main(String[] args) {
    int girls = 10;
    int boys = 7;
    int totalStudents = girls + boys;
    int marks = 95;
    int a_girls = 3;
    int a_boys = 3;
    
    if (marks >= 90 && ((a_girls + a_boys) <= 7)) {
      System.out.println( "Number of "+ a_girls + " girls and " + a_boys + " boys received grade: A");
    } else if (marks >= 80 ) {
      System.out.println("Grade: B");
    } else if (marks >= 70) {
      System.out.println("Grade: C");
    } else if (marks >= 60) {
      System.out.println("Grade: D");
    } else {
      System.out.println("Grade: F");
    }

    
    System.out.println("Total Students: " + totalStudents);
    System.out.println("Number of Girls: " + girls);
    System.out.println("Number of Boys: " + boys);
  }
}
