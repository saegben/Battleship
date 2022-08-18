// Decorate messages
class Out {
	public void msgW (String w) {
    System.out.print(TEXT_WHITE + w + TEXT_RESET);
  }
  public void msgBk (String bla) {
    System.out.print(TEXT_BLACK + bla + TEXT_RESET);
  }
  public void msgB (String blu) {
    System.out.print(TEXT_BLUE + blu + TEXT_RESET);
  }
  public void msgR (String r) {
    System.out.print(TEXT_RED + r + TEXT_RESET);
  }
  public void msgY (String y) {
    System.out.print(TEXT_YELLOW + y + TEXT_RESET);
  }
  public void msgG (String g) {
    System.out.print(TEXT_GREEN + g + TEXT_RESET);
  }
  
  // Text colors
  public static final String TEXT_RESET = "\u001B[0m";{}
  public static final String TEXT_WHITE = "\u001B[37m";{}
  public static final String TEXT_BLACK = "\u001B[30m";{}
  public static final String TEXT_BLUE = "\u001B[34m";{}
  public static final String TEXT_RED = "\u001B[31m";{}
  public static final String TEXT_YELLOW = "\u001B[93m";{}
  public static final String TEXT_GREEN = "\u001B[32m";{}
}