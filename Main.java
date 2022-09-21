import java.util.*;

public class Main {
	public static void main(String[] args) {   
    // Messages
    Out o = new Out();
		o.msgB("Welcome to Battleship!\n");
		o.msgB("Try to hit my two ships within 20 guesses.\n\n");

    Board b = new Board();

    // GENERATE ROWS
    Random randNum1 = new Random();
    Set<Integer> rowSet = new LinkedHashSet<Integer>();
    while (rowSet.size() < 2) { // amount of generated numbers
      rowSet.add(randNum1.nextInt(12)); // row range: 0 - 11
    }
    Integer[] rowSetArray = new Integer[rowSet.size()];
    rowSetArray = rowSet.toArray(rowSetArray);

    // GENERATE COLUMNS
    Random randNum2 = new Random();
    Set<Integer> colSet = new LinkedHashSet<Integer>();
    while (colSet.size() < 2) { // amount of generated numbers
      colSet.add(randNum2.nextInt(11) + 1); // column range: 1 - 11
    }
    Integer[] colSetArray = new Integer[colSet.size()];
    colSetArray = colSet.toArray(colSetArray);

    // PLACE SHIPS
    b.placeShipOne(1, rowSetArray[0], colSetArray[0], colSetArray[0] + 1, colSetArray[0] + 2);
    b.placeShipTwo(2, rowSetArray[1], colSetArray[1], colSetArray[1] + 1, colSetArray[1] + 2, colSetArray[1] + 3, colSetArray[1] + 4);

    // Display Ship Positions
    b.showShips(true); // change to 'true' to get ship coordinates

    // Handle Game
    boolean win = false;
    int hits = 0; // hits still not counted
		int guesses = 20;
    
		while (hits < 10) { 
			b.showBoard();
			b.handleUserGuess();
			b.checkWinStatus();

      // Handle guesses
      --guesses;
      o.msgW("Guesses: " + guesses + "\n");

      // End game
      if (guesses == 0) {
        break;
      } 
      if (hits == 8) {
        win = true;
        break;
      }
		}

    if (win == true) {
      o.msgG("\n\n\nYou sunk my ships!!!!\n");
			o.msgG("Thanks for playing!!!!");
		} else {
			o.msgY("\n\n\nOhhh yeaaahhhhh!!!!\n");
			o.msgY("You had a good run! Sorta.. Well, you can always try again..");
		}
    
    
	}
}