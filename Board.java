import java.util.*;

class Board {
  Out o = new Out();
  UserHandling u = new UserHandling();

  // Text colors
  public static final String TXT_BLACK = "\u001B[30m";{}
  public static final String TXT_GREEN = "\u001B[32m";{}

  // Create ship pieces
  public void createShips() {
    Random randNum = new Random();

    // Loop ship generation until unique placements
    do {
      // For horizontal ships
      Set<Integer> rowSet = new LinkedHashSet<>();
      while (rowSet.size() < 2) {
        rowSet.add(randNum.nextInt(12)); // row range: 0 - 11
      }
      Integer[] rowSetArray = new Integer[rowSet.size()];
      rowSetArray = rowSet.toArray(rowSetArray);
  
      Set<Integer> colSet = new LinkedHashSet<>();
      while (colSet.size() < 2) {
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
      Set<Integer> VrowSet = new LinkedHashSet<>();
      while (VrowSet.size() < 1) {
        VrowSet.add(randNum.nextInt(9)); // row range: 0 - 9
      }
      Integer[] VrowSetArray = new Integer[VrowSet.size()];
      VrowSetArray = VrowSet.toArray(VrowSetArray);
  
      Set<Integer> VcolSet = new LinkedHashSet<>();
      while (VcolSet.size() < 1) {
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

    // Check for ships
    if (userInput.equals(s1p1) || userInput.equals(s1p2) || userInput.equals(s1p3) ||
        userInput.equals(s2p1) || userInput.equals(s2p2) || userInput.equals(s2p3) || userInput.equals(s2p4) || userInput.equals(s2p5) ||
        userInput.equals(s3p1) || userInput.equals(s3p2) || userInput.equals(s3p3)
    ) {
      hit = true;
      if (row.equals("A")) { A[column] = TXT_GREEN + "✘";
      } else if (row.equals("B")) { B[column] = TXT_GREEN + "✘";
      } else if (row.equals("C")) { C[column] = TXT_GREEN + "✘";
      } else if (row.equals("D")) { D[column] = TXT_GREEN + "✘";
      } else if (row.equals("E")) { E[column] = TXT_GREEN + "✘";
      } else if (row.equals("F")) { F[column] = TXT_GREEN + "✘";
      } else if (row.equals("G")) { G[column] = TXT_GREEN + "✘";
      } else if (row.equals("H")) { H[column] = TXT_GREEN + "✘";
      } else if (row.equals("I")) { I[column] = TXT_GREEN + "✘";
      } else if (row.equals("J")) { J[column] = TXT_GREEN + "✘";
      } else if (row.equals("K")) { K[column] = TXT_GREEN + "✘";
      } else if (row.equals("L")) { L[column] = TXT_GREEN + "✘";
      } else { o.msgErr(); }
    } else {
      if (row.equals("A")) { A[column] = TXT_BLACK + "◌";
      } else if (row.equals("B")) { B[column] = TXT_BLACK + "◌";
      } else if (row.equals("C")) { C[column] = TXT_BLACK + "◌";
      } else if (row.equals("D")) { D[column] = TXT_BLACK + "◌";
      } else if (row.equals("E")) { E[column] = TXT_BLACK + "◌";
      } else if (row.equals("F")) { F[column] = TXT_BLACK + "◌";
      } else if (row.equals("G")) { G[column] = TXT_BLACK + "◌";
      } else if (row.equals("H")) { H[column] = TXT_BLACK + "◌";
      } else if (row.equals("I")) { I[column] = TXT_BLACK + "◌";
      } else if (row.equals("J")) { J[column] = TXT_BLACK + "◌";
      } else if (row.equals("K")) { K[column] = TXT_BLACK + "◌";
      } else if (row.equals("L")) { L[column] = TXT_BLACK + "◌";
      } else { o.msgErr(); }
    }

    // Display hit or miss
    if (hit == false) {
      o.msgYel("    ࿏ MISS! ࿏\n");
    } else {
      o.msgLim(" .⁎˚⭒✷💥 HIT! 💥✷࿏˚*.\n");
      ++hits;
    }

    o.msgCya("\nHits: "); o.msgWhi(hits + "\n");
    return hits;
  }

  // Game board
	public void showBoard () {
    o.msgYel("┍─────────────────  "); o.msgCya("GAME BOARD"); o.msgYel("  ──────────────────┑\n");
		o.msgYel("│ "); o.msgWhi("    1  2  3  4  5  6  7  8  9 10 11 12 13 14 15"); o.msgYel(" │\n");
    o.msgYel("│   ┍─────────────────────────────────────────────┥\n");
		
    o.msgYel("│ "); o.msgWhi("A"); o.msgYel(" │ ");
		for (int idx = 1; idx < 16; ++idx) { o.msgWhi(A[idx] + "  "); }    
		o.msgYel("\n│ "); o.msgWhi("B"); o.msgYel(" │ ");
		for (int idx = 1; idx < 16; ++idx) { o.msgWhi(B[idx] + "  "); }
		o.msgYel("\n│ "); o.msgWhi("C"); o.msgYel(" │ ");
		for (int idx = 1; idx < 16; ++idx) { o.msgWhi(C[idx] + "  "); }
		o.msgYel("\n│ "); o.msgWhi("D"); o.msgYel(" │ ");
		for (int idx = 1; idx < 16; ++idx) { o.msgWhi(D[idx] + "  "); }
		o.msgYel("\n│ "); o.msgWhi("E"); o.msgYel(" │ ");
		for (int idx = 1; idx < 16; ++idx) { o.msgWhi(E[idx] + "  "); }
		o.msgYel("\n│ "); o.msgWhi("F"); o.msgYel(" │ ");
		for (int idx = 1; idx < 16; ++idx) { o.msgWhi(F[idx] + "  "); }
		o.msgYel("\n│ "); o.msgWhi("G"); o.msgYel(" │ ");
		for (int idx = 1; idx < 16; ++idx) { o.msgWhi(G[idx] + "  "); }
		o.msgYel("\n│ "); o.msgWhi("H"); o.msgYel(" │ ");
		for (int idx = 1; idx < 16; ++idx) { o.msgWhi(H[idx] + "  "); }
		o.msgYel("\n│ "); o.msgWhi("I"); o.msgYel(" │ ");
		for (int idx = 1; idx < 16; ++idx) { o.msgWhi(I[idx] + "  "); }
		o.msgYel("\n│ "); o.msgWhi("J"); o.msgYel(" │ ");
		for (int idx = 1; idx < 16; ++idx) { o.msgWhi(J[idx] + "  "); }
    o.msgYel("\n│ "); o.msgWhi("K"); o.msgYel(" │ ");
		for (int idx = 1; idx < 16; ++idx) { o.msgWhi(K[idx] + "  "); }
    o.msgYel("\n│ "); o.msgWhi("L"); o.msgYel(" │ ");
		for (int idx = 1; idx < 16; ++idx) { o.msgWhi(L[idx] + "  "); }
    
    o.msgYel("\n│   ┕─────────────────────────────────────────────┥");
    o.msgYel("\n┕─────────────────────────────────────────────────┙\n");
	}

  // Show Ship Pieces
  public void showShips(boolean toggled) {
    if (toggled) {
      o.msgPur("  ┍─────────────────────────────────────────────┑\n");
      o.msgPur("  │"); o.msgYel(" SHIP COORDINATES                            "); o.msgPur("│\n");
      o.msgPur("  ┝─────────────────────────────────────────────┥\n");
      o.msgPur("  │\n");
      o.msgPur("  │"); o.msgYel("    ☐ ☐ ☐"); o.msgMag("       [" + s1p1 + "] [" + s1p2 + "] [" + s1p3 + "]\n");
      o.msgPur("  │\n");
      o.msgPur("  │\n");
      o.msgPur("  │"); o.msgYel("  ☐ ☐ ☐ ☐ ☐"); o.msgMag("     [" + s2p1 + "] [" + s2p2 + "] [" + s2p3 + "] [" + s2p4 + "] [" + s2p5 + "]\n");
      o.msgPur("  │\n");
      o.msgPur("  │"); o.msgYel("      ☐\n");
      o.msgPur("  │"); o.msgYel("      ☐"); o.msgMag("         [" + s3p1 + "] [" + s3p2 + "] [" + s3p3 + "]\n");
      o.msgPur("  │"); o.msgYel("      ☐\n");
      o.msgPur("  ┕─────────────────────────────────────────────┙\n\n");
    }
  }
  
  public String[] A = {"∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘"};
	public String[] B = {"∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘"};
	public String[] C = {"∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘"};
	public String[] D = {"∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘"};
	public String[] E = {"∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘"};
	public String[] F = {"∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘"};
	public String[] G = {"∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘"};
	public String[] H = {"∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘"};
	public String[] I = {"∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘"};
	public String[] J = {"∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘"};
  public String[] K = {"∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘"};
  public String[] L = {"∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘","∘"};
  
  public String s1p1;
  public String s1p2;
  public String s1p3;

  public String s2p1;
  public String s2p2;
  public String s2p3;
  public String s2p4;
  public String s2p5;

  public String s3p1;
  public String s3p2;
  public String s3p3;

}
