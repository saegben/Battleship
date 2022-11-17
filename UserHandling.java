import java.util.*;
import java.io.*;

class UserHandling {
  Out o = new Out();
  Scanner getInput = new Scanner(System.in);
  
  // Text Colors
  public static final String TEXT_RESET = "\u001B[0m";{}

  // Create logs
  public void handleLogs() {
    try {
      File file = new File("Logs.txt");
      
      // Clear logs & refresh
      if (file.exists() && file.isFile()) { file.delete(); }
      if (!file.createNewFile()) {
        o.msgR("[ERROR] AN INTERRUPTION OCCURED");
        o.msgR("Unable to create Logs file.\n");
      }
    } catch (IOException e) {
      o.msgR("[ERROR] AN INTERRUPTION OCCURED");
      o.msgR("Unable to read Logs file.\n");
    }
  }

  // Check user input
  public boolean checkInput(String row, int column) {
    String newInput = row + column;
    o.msgB("\n\nYou entered: " + TEXT_RESET + newInput + "\n");

    // Cross-check with logs
    try (BufferedReader br = new BufferedReader(new FileReader("Logs.txt"));
    FileWriter fw = new FileWriter("Logs.txt", true);
    BufferedWriter bw = new BufferedWriter(fw)) {
      boolean lineExists = false;
      String currentLine;

      // Check for logged match
      while ((currentLine = br.readLine()) != null) {
        if (currentLine.equals(newInput)) {
          lineExists = true;
          break;
        }
      }
      br.close();

      // Log input if new
      if (!lineExists) {
        bw.write(newInput);
        bw.newLine();
        return false;
      } else {
        o.msgR("[ERROR] PROCESS INTERRUPTED\n");
        o.msgR("Received duplicate position.\n");
        o.msgB("You've already guessed that position... Try something new. Don't waste your guesses!\n");
      }
    } catch (IOException e) {
      o.msgR("[ERROR] AN INTERRUPTION OCCURED");
      o.msgR("Unable to update Logs file.\n");
    }
    return true;
  }
  
  // Handle row input
  String row;

  public String promptRowInput() {
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
          o.msgR("[ERROR] INVALID INPUT\n");
          o.msgR("Received non [A-L] row input.\n");
          o.msgB("Rows must be between [A-L]... Try again.\n");
        }
      } catch (InputMismatchException e) {
        o.msgR("[ERROR] INVALID INPUT\n");
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
    while (true) {
      try {
        // Get input
        o.msgB("Which Column? (1/2/3/4/5/6/7/8/9/10/11/12/13/14/15)\n");
        column = Integer.parseInt(getInput.nextLine().trim());
        // Check for match
        if (column >= 1 && column <= 15) {
          return column;
        } else {
          o.msgR("[ERROR] INVALID INPUT\n");
          o.msgR("Received non [1-15] column input.\n");
          o.msgB("Columns must be between [1-15]... Try again.\n");
        }
      } catch (NumberFormatException e) {
        o.msgR("[ERROR] INVALID INPUT\n");
        o.msgR("Received inoperative input.\n");
        o.msgB("Columns must be an integer between [1-15]... Try again.\n");
      }
    }
  }

  public int getColumnInput() {
    return column;
  }
  
  // Handle guesses
  public int handleGuesses(int guesses) {
    // 30-16
    if (guesses >= 16) {
      o.msgB("\nGuesses: " + TEXT_RESET + guesses + "\n");

    // 15-11
    } else if (guesses >= 11) {
      o.msgY("\nGuesses: " + TEXT_RESET + guesses + "\n");

    // 10-6
    } else if (guesses >= 6) {
      o.msgM("\nGuesses: " + TEXT_RESET + guesses + "\n");

    // 5-0
    } else {
      o.msgR("\nGuesses: " + TEXT_RESET + guesses + "\n");
    }

    // Warnings
    if (guesses == 5) {
      o.msgY("\nUh oh... You're running low on guesses... Choose your next move wisely.\n");
    }

    return guesses;
  }
  
}
