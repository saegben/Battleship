import java.util.*;

public class Main {
	public static void main(String[] args) {   
    Out o = new Out();
    Board b = new Board();
    
		o.msgB("Welcome to Battleship!\n");
		o.msgB("Try to hit my two ships within 30 guesses.\n\n");

    b.createShips();

    b.showShips(false); // change to 'true' to get ship coordinates

    // Handle game
    boolean win = false;
		int guesses = 30;
    
		while (true) { 
			b.showBoard();
			int hits = b.handleUserGuess();

      --guesses;
      o.msgW("Guesses: " + guesses + "\n");

      if (guesses == 0) {
        break;
      } 
      if (hits == 11) {
        win = true;
        break;
      }
		}

    if (win == true) {
      b.showBoard();
      o.msgG("\n\n───────────────────────────────────────────────");
      o.msgG("\n              You sunk my ships!!!");
			o.msgG("\n             Thanks for playing!!!!");
      o.msgG("\n───────────────────────────────────────────────");
		} else {
      b.showBoard();
      o.msgY("\n\n───────────────────────────────────────────────");
			o.msgY("\n                   GAME OVER");
			o.msgY("\n             Thanks for playing!!!!");
      o.msgY("\n───────────────────────────────────────────────");
		}
    
	}
}