package demo.os.mac;

import demo.Button;

public class MacButton implements Button {

  @Override
  public void paint() {
    System.out.println("Mac Button");
  }
}
