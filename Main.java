import java.util.*;

public class Main {
	public static void main(String[] args) {   
    Out o = new Out();
    Board b = new Board();
    UserHandling u = new UserHandling();

		o.msgBlu("\nWelcome to Battleship!\n");
		o.msgCya("Try to hit the three ships within 30 guesses.\n\n");

    b.createShips();
    b.showShips(false); // change to 'true' to get ship coordinates
    u.handleLogs();

		int guesses = 30;

		while (true) { 
      u.handleGuesses(guesses);
			b.showBoard();

      boolean askUser = true;
      while (askUser) {
        if ((u.checkInput(u.promptRowInput(), u.promptColumnInput())) == false) {
          askUser = false;
          --guesses;
        }
      }

			int hits = b.handleMove(u.getRowInput(), u.getColumnInput());

      // Check for win
      if (hits == 11) {
        b.showBoard();
        o.msgGre("\n\n───────────────────────────────────────────────");
        o.msgLim("\n              You sunk every ship!");
			  o.msgLim("\n             Thanks for playing!!!!");
        o.msgGre("\n───────────────────────────────────────────────");
        break;
      } else if (guesses == 0) {
        b.showBoard();
        o.msgPur("\n\n───────────────────────────────────────────────");
			  o.msgMag("\n                   GAME OVER");
			  o.msgMag("\n             Thanks for playing!!!!");
        o.msgPur("\n───────────────────────────────────────────────");
        break; 
      }
		}
    
	}
}