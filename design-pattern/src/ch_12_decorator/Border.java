package ch_12_decorator;

public abstract class Border extends Display {

  protected Display display;

  protected Border(Display display) {
    this.display = display;
  }
}
