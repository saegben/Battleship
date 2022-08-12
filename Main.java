public class Main {
	public static void main(String[] args) { 
    // Messages
    Out o = new Out();
		o.msg("Welcome to Battleship!");
		o.msg("Try to hit my two ships within 20 guesses.\n");

    Board b = new Board();

    int rowRandom1 = (int)(Math.random() * 7); // * Amount of rows
		int columnStartRandom1 = (int)(Math.random() * 2); // * Ship length

    int rowRandom2 = 7 + (int)(Math.random() * 15); // * Amount of rows
		int columnStartRandom2 = (int)(Math.random() * 4); // * Ship length
    
    b.placeShip(1, rowRandom1, columnStartRandom1);
    b.placeShip(2, rowRandom2, columnStartRandom2);

    // Handle hits
    int hits = 0;
		int guesses = 20;

		while (hits < 8) { 
			b.showBoard();
			b.handleUserGuess();
			hits = b.checkWinStatus();

      // Handle guesses
      --guesses;
      o.msg("Guesses: " + guesses);
      if (guesses == 0) break;
		}

		if (guesses == 0) {
			o.msg("\n\n\nOhhh yeaaahhhhh!!!!");
			o.msg("You had a good run! Sorta.. Well, you can always try again..");
		}
		else {
			o.msg("\n\n\nYou sunk my ships!!!!");
			o.msg("Thanks for playing!!!!");
		}
    
	}
}