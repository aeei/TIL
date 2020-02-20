package ch_10_strategy;

public interface Strategy {

  public Hand nextHand();

  public void study(boolean win);
}
