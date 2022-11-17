class Out {

  // Preset messages
  public void msgErr() { System.out.println(TEXT_RESET + RED + BLACK_BR + "\033[3m[ERROR] Something went wrong...\033[0m" + TEXT_RESET); }
  public void msgInv (String msg) { System.out.println(TEXT_RESET + BLACK_BR + RED + "\033[3m[UH OH!] \033[0m" + BLACK_BR + PINK + msg + TEXT_RESET); }

  // Text colors
  public void msgBla (String msg) { System.out.print(TEXT_RESET + BLACK + msg + TEXT_RESET); }
  public void msgRed (String msg) { System.out.print(TEXT_RESET + RED + msg + TEXT_RESET); }
  public void msgGre (String msg) { System.out.print(TEXT_RESET + GREEN + msg + TEXT_RESET); }
  public void msgBlu (String msg) { System.out.print(TEXT_RESET + BLUE + msg + TEXT_RESET); }
  public void msgPur (String msg) { System.out.print(TEXT_RESET + PURPLE + msg + TEXT_RESET); }
  public void msgWhi (String msg) { System.out.print(TEXT_RESET + WHITE + msg + TEXT_RESET); }
  public void msgPin (String msg) { System.out.print(TEXT_RESET + PINK + msg + TEXT_RESET); }
  public void msgLim (String msg) { System.out.print(TEXT_RESET + LIME + msg + TEXT_RESET); }
  public void msgYel (String msg) { System.out.print(TEXT_RESET + YELLOW + msg + TEXT_RESET); }
  public void msgSky (String msg) { System.out.print(TEXT_RESET + SKY + msg + TEXT_RESET); }
  public void msgMag (String msg) { System.out.print(TEXT_RESET + MAGENTA + msg + TEXT_RESET); }
  public void msgCya (String msg) { System.out.print(TEXT_RESET + CYAN + msg + TEXT_RESET); }

  public static final String BLACK = "\u001B[30m";{}
  public static final String RED = "\u001B[31m";{}
  public static final String GREEN = "\u001B[32m";{}
  public static final String BLUE = "\u001B[34m";{}
  public static final String PURPLE = "\u001B[35m";{}
  public static final String WHITE = "\u001B[37m";{}
  public static final String PINK = "\u001B[91m";{}
  public static final String LIME = "\u001B[92m";{}
  public static final String YELLOW = "\u001B[93m";{}
  public static final String SKY = "\u001B[94m";{}
  public static final String MAGENTA = "\u001B[95m";{}
  public static final String CYAN = "\u001B[96m";{}
  public static final String BLACK_BR = "\u001B[100m";{}
  
  // Text reset
  public static final String TEXT_RESET = "\u001B[0m";{}
}
