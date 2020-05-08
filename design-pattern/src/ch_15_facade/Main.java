package ch_15_facade;

import ch_15_facade.pagemaker.PageMaker;

public class Main {

  public static void main(String[] args) {
    PageMaker.makeWelcomePage("admin@aeei.io", "welcome.html");
  }
}
