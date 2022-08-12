// User row input
import java.util.Scanner;

class RowInput {
  Scanner userRowInput = new Scanner(System.in);
  String URow;
  
  public void promptRowInput() {
    URow = userRowInput.nextLine().toUpperCase();
  }

  public String getRowInput() {
    return URow;
  }
  
}