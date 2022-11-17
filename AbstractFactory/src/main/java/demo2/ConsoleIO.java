package demo2;

import java.util.Scanner;

interface IO {

  int nextInt();

  void print(String text);
}


class ConsoleIO implements IO {

  Scanner console = new Scanner(System.in);

  @Override
  public int nextInt() {
    return console.nextInt();
  }

  @Override
  public void print(String text) {
    System.out.println(text);
  }
}