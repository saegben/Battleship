// Decorate messages
class Out {
	public void msg (String m) {
		System.out.println(TEXT_BLUE + m + TEXT_RESET);
	}
  // Colors
  public static final String TEXT_RESET = "\u001B[0m";{}
  public static final String TEXT_BLUE = "\u001B[34m";{}
}