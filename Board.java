// Handle board
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

  // Place ships on board
	public void placeShip(int ship, int row, int startColumn) {
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
  		columnOne = startColumn;
      columnTwo = startColumn + 1;
      columnThree = startColumn + 2;
      
    } else if (ship == 2) {
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
  		columnOneShipTwo = startColumn;
  		columnTwoShipTwo = startColumn + 1;
  		columnThreeShipTwo = startColumn + 2;
  		columnFourShipTwo = startColumn + 3;
  		columnFiveShipTwo = startColumn + 4;
    }
	}

  // Handle user input
	public void handleUserGuess() {
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

    o.msgB("\n\n You entered: " + TEXT_RESET + row + column + "\n");

    // Check user input
		if (row.equals(shipRow) || row.equals(shipTwoRow)) {
			if (
				(column == columnOne) ||
				(column == columnTwo) ||
				(column == columnThree) ||
        (column == columnOneShipTwo) ||
				(column == columnTwoShipTwo) ||
				(column == columnThreeShipTwo) ||
				(column == columnFourShipTwo) ||
				(column == columnFiveShipTwo)
			) {
        // Determine if hit
				if (row.equals("A")) {
					A[column] = TEXT_GREEN + "X" + TEXT_RESET;
					hit = true;
          validGuess = true;
				}
				else if (row.equals("B")) {
					B[column] = TEXT_GREEN + "X" + TEXT_RESET;
					hit = true;
          validGuess = true;
				}
				else if (row.equals("C")) {
					C[column] = TEXT_GREEN + "X" + TEXT_RESET;
					hit = true;
          validGuess = true;
				}
				else if (row.equals("D")) {
					D[column] = TEXT_GREEN + "X" + TEXT_RESET;
					hit = true;
          validGuess = true;
				}
				else if (row.equals("E")) {
					E[column] = TEXT_GREEN + "X" + TEXT_RESET;
					hit = true;
          validGuess = true;
				}
				else if (row.equals("F")) {
					F[column] = TEXT_GREEN + "X" + TEXT_RESET;
					hit = true;
          validGuess = true;
				}
				else if (row.equals("G")) {
					G[column] = TEXT_GREEN + "X" + TEXT_RESET;
					hit = true;
          validGuess = true;
				}
				else if (row.equals("H")) {
					H[column] = TEXT_GREEN + "X" + TEXT_RESET;
					hit = true;
          validGuess = true;
				}
				else if (row.equals("I")) {
					I[column] = TEXT_GREEN + "X" + TEXT_RESET;
					hit = true;
          validGuess = true;
				}
				else if (row.equals("J")) {
					J[column] = TEXT_GREEN + "X" + TEXT_RESET;
					hit = true;
          validGuess = true;
				}
        else if (row.equals("K")) {
					K[column] = TEXT_GREEN + "X" + TEXT_RESET;
					hit = true;
          validGuess = true;
				}
        else if (row.equals("L")) {
					L[column] = TEXT_GREEN + "X" + TEXT_RESET;
					hit = true;
          validGuess = true;
				}
			}
		}
    // Update position's status, mark valid input
    else if ((row.equals("A")) && column < 16 && column > 0) { A[column] = TEXT_BLACK + "+" + TEXT_RESET; validGuess = true; }
		else if ((row.equals("B")) && column < 16 && column > 0) { B[column] = TEXT_BLACK + "+" + TEXT_RESET; validGuess = true; }
		else if ((row.equals("C")) && column < 16 && column > 0) { C[column] = TEXT_BLACK + "+" + TEXT_RESET; validGuess = true; }
		else if ((row.equals("D")) && column < 16 && column > 0) { D[column] = TEXT_BLACK + "+" + TEXT_RESET; validGuess = true; }
		else if ((row.equals("E")) && column < 16 && column > 0) { E[column] = TEXT_BLACK + "+" + TEXT_RESET; validGuess = true; }
		else if ((row.equals("F")) && column < 16 && column > 0) { F[column] = TEXT_BLACK + "+" + TEXT_RESET; validGuess = true; }
		else if ((row.equals("G")) && column < 16 && column > 0) { G[column] = TEXT_BLACK + "+" + TEXT_RESET; validGuess = true; }
		else if ((row.equals("H")) && column < 16 && column > 0) { H[column] = TEXT_BLACK + "+" + TEXT_RESET; validGuess = true; }
		else if ((row.equals("I")) && column < 16 && column > 0) { I[column] = TEXT_BLACK + "+" + TEXT_RESET; validGuess = true; }
		else if ((row.equals("J")) && column < 16 && column > 0) { J[column] = TEXT_BLACK + "+" + TEXT_RESET; validGuess = true; }
    else if ((row.equals("K")) && column < 16 && column > 0) { K[column] = TEXT_BLACK + "+" + TEXT_RESET; validGuess = true; }
    else if ((row.equals("L")) && column < 16 && column > 0) { L[column] = TEXT_BLACK + "+" + TEXT_RESET; validGuess = true; }
    // Invalid input prompts error
    else {
      o.msgR("[ERROR 01] INVALID COLUMN/ROW INPUT\n");
    }

    // If invalid:
    if (validGuess == false) {
      o.msgB("Rows must be between A-L inclusive, columns must be between 0-14 inclusive...");
    }
    // If valid:
    else {
		  if (hit == false) {
        o.msgY("MISS!\n");
      }
      else {
        o.msgY(".⁎˚⭒✷💥 HIT! 💥✷࿏˚*.\n");
      }
    }

  }

  // Check for hits
	public int checkWinStatus() {
    String row = RInfo.getRowInput();
    int column = CInfo.getColumnInput();
		int hits = 0;
    
    if (
			(column == columnOne) ||
			(column == columnTwo) ||
			(column == columnThree) ||
      (column == columnOneShipTwo) ||
			(column == columnTwoShipTwo) ||
			(column == columnThreeShipTwo) ||
			(column == columnFourShipTwo) ||
			(column == columnFiveShipTwo)
		) {
      if ((shipRow == "A") || (shipTwoRow == "A")) { 
			  for (int idx = 1; idx < 16; ++idx) {
				  if (column == idx && A[column] == "X") ++hits;
			  }
      }
		  if ((shipRow == "B") || (shipTwoRow == "B")) {
			  for (int idx = 1; idx < 16; ++idx) {
				  if (column == idx && B[column] == "X") ++hits;
			  }
      }
		  if ((shipRow == "C") || (shipTwoRow == "C")) {
			  for (int idx = 1; idx < 16; ++idx) {
				  if (column == idx && C[column] == "X") ++hits;
			  }
      }
		  if ((shipRow == "D") || (shipTwoRow == "D")) {
			  for (int idx = 1; idx < 16; ++idx) {
				  if (column == idx && D[column] == "X") ++hits;
			  }
      }
		  if ((shipRow == "E") || (shipTwoRow == "E")) {
			  for (int idx = 1; idx < 16; ++idx) {
				  if (column == idx && E[column] == "X") ++hits;
			  }
      }
		  if ((shipRow == "F") || (shipTwoRow == "F")) {
			  for (int idx = 1; idx < 16; ++idx) {
				  if (column == idx && F[column] == "X") ++hits;
			  }
      }
		  if ((shipRow == "G") || (shipTwoRow == "G")) {
			  for (int idx = 1; idx < 16; ++idx) {
				  if (column == idx && G[column] == "X") ++hits;
			  }
      }
		  if ((shipRow == "H") || (shipTwoRow == "H")) {
			  for (int idx = 1; idx < 16; ++idx) {
				  if (column == idx && H[column] == "X") ++hits;
			  }
      }
		  if ((shipRow == "I") || (shipTwoRow == "I")) {
			  for (int idx = 1; idx < 16; ++idx) {
				  if (column == idx && I[column] == "X") ++hits;
			  }
      }
		  if ((shipRow == "J") || (shipTwoRow == "J")) {
			  for (int idx = 1; idx < 16; ++idx) {
				  if (column == idx && J[column] == "X") ++hits;
			  }
      }
      if ((shipRow == "K") || (shipTwoRow == "K")) {
			  for (int idx = 1; idx < 16; ++idx) {
				  if (column == idx && K[column] == "X") ++hits;
			  }
      }
      if ((shipRow == "L") || (shipTwoRow == "L")) {
			  for (int idx = 1; idx < 16; ++idx) {
				  if (column == idx && L[column] == "X") ++hits;
			  }
      }
    }

    // Display hits
		String msg = "Hits: " + hits + "\n";
		o.msgB(msg);
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
  
  
  // CHANGE AFTER ADDED SHIPS
	public String shipRow;
    
	public int columnOne;
	public int columnTwo;
	public int columnThree;

  public String shipTwoRow;

  public int columnOneShipTwo;
	public int columnTwoShipTwo;
	public int columnThreeShipTwo;
	public int columnFourShipTwo;
	public int columnFiveShipTwo;
}