import java.util.*;

/**
 * This program reads a list of integer numbers from the console input,
 * sorts them in ascending order, and then prints the sorted list to the
 * console.
 * The user can enter as many integers as they wish and should type 'done' to
 * indicate the end of input. The program uses the Collections Framework
 * for managing and sorting the list of integers.
 */
public class Main {
  public static void main(String[] args) {
    // Initialize a Scanner object to read input from the console.
    Scanner scanner = new Scanner(System.in);
    // Initialize a LinkedList to store integers.
    LinkedList<Integer> numbers = new LinkedList<>();

    System.out.println("Enter numbers (type 'done' to finish):");

    // Continuously read input from the console until 'done' is entered.
    while (scanner.hasNext()) {
      if (scanner.hasNextInt()) {
        // If the input is an integer, add it to the LinkedList.
        numbers.add(scanner.nextInt());
      } else {
        // If the input is not an integer, check for the 'done' command.
        String input = scanner.next();
        if ("done".equalsIgnoreCase(input)) {
          // If 'done' is entered, break out of the input loop.
          break;
        } else {
          // Prompt the user to enter a valid integer or 'done'.
          System.out.println("Please enter a valid integer or 'done' to finish.");
        }
      }
    }

    // Sort the LinkedList of integers in ascending order.
    Collections.sort(numbers);

    // Create an Iterator to traverse the sorted LinkedList.
    Iterator<Integer> it = numbers.iterator();

    // Print each integer from the sorted list to the console.
    while (it.hasNext()) {
      int value = it.next();
      System.out.print(value + " ");
    }

    System.out.println(); // Print a newline for clean output.
  }
}
