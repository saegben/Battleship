public class Main {
	public static void main(String[] args) {   
    // Messages
    Out o = new Out();
		o.msgB("Welcome to Battleship!\n");
		o.msgB("Try to hit my two ships within 20 guesses.\n");

    Board b = new Board();

    int max = 10;
    int min = 1;
    int range = max - min + 1;
 
    // Ship 1
    int rowRandom1 = (int)(Math.random() * range) + min;
    int columnStartRandom1 = (int)(Math.random() * range) + min;
    b.placeShip(1, rowRandom1, columnStartRandom1);

    // Ship 2
    int rowRandom2 = (int)(Math.random() * range) + min;
    int columnStartRandom2 = (int)(Math.random() * range) + min;
    b.placeShip(2, rowRandom2, columnStartRandom2);


    // Display ship locations
    //o.msgW("ship 1 position: " + 1 + " row: " + rowRandom1 + " column: " + columnStartRandom1);
    //o.msgW("ship 2 position: " + 2 + " row: " + rowRandom2 + " column: " + columnStartRandom2);

    // Handle hits
    int hits = 0;
		int guesses = 20;

		while (hits < 8) { 
			b.showBoard();
			b.handleUserGuess();
			hits = b.checkWinStatus();

      // Handle guesses
      --guesses;
      o.msgW("Guesses: " + guesses + "\n");
      if (guesses == 0) break;
		}

		if (guesses == 0) {
			o.msgB("\n\n\nOhhh yeaaahhhhh!!!!\n");
			o.msgB("You had a good run! Sorta.. Well, you can always try again..");
		}
		else {
			o.msgB("\n\n\nYou sunk my ships!!!!\n");
			o.msgB("Thanks for playing!!!!");
		}
    
	}
}