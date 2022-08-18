public class Main {
	public static void main(String[] args) {   
    // Messages
    Out o = new Out();
		o.msgB("Welcome to Battleship!\n");
		o.msgB("Try to hit my two ships within 20 guesses.\n\n");

    Board b = new Board();

 
    // Ship 1
    int rowRandom1 = (int)(Math.random() * 10);
    int columnStartRandom1 = (int)(Math.random() * 10);
    b.placeShip(1, rowRandom1, columnStartRandom1);

    // Ship 2
    int rowRandom2 = (int)(Math.random() * 10);
    int columnStartRandom2 = (int)(Math.random() * 10);
    b.placeShip(2, rowRandom2, columnStartRandom2);


    // Display ship locations
    o.msgW("ship " + 1 + " position, row: " + rowRandom1 + " column: " + columnStartRandom1 + "\n");
    o.msgW("ship " + 2 + " position, row: " + rowRandom2 + " column: " + columnStartRandom2 + "\n");

    // Handle Game
    boolean win = false;
    int hits = 0;
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