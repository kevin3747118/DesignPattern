package demo.uifactory;

import demo.Button;
import demo.CheckBox;
import demo.os.win.WinButton;
import demo.os.win.WinCheckBox;

public class WinUIFactory implements UIFactory{

  @Override
  public Button createButton() {
    return new WinButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new WinCheckBox();
  }
}
