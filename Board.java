import java.util.*;

class Board {
  Out o;
  RowInput RInfo;
  ColumnInput CInfo;

	public Board () {
		o = new Out();
    RInfo = new RowInput();
    CInfo = new ColumnInput();
	}

  // Text Colors
  public static final String TEXT_RESET = "\u001B[0m";{}
  public static final String TEXT_BLACK = "\u001B[30m";{}
  public static final String TEXT_GREEN = "\u001B[32m";{}
  public static final String TEXT_YELLOW = "\u001B[93m";{}

  // Place ship one
	public void placeShipOne(int ship, int row, int columnOne, int columnTwo, int columnThree) {
	  if (ship == 1) {
      if (row == 0) shipRow = "A";
		  else if (row == 1) shipRow = "B";
		  else if (row == 2) shipRow = "C";
		  else if (row == 3) shipRow = "D";
		  else if (row == 4) shipRow = "E";
		  else if (row == 5) shipRow = "F";
		  else if (row == 6) shipRow = "G";
		  else if (row == 7) shipRow = "H";
		  else if (row == 8) shipRow = "I";
		  else if (row == 9) shipRow = "J";
      else if (row == 10) shipRow = "K";
      else if (row == 11) shipRow = "L";
      columnOneShipOne = columnOne;
      columnTwoShipOne = columnTwo;
      columnThreeShipOne = columnThree;
    }
	}
  
  // Place ship two
  public void placeShipTwo(int ship, int row, int columnOne, int columnTwo, int columnThree, int columnFour, int columnFive) {
    if (ship == 2) {
      if (row == 0) shipTwoRow = "A";
		  else if (row == 1) shipTwoRow = "B";
		  else if (row == 2) shipTwoRow = "C";
		  else if (row == 3) shipTwoRow = "D";
		  else if (row == 4) shipTwoRow = "E";
		  else if (row == 5) shipTwoRow = "F";
		  else if (row == 6) shipTwoRow = "G";
		  else if (row == 7) shipTwoRow = "H";
		  else if (row == 8) shipTwoRow = "I";
		  else if (row == 9) shipTwoRow = "J";
      else if (row == 10) shipTwoRow = "K";
      else if (row == 11) shipTwoRow = "L";
      columnOneShipTwo = columnOne;
      columnTwoShipTwo = columnTwo;
      columnThreeShipTwo = columnThree;
      columnFourShipTwo = columnFour;
      columnFiveShipTwo = columnFive;
    }
	}

