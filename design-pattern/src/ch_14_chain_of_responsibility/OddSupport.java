package ch_14_chain_of_responsibility;

public class OddSupport extends Support {

  public OddSupport(String name) {
    super(name);
  }

  protected boolean resolve(Trouble trouble) {
    return trouble.getNumber() % 2 == 1;
  }
}
