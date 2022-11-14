package demo;

import demo.uifactory.MacUIFactory;

public class Main {

  public static void main(String[] args) {
    Application application = new Application(new MacUIFactory());
    application.paint();
  }

}
