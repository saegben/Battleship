import java.util.*;
import java.io.*;

class UserHandling {
  Out o = new Out();
  Scanner getInput = new Scanner(System.in);

  String row;
  int column;

  // Create logs
  public void handleLogs() {
    try {
      File file = new File("Logs.txt");
      if (file.exists() && file.isFile()) { file.delete(); }
      if (!file.createNewFile()) {
        o.msgErr();
        o.msgInv("Unable to create 'Logs' file.");
      }
    } catch (IOException e) {
      o.msgErr();
      o.msgInv("Unable to read 'Logs' file.");
    }
  }

  // Check user input
  public boolean checkInput(String row, int column) {
    String newInput = row + column;
    o.msgCya("\n\nYou entered: "); o.msgWhi(newInput + "\n\n");

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

      if (!lineExists) {
        bw.write(newInput);
        bw.newLine();
        return false;
      } else {
        o.msgInv("Received duplicate position.");
        o.msgBlu("You've already guessed that position... Try something new. Don't waste your guesses!\n\n");
      }
    } catch (IOException e) {
      o.msgErr();
      o.msgInv("Unable to update 'Logs' file.");
    }
    return true;
  }
  
  // Handle row input
  public String promptRowInput() {
    while (true) {
      try {
        o.msgSky("Which Row? (A/B/C/D/E/F/G/H/I/J/K/L)  ");
        o.msgRed("[Type '"); o.msgPin("QUIT"); o.msgRed("' to end the game.]\n");
        row = getInput.nextLine();

        if (row.equals("QUIT")) {
          o.msgRed("Terminating game...\n");
          System.exit(0);
        } else {
          row = row.substring(0, 1);
        }

        if (row.matches("[a-zA-Z]")) { row = row.toUpperCase(); }
        if (row.matches("[a-lA-L]")) {
          return row;
        } else {
          o.msgInv("Received non [A-L] row input.");
          o.msgBlu("Rows must be between [A-L]... Try again.\n\n");
        }
      } catch (InputMismatchException e) {
        o.msgInv("Received inoperative input.");
        o.msgBlu("Rows must be a letter between [A-L]... Try again.\n\n");
      }
    }
  }
  
  public String getRowInput() {
    return row;
  }
  
  // Handle column input
  public int promptColumnInput() {
    while (true) {
      try {
        o.msgSky("Which Column? (1/2/3/4/5/6/7/8/9/10/11/12/13/14/15)\n");
        column = Integer.parseInt(getInput.nextLine().trim());

        if (column >= 1 && column <= 15) {
          return column;
        } else {
          o.msgInv("Received non [1-15] column input.");
          o.msgBlu("Columns must be between [1-15]... Try again.\n\n");
        }
      } catch (NumberFormatException e) {
        o.msgInv("Received inoperative input.");
        o.msgBlu("Columns must be an integer between [1-15]... Try again.\n\n");
      }
    }
  }

  public int getColumnInput() {
    return column;
  }
  
  // Handle guesses
  public int handleGuesses(int guesses) {
    if (guesses >= 16) { 
      o.msgBlu("Guesses: "); o.msgWhi(guesses + "\n");
    } else if (guesses >= 11) { 
      o.msgPur("Guesses: "); o.msgWhi(guesses + "\n");
    } else if (guesses >= 6) { 
      o.msgMag("Guesses: "); o.msgWhi(guesses + "\n");
    } else if (guesses == 5) {
      o.msgRed("Guesses: "); o.msgWhi(guesses + "\n");
      o.msgYel("Uh oh... You're running low on guesses... Choose your next move wisely.\n");
    } else { 
      o.msgRed("Guesses: "); o.msgWhi(guesses + "\n");
    }

    return guesses;
  }

}