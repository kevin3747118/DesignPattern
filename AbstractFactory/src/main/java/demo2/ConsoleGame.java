package demo2;

public class ConsoleGame extends GuessGame {

  @Override
  public IO inputOutput() {
    return new ConsoleIO();
  }
}
