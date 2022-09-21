// User column input
import java.util.Scanner;

class ColumnInput {
  Scanner userColumnInput = new Scanner(System.in);
  int UColumn;

  public void promptColumnInput() {
    
    // Account for non-int column
    while (true) {
      try {
        UColumn = Integer.parseInt(userColumnInput.next());

        break;
      } catch (NumberFormatException e) {
        
        break;
      }
    }
    
  }

  public int getColumnInput() {
    return UColumn;
  }
  
}