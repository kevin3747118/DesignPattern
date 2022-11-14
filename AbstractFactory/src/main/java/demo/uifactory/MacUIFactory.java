package demo.uifactory;

import demo.Button;
import demo.CheckBox;
import demo.os.mac.MacButton;
import demo.os.mac.MacCheckBox;

public class MacUIFactory implements UIFactory {

  @Override
  public Button createButton() {
    return new MacButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new MacCheckBox();
  }
}
