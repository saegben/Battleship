class Out {
  // Preset messages
  public void msgErr() { System.out.println(RED + "\033[3m[ERROR] Something went wrong...\033[0m" + RESET); }
  public void msgInv (String msg) { System.out.println(RED + "\033[3m[UH OH!] \033[0m" + PINK + msg + RESET); }

  // Text colors
  public void msgBla (String msg) { System.out.print(BLACK + msg + RESET); }
  public void msgRed (String msg) { System.out.print(RED + msg + RESET); }
  public void msgGre (String msg) { System.out.print(GREEN + msg + RESET); }
  public void msgBlu (String msg) { System.out.print(BLUE + msg + RESET); }
  public void msgPur (String msg) { System.out.print(PURPLE + msg + RESET); }
  public void msgWhi (String msg) { System.out.print(WHITE + msg + RESET); }
  public void msgPin (String msg) { System.out.print(PINK + msg + RESET); }
  public void msgLim (String msg) { System.out.print(LIME + msg + RESET); }
  public void msgYel (String msg) { System.out.print(YELLOW + msg + RESET); }
  public void msgSky (String msg) { System.out.print(SKY + msg + RESET); }
  public void msgMag (String msg) { System.out.print(MAGENTA + msg + RESET); }
  public void msgCya (String msg) { System.out.print(CYAN + msg + RESET); }

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
  
  // Text reset
  public static final String RESET = "\u001B[0m";{}
}