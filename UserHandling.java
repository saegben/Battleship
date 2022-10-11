import java.util.*;
import java.io.*;

class UserHandling {
  Out o = new Out();

  // Text colors
  public static final String TEXT_RESET = "\u001B[0m";{}

  // Handle row input
  String row;

  public String promptRowInput() {
    Scanner getInput = new Scanner(System.in);
    while (true) {
      try {
        // Get input
        o.msgB("Which Row? (A/B/C/D/E/F/G/H/I/J/K/L)\n");
        row = getInput.nextLine().substring(0, 1);
        if (row.matches("[a-zA-Z]")) { row = row.toUpperCase(); }
        // Check for match
        if (row.matches("[a-lA-L]")) {
          return row;
        } else {
          o.msgR("[ERROR 001] INVALID INPUT\n");
          o.msgR("Received non [A-L] row input.\n");
          o.msgB("Rows must be between [A-L]... Try again.\n");
        }
      } catch (InputMismatchException e) {
        o.msgR("[ERROR 001] INVALID INPUT\n");
        o.msgR("Received inoperative input.\n");
        o.msgB("Rows must be a letter between [A-L]... Try again.\n");
      }
    }
  }
  
  public String getRowInput() {
    return row;
  }
  
  // Handle column input
  int column;

  public int promptColumnInput() {
    Scanner getInput = new Scanner(System.in);
    while (true) {
      try {
        // Get input
        o.msgB("Which Column? (1/2/3/4/5/6/7/8/9/10/11/12/13/14/15)\n");
        column = Integer.parseInt(getInput.nextLine().trim());
        // Check for match
        if (column >= 1 && column <= 15) {
          return column;
        } else {
          o.msgR("[ERROR 001] INVALID INPUT\n");
          o.msgR("Received non [1-15] column input.\n");
          o.msgB("Columns must be between [1-15]... Try again.\n");
        }
      } catch (NumberFormatException e) {
        o.msgR("[ERROR 001] INVALID INPUT\n");
        o.msgR("Received inoperative input.\n");
        o.msgB("Columns must be an integer between [1-15]... Try again.\n");
      }
    }
  }

  public int getColumnInput() {
    return column;
  }

}