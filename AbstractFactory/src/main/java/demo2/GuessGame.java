package demo2;

abstract class GuessGame {

  public void go() {
    IO io = inputOutput();
    var number = (int) (Math.random() * 3);
    var guess = -1;
    do {
      io.print("輸入數字：");
      guess = io.nextInt();
    } while (guess != number);
    io.print("猜中了");
  }

  public abstract IO inputOutput();
}
