package ch_09_bridge;

public class Main {

  public static void main(String[] args) {
    Display d1 = new Display(new StringDisplayImpl("Hello, Boxing."));
    Display d2 = new CountDisplay(new StringDisplayImpl("Hello, Jiu-jitsu"));
    CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, CrossFit"));

    d1.display();
    d2.display();
    d3.display();
    d3.multiDisplay(5);
  }
}
