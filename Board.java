import java.util.*;

class Board {
  Out o = new Out();
  UserHandling u = new UserHandling();

  // Text Colors
  public static final String TEXT_RESET = "\u001B[0m";{}
  public static final String TEXT_BLACK = "\u001B[30m";{}
  public static final String TEXT_GREEN = "\u001B[32m";{}
  public static final String TEXT_YELLOW = "\u001B[93m";{}

  // Create ship pieces
  public void createShips() {
    Random randNum = new Random();

    // Loop ship generation until unique placements
    do {
      // For horizontal ships
      Set<Integer> rowSet = new LinkedHashSet<Integer>();
      while (rowSet.size() < 2) { // amount of generated numbers
        rowSet.add(randNum.nextInt(12)); // row range: 0 - 11
      }
      Integer[] rowSetArray = new Integer[rowSet.size()];
      rowSetArray = rowSet.toArray(rowSetArray);
  
      Set<Integer> colSet = new LinkedHashSet<Integer>();
      while (colSet.size() < 2) { // amount of generated numbers
        colSet.add(randNum.nextInt(11) + 1); // column range: 1 - 11
      }
      Integer[] colSetArray = new Integer[colSet.size()];
      colSetArray = colSet.toArray(colSetArray);
      
      // Ship 1
      String ship1Row = "";
      if (rowSetArray[0] == 0) ship1Row = "A";
  		else if (rowSetArray[0] == 1) ship1Row = "B";
  		else if (rowSetArray[0] == 2) ship1Row = "C";
  		else if (rowSetArray[0] == 3) ship1Row = "D";
  		else if (rowSetArray[0] == 4) ship1Row = "E";
  		else if (rowSetArray[0] == 5) ship1Row = "F";
  		else if (rowSetArray[0] == 6) ship1Row = "G";
  		else if (rowSetArray[0] == 7) ship1Row = "H";
  		else if (rowSetArray[0] == 8) ship1Row = "I";
  		else if (rowSetArray[0] == 9) ship1Row = "J";
      else if (rowSetArray[0] == 10) ship1Row = "K";
      else if (rowSetArray[0] == 11) ship1Row = "L";
      s1p1 = ship1Row + colSetArray[0];
      s1p2 = ship1Row + (colSetArray[0] + 1);
      s1p3 = ship1Row + (colSetArray[0] + 2);
      
      // Ship 2
      String ship2Row = "";
      if (rowSetArray[1] == 0) ship2Row = "A";
  		else if (rowSetArray[1] == 1) ship2Row = "B";
  		else if (rowSetArray[1] == 2) ship2Row = "C";
  		else if (rowSetArray[1] == 3) ship2Row = "D";
  		else if (rowSetArray[1] == 4) ship2Row = "E";
  		else if (rowSetArray[1] == 5) ship2Row = "F";
  		else if (rowSetArray[1] == 6) ship2Row = "G";
  		else if (rowSetArray[1] == 7) ship2Row = "H";
  		else if (rowSetArray[1] == 8) ship2Row = "I";
  		else if (rowSetArray[1] == 9) ship2Row = "J";
      else if (rowSetArray[1] == 10) ship2Row = "K";
      else if (rowSetArray[1] == 11) ship2Row = "L";
      s2p1 = ship2Row + colSetArray[1];
      s2p2 = ship2Row + (colSetArray[1] + 1);
      s2p3 = ship2Row + (colSetArray[1] + 2);
      s2p4 = ship2Row + (colSetArray[1] + 3);
      s2p5 = ship2Row + (colSetArray[1] + 4);
      
      // For vertical ships
      Set<Integer> VrowSet = new LinkedHashSet<Integer>();
      while (VrowSet.size() < 1) { // amount of generated numbers
        VrowSet.add(randNum.nextInt(9)); // row range: 0 - 9
      }
      Integer[] VrowSetArray = new Integer[VrowSet.size()];
      VrowSetArray = VrowSet.toArray(VrowSetArray);
  
      Set<Integer> VcolSet = new LinkedHashSet<Integer>();
      while (VcolSet.size() < 1) { // amount of generated numbers
        VcolSet.add(randNum.nextInt(15) + 1); // column range: 1 - 15
      }
      Integer[] VcolSetArray = new Integer[VcolSet.size()];
      VcolSetArray = VcolSet.toArray(VcolSetArray);

      // Ship 3
      String ship3Row1 = "";
      String ship3Row2 = "";
      String ship3Row3 = "";
      if (VrowSetArray[0] == 0) ship3Row1 = "A";
    	else if (VrowSetArray[0] == 1) ship3Row1 = "B";
    	else if (VrowSetArray[0] == 2) ship3Row1 = "C";
    	else if (VrowSetArray[0] == 3) ship3Row1 = "D";
    	else if (VrowSetArray[0] == 4) ship3Row1 = "E";
    	else if (VrowSetArray[0] == 5) ship3Row1 = "F";
    	else if (VrowSetArray[0] == 6) ship3Row1 = "G";
    	else if (VrowSetArray[0] == 7) ship3Row1 = "H";
    	else if (VrowSetArray[0] == 8) ship3Row1 = "I";
    	else if (VrowSetArray[0] == 9) ship3Row1 = "J";
      else if (VrowSetArray[0] == 10) ship3Row1 = "K";
      else if (VrowSetArray[0] == 11) ship3Row1 = "L";
      if ((VrowSetArray[0] + 1) == 0) ship3Row2 = "A";
    	else if ((VrowSetArray[0] + 1) == 1) ship3Row2 = "B";
    	else if ((VrowSetArray[0] + 1) == 2) ship3Row2 = "C";
    	else if ((VrowSetArray[0] + 1) == 3) ship3Row2 = "D";
    	else if ((VrowSetArray[0] + 1) == 4) ship3Row2 = "E";
    	else if ((VrowSetArray[0] + 1) == 5) ship3Row2 = "F";
    	else if ((VrowSetArray[0] + 1) == 6) ship3Row2 = "G";
    	else if ((VrowSetArray[0] + 1) == 7) ship3Row2 = "H";
    	else if ((VrowSetArray[0] + 1) == 8) ship3Row2 = "I";
    	else if ((VrowSetArray[0] + 1) == 9) ship3Row2 = "J";
      else if ((VrowSetArray[0] + 1) == 10) ship3Row2 = "K";
      else if ((VrowSetArray[0] + 1) == 11) ship3Row2 = "L";
      if ((VrowSetArray[0] + 2) == 0) ship3Row3 = "A";
    	else if ((VrowSetArray[0] + 2) == 1) ship3Row3 = "B";
    	else if ((VrowSetArray[0] + 2) == 2) ship3Row3 = "C";
    	else if ((VrowSetArray[0] + 2) == 3) ship3Row3 = "D";
    	else if ((VrowSetArray[0] + 2) == 4) ship3Row3 = "E";
    	else if ((VrowSetArray[0] + 2) == 5) ship3Row3 = "F";
    	else if ((VrowSetArray[0] + 2) == 6) ship3Row3 = "G";
    	else if ((VrowSetArray[0] + 2) == 7) ship3Row3 = "H";
    	else if ((VrowSetArray[0] + 2) == 8) ship3Row3 = "I";
    	else if ((VrowSetArray[0] + 2) == 9) ship3Row3 = "J";
      else if ((VrowSetArray[0] + 2) == 10) ship3Row3 = "K";
      else if ((VrowSetArray[0] + 2) == 11) ship3Row3 = "L";
      s3p1 = ship3Row1 + VcolSetArray[0];
      s3p2 = ship3Row2 + VcolSetArray[0];
      s3p3 = ship3Row3 + VcolSetArray[0];
      
    } while(s3p1.equals(s1p1) || s3p1.equals(s1p2) || s3p1.equals(s1p3) || 
            s3p2.equals(s1p1) || s3p2.equals(s1p2) || s3p2.equals(s1p3) || 
            s3p3.equals(s1p1) || s3p3.equals(s1p2) || s3p3.equals(s1p3) || 
            
            s3p1.equals(s2p1) || s3p1.equals(s2p2) || s3p1.equals(s2p3) || s3p1.equals(s2p4) || s3p1.equals(s2p5) || 
            s3p2.equals(s2p1) || s3p2.equals(s2p2) || s3p2.equals(s2p3) || s3p2.equals(s2p4) || s3p2.equals(s2p5) || 
            s3p3.equals(s2p1) || s3p3.equals(s2p2) || s3p3.equals(s2p3) || s3p3.equals(s2p4) || s3p3.equals(s2p5)
    );
  }

