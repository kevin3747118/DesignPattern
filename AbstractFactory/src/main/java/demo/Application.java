package demo;

import demo.uifactory.UIFactory;

public class Application {

  private final Button button;
  private final CheckBox checkbox;

  public Application(UIFactory factory) {
    this.button = factory.createButton();
    this.checkbox = factory.createCheckBox();
  }

  public void paint() {
    button.paint();
    checkbox.paint();
  }

}