  // Handle user input
  int hits = 0;
	public int handleUserGuess() {
		boolean hit = false;
    boolean validGuess = false;
    
    // Row
    o.msgB("Which Row? (A/B/C/D/E/F/G/H/I/J/K/L)\n");
    RowInput RInfo = new RowInput();
    RInfo.promptRowInput();
    String row = RInfo.getRowInput();
    
    // Column
    o.msgB("Which Column? (1/2/3/4/5/6/7/8/9/10/11/12/13/14/15)\n");
    ColumnInput CInfo = new ColumnInput();
    CInfo.promptColumnInput();
    int column = CInfo.getColumnInput();

    String userInput = row + column;
    o.msgB("\n\n You entered: " + TEXT_RESET + userInput + "\n");

    // Ship One positions
    String shipOnePieceOne = shipRow + columnOneShipOne;
    String shipOnePieceTwo = shipRow + columnTwoShipOne;
    String shipOnePieceThree = shipRow + columnThreeShipOne;

    // Ship Two positions
    String shipTwoPieceOne = shipTwoRow + columnOneShipTwo;
    String shipTwoPieceTwo = shipTwoRow + columnTwoShipTwo;
    String shipTwoPieceThree = shipTwoRow + columnThreeShipTwo;
    String shipTwoPieceFour = shipTwoRow + columnFourShipTwo;
    String shipTwoPieceFive = shipTwoRow + columnFiveShipTwo;

    // Check for ship one
    if (userInput.equals(shipOnePieceOne) || userInput.equals(shipOnePieceTwo) || userInput.equals(shipOnePieceThree)) {
      hit = true;

      if (row.equals("A")) {
        A[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("B")) {
        B[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("C")) {
        C[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("D")) {
        D[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("E")) {
        E[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("F")) {
        F[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("G")) {
        G[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("H")) {
        H[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("I")) {
        I[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("J")) {
        J[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("K")) {
        K[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("L")) {
        L[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else {
        o.msgR("[ERROR]");
      }
    } 

    // Check for ship two
    else if (userInput.equals(shipTwoPieceOne) || userInput.equals(shipTwoPieceTwo) || userInput.equals(shipTwoPieceThree) || userInput.equals(shipTwoPieceFour) || userInput.equals(shipTwoPieceFive)) {
      hit = true;

      if (row.equals("A")) {
        A[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("B")) {
        B[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("C")) {
        C[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("D")) {
        D[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("E")) {
        E[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("F")) {
        F[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("G")) {
        G[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("H")) {
        H[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("I")) {
        I[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("J")) {
        J[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("K")) {
        K[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else if (row.equals("L")) {
        L[column] = TEXT_GREEN + "X" + TEXT_RESET;
      } else {
        o.msgR("[ERROR]");
      }
    }

    // If all ships were missed
    else {
      if (row.equals("A")) {
        A[column] = TEXT_BLACK + "+" + TEXT_RESET;
      } else if (row.equals("B")) {
        B[column] = TEXT_BLACK + "+" + TEXT_RESET;
      } else if (row.equals("C")) {
        C[column] = TEXT_BLACK + "+" + TEXT_RESET;
      } else if (row.equals("D")) {
        D[column] = TEXT_BLACK + "+" + TEXT_RESET;
      } else if (row.equals("E")) {
        E[column] = TEXT_BLACK + "+" + TEXT_RESET;
      } else if (row.equals("F")) {
        F[column] = TEXT_BLACK + "+" + TEXT_RESET;
      } else if (row.equals("G")) {
        G[column] = TEXT_BLACK + "+" + TEXT_RESET;
      } else if (row.equals("H")) {
        H[column] = TEXT_BLACK + "+" + TEXT_RESET;
      } else if (row.equals("I")) {
        I[column] = TEXT_BLACK + "+" + TEXT_RESET;
      } else if (row.equals("J")) {
        J[column] = TEXT_BLACK + "+" + TEXT_RESET;
      } else if (row.equals("K")) {
        K[column] = TEXT_BLACK + "+" + TEXT_RESET;
      } else if (row.equals("L")) {
        L[column] = TEXT_BLACK + "+" + TEXT_RESET;
      } else {
        o.msgR("[ERROR]");
      }
    }

    // Display hit or miss
    if (hit == false) {
      o.msgY("MISS!\n");
    } else {
      o.msgY(".⁎˚⭒✷💥 HIT! 💥✷࿏˚*.\n");
      ++hits;
    }

    o.msgB("Hits: " + TEXT_RESET + hits + "\n");
    return hits;
  }

  // Game board
	public void showBoard () {
		o.msgW("\n\t\t\t _____GAME BOARD_____\n");
		o.msgW("   1  2  3  4  5  6  7  8  9 10 11 12 13 14 15\n");
    o.msgY("   ───────────────────────────────────────────\n");
		
		o.msgW("A" + TEXT_YELLOW + "│ " + TEXT_RESET);
		for (int idx = 1; idx < 16; ++idx) {
			o.msgW(A[idx]);
			o.msgW("  ");
		}
		o.msgW("\nB" + TEXT_YELLOW + "│ " + TEXT_RESET);
		for (int idx = 1; idx < 16; ++idx) {
			o.msgW(B[idx]);
			o.msgW("  ");
		}
		o.msgW("\nC" + TEXT_YELLOW + "│ " + TEXT_RESET);
		for (int idx = 1; idx < 16; ++idx) {
			o.msgW(C[idx]);
			o.msgW("  ");
		}
		o.msgW("\nD" + TEXT_YELLOW + "│ " + TEXT_RESET);
		for (int idx = 1; idx < 16; ++idx) {
			o.msgW(D[idx]);
			o.msgW("  ");
		}
		o.msgW("\nE" + TEXT_YELLOW + "│ " + TEXT_RESET);
		for (int idx = 1; idx < 16; ++idx) {
			o.msgW(E[idx]);
			o.msgW("  ");
		}
		o.msgW("\nF" + TEXT_YELLOW + "│ " + TEXT_RESET);
		for (int idx = 1; idx < 16; ++idx) {
			o.msgW(F[idx]);
			o.msgW("  ");
		}
		o.msgW("\nG" + TEXT_YELLOW + "│ " + TEXT_RESET);
		for (int idx = 1; idx < 16; ++idx) {
			o.msgW(G[idx]);
			o.msgW("  ");
		}
		o.msgW("\nH" + TEXT_YELLOW + "│ " + TEXT_RESET);
		for (int idx = 1; idx < 16; ++idx) {
			o.msgW(H[idx]);
			o.msgW("  ");
		}
		o.msgW("\nI" + TEXT_YELLOW + "│ " + TEXT_RESET);
		for (int idx = 1; idx < 16; ++idx) {
			o.msgW(I[idx]);
			o.msgW("  ");
		}
		o.msgW("\nJ" + TEXT_YELLOW + "│ " + TEXT_RESET);
		for (int idx = 1; idx < 16; ++idx) {
			o.msgW(J[idx]);
			o.msgW("  ");
		}
    o.msgW("\nK" + TEXT_YELLOW + "│ " + TEXT_RESET);
		for (int idx = 1; idx < 16; ++idx) {
			o.msgW(K[idx]);
			o.msgW("  ");
		}
    o.msgW("\nL" + TEXT_YELLOW + "│ " + TEXT_RESET);
		for (int idx = 1; idx < 16; ++idx) {
			o.msgW(L[idx]);
		  o.msgW("  ");
		}
		o.msgW("\n");
	}
  
  public String[] A = {"O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O"};
	public String[] B = {"O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O"};
	public String[] C = {"O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O"};
	public String[] D = {"O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O"};
	public String[] E = {"O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O"};
	public String[] F = {"O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O"};
	public String[] G = {"O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O"};
	public String[] H = {"O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O"};
	public String[] I = {"O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O"};
	public String[] J = {"O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O"};
  public String[] K = {"O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O"};
  public String[] L = {"O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O"};
  
  // Ship one
	public String shipRow;
    
	public int columnOneShipOne;
	public int columnTwoShipOne;
	public int columnThreeShipOne;

  // Ship two
  public String shipTwoRow;

  public int columnOneShipTwo;
	public int columnTwoShipTwo;
	public int columnThreeShipTwo;
	public int columnFourShipTwo;
	public int columnFiveShipTwo;


  // Show Ship Pieces
  public void showShips(boolean toggled) {
    if (toggled) {
      o.msgY("\nShip 1 position: \n");
      o.msgY(shipRow + columnOneShipOne + ", " + 
             shipRow + columnTwoShipOne + ", " + 
             shipRow + columnThreeShipOne);

      o.msgY("\nShip 2 position: \n");
      o.msgY(shipTwoRow + columnOneShipTwo + ", " + 
             shipTwoRow + columnTwoShipTwo + ", " + 
             shipTwoRow + columnThreeShipTwo + ", " + 
             shipTwoRow + columnFourShipTwo + ", " + 
             shipTwoRow + columnFiveShipTwo);
      
    }
  }
  
}