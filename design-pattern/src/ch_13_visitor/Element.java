package ch_13_visitor;

public interface Element {
  void accept(Visitor visitor);
}
