package demo.os.win;

import demo.Button;

public class WinButton implements Button {


  @Override
  public void paint() {
    System.out.println("Win Button");
  }
}
