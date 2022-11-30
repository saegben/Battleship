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
      switch (rowSetArray[0]) {
        case 0: ship1Row = "A"; break;
        case 1: ship1Row = "B"; break;
        case 2: ship1Row = "C"; break;
        case 3: ship1Row = "D"; break;
        case 4: ship1Row = "E"; break;
        case 5: ship1Row = "F"; break;
        case 6: ship1Row = "G"; break;
        case 7: ship1Row = "H"; break;
        case 8: ship1Row = "I"; break;
        case 9: ship1Row = "J"; break;
        case 10: ship1Row = "K"; break;
        case 11: ship1Row = "L"; break;
      }
      s1p1 = ship1Row + colSetArray[0];
      s1p2 = ship1Row + (colSetArray[0] + 1);
      s1p3 = ship1Row + (colSetArray[0] + 2);
      
      // Ship 2
      String ship2Row = "";
      switch (rowSetArray[1]) {
        case 0: ship2Row = "A"; break;
        case 1: ship2Row = "B"; break;
        case 2: ship2Row = "C"; break;
        case 3: ship2Row = "D"; break;
        case 4: ship2Row = "E"; break;
        case 5: ship2Row = "F"; break;
        case 6: ship2Row = "G"; break;
        case 7: ship2Row = "H"; break;
        case 8: ship2Row = "I"; break;
        case 9: ship2Row = "J"; break;
        case 10: ship2Row = "K"; break;
        case 11: ship2Row = "L"; break;
      }
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
      switch (VrowSetArray[0]) {
        case 0: ship3Row1 = "A"; break;
        case 1: ship3Row1 = "B"; break;
        case 2: ship3Row1 = "C"; break;
        case 3: ship3Row1 = "D"; break;
        case 4: ship3Row1 = "E"; break;
        case 5: ship3Row1 = "F"; break;
        case 6: ship3Row1 = "G"; break;
        case 7: ship3Row1 = "H"; break;
        case 8: ship3Row1 = "I"; break;
        case 9: ship3Row1 = "J"; break;
        case 10: ship3Row1 = "K"; break;
        case 11: ship3Row1 = "L"; break;
      }
      switch (VrowSetArray[0] + 1) {
        case 0: ship3Row2 = "A"; break;
        case 1: ship3Row2 = "B"; break;
        case 2: ship3Row2 = "C"; break;
        case 3: ship3Row2 = "D"; break;
        case 4: ship3Row2 = "E"; break;
        case 5: ship3Row2 = "F"; break;
        case 6: ship3Row2 = "G"; break;
        case 7: ship3Row2 = "H"; break;
        case 8: ship3Row2 = "I"; break;
        case 9: ship3Row2 = "J"; break;
        case 10: ship3Row2 = "K"; break;
        case 11: ship3Row2 = "L"; break;
      }
      switch (VrowSetArray[0] + 2) {
        case 0: ship3Row3 = "A"; break;
        case 1: ship3Row3 = "B"; break;
        case 2: ship3Row3 = "C"; break;
        case 3: ship3Row3 = "D"; break;
        case 4: ship3Row3 = "E"; break;
        case 5: ship3Row3 = "F"; break;
        case 6: ship3Row3 = "G"; break;
        case 7: ship3Row3 = "H"; break;
        case 8: ship3Row3 = "I"; break;
        case 9: ship3Row3 = "J"; break;
        case 10: ship3Row3 = "K"; break;
        case 11: ship3Row3 = "L"; break;
      }
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
      switch (row) {
        case "A": A[column] = TXT_GREEN + "✘"; break;
        case "B": B[column] = TXT_GREEN + "✘"; break;
        case "C": C[column] = TXT_GREEN + "✘"; break;
        case "D": D[column] = TXT_GREEN + "✘"; break;
        case "E": E[column] = TXT_GREEN + "✘"; break;
        case "F": F[column] = TXT_GREEN + "✘"; break;
        case "G": G[column] = TXT_GREEN + "✘"; break;
        case "H": H[column] = TXT_GREEN + "✘"; break;
        case "I": I[column] = TXT_GREEN + "✘"; break;
        case "J": J[column] = TXT_GREEN + "✘"; break;
        case "K": K[column] = TXT_GREEN + "✘"; break;
        case "L": L[column] = TXT_GREEN + "✘"; break;
      }
    } else {
      switch (row) {
        case "A": A[column] = TXT_BLACK + "◌"; break;
        case "B": B[column] = TXT_BLACK + "◌"; break;
        case "C": C[column] = TXT_BLACK + "◌"; break;
        case "D": D[column] = TXT_BLACK + "◌"; break;
        case "E": E[column] = TXT_BLACK + "◌"; break;
        case "F": F[column] = TXT_BLACK + "◌"; break;
        case "G": G[column] = TXT_BLACK + "◌"; break;
        case "H": H[column] = TXT_BLACK + "◌"; break;
        case "I": I[column] = TXT_BLACK + "◌"; break;
        case "J": J[column] = TXT_BLACK + "◌"; break;
        case "K": K[column] = TXT_BLACK + "◌"; break;
        case "L": L[column] = TXT_BLACK + "◌"; break;
      }
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
	public void showBoard (String gameState) {
    if (gameState == "playing") {
      System.out.println("current game state: PLAYING");
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
    else if (gameState == "lose") {
      System.out.println("current game state: LOSE");
      o.msgPin("┍─────────────────  "); o.msgRed("GAME BOARD"); o.msgPin("  ──────────────────┑\n");
		  o.msgPin("│ "); o.msgWhi("    1  2  3  4  5  6  7  8  9 10 11 12 13 14 15"); o.msgPin(" │\n");
      o.msgPin("│   ┍─────────────────────────────────────────────┥\n");
		
      o.msgPin("│ "); o.msgWhi("A"); o.msgPin(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(A[idx] + "  "); }    
		  o.msgPin("\n│ "); o.msgWhi("B"); o.msgPin(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(B[idx] + "  "); }
		  o.msgPin("\n│ "); o.msgWhi("C"); o.msgPin(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(C[idx] + "  "); }
		  o.msgPin("\n│ "); o.msgWhi("D"); o.msgPin(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(D[idx] + "  "); }
		  o.msgPin("\n│ "); o.msgWhi("E"); o.msgPin(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(E[idx] + "  "); }
		  o.msgPin("\n│ "); o.msgWhi("F"); o.msgPin(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(F[idx] + "  "); }
		  o.msgPin("\n│ "); o.msgWhi("G"); o.msgPin(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(G[idx] + "  "); }
		  o.msgPin("\n│ "); o.msgWhi("H"); o.msgPin(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(H[idx] + "  "); }
		  o.msgPin("\n│ "); o.msgWhi("I"); o.msgPin(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(I[idx] + "  "); }
		  o.msgPin("\n│ "); o.msgWhi("J"); o.msgPin(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(J[idx] + "  "); }
      o.msgPin("\n│ "); o.msgWhi("K"); o.msgPin(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(K[idx] + "  "); }
      o.msgPin("\n│ "); o.msgWhi("L"); o.msgPin(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(L[idx] + "  "); }
    
      o.msgPin("\n│   ┕─────────────────────────────────────────────┥");
      o.msgPin("\n┕─────────────────────────────────────────────────┙\n");
    }
    else if (gameState == "win") {
      System.out.println("current game state: WIN");
      o.msgLim("┍─────────────────  "); o.msgGre("GAME BOARD"); o.msgLim("  ──────────────────┑\n");
		  o.msgLim("│ "); o.msgWhi("    1  2  3  4  5  6  7  8  9 10 11 12 13 14 15"); o.msgLim(" │\n");
      o.msgLim("│   ┍─────────────────────────────────────────────┥\n");
		
      o.msgLim("│ "); o.msgWhi("A"); o.msgLim(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(A[idx] + "  "); }    
		  o.msgLim("\n│ "); o.msgWhi("B"); o.msgLim(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(B[idx] + "  "); }
		  o.msgLim("\n│ "); o.msgWhi("C"); o.msgLim(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(C[idx] + "  "); }
		  o.msgLim("\n│ "); o.msgWhi("D"); o.msgLim(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(D[idx] + "  "); }
		  o.msgLim("\n│ "); o.msgWhi("E"); o.msgLim(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(E[idx] + "  "); }
		  o.msgLim("\n│ "); o.msgWhi("F"); o.msgLim(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(F[idx] + "  "); }
		  o.msgLim("\n│ "); o.msgWhi("G"); o.msgLim(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(G[idx] + "  "); }
		  o.msgLim("\n│ "); o.msgWhi("H"); o.msgLim(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(H[idx] + "  "); }
		  o.msgLim("\n│ "); o.msgWhi("I"); o.msgLim(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(I[idx] + "  "); }
		  o.msgLim("\n│ "); o.msgWhi("J"); o.msgLim(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(J[idx] + "  "); }
      o.msgLim("\n│ "); o.msgWhi("K"); o.msgLim(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(K[idx] + "  "); }
      o.msgLim("\n│ "); o.msgWhi("L"); o.msgLim(" │ ");
		  for (int idx = 1; idx < 16; ++idx) { o.msgWhi(L[idx] + "  "); }
    
      o.msgLim("\n│   ┕─────────────────────────────────────────────┥");
      o.msgLim("\n┕─────────────────────────────────────────────────┙\n");
    }

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