  // Handle user input
  int hits = 0;
	public int handleMove(String row, int column) {    
		boolean hit = false;
    String userInput = row + column;

    // Check for ship one
    if (userInput.equals(s1p1) || userInput.equals(s1p2) || userInput.equals(s1p3)) {
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
    else if (userInput.equals(s2p1) || userInput.equals(s2p2) || userInput.equals(s2p3) || userInput.equals(s2p4) || userInput.equals(s2p5)) {
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
    // Check for ship three
    else if (userInput.equals(s3p1) || userInput.equals(s3p2) || userInput.equals(s3p3)) {
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
  public String s1p1;
  public String s1p2;
  public String s1p3;

  // Ship two
  public String s2p1;
  public String s2p2;
  public String s2p3;
  public String s2p4;
  public String s2p5;

  // Ship three
  public String s3p1;
  public String s3p2;
  public String s3p3;

  // Show Ship Pieces
  public void showShips(boolean toggled) {
    if (toggled) {
      o.msgY("\nShip 1 position: \n");
      o.msgY(s1p1 + ", " + s1p2 + ", " + s1p3);

      o.msgY("\nShip 2 position: \n");
      o.msgY(s2p1 + ", " + s2p2 + ", " + s2p3 + ", " + s2p4 + ", " + s2p5);

      o.msgY("\nShip 3 position: \n");
      o.msgY(s3p1 + ", " + s3p2 + ", " + s3p3);

      o.msgY("\n");
    }
  }
  
}
