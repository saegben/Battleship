import java.util.*;

public class Main {
	public static void main(String[] args) {   
    Out o = new Out();
    Board b = new Board();
    UserHandling u = new UserHandling();
    
		o.msgB("Welcome to Battleship!\n");
		o.msgB("Try to hit my three ships within 30 guesses.\n\n");

    // Setup
    b.createShips();
    b.showShips(true); // change to 'true' to get ship coordinates
    u.handleLogs();

    // Handle game
    boolean win = false;
		int guesses = 30;
    
		while (true) { 
      u.handleGuesses(guesses);
			b.showBoard();

      // Ask for user input until valid response      
      boolean askUser = true;
      while (askUser) {
        if ((u.checkInput(u.promptRowInput(), u.promptColumnInput())) == false) {
          askUser = false;
          --guesses;
        }
      }

			int hits = b.handleMove(u.getRowInput(), u.getColumnInput());

      if (hits == 11) {
        win = true;
        break;
      }
      else if (guesses == 0) {
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
