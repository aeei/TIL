package ch_04_factory_method;

import ch_04_factory_method.framework.Factory;
import ch_04_factory_method.framework.Product;
import ch_04_factory_method.idcard.IDCardFactory;

public class Main {

  public static void main(String[] args) {
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("김켈리");
    Product card2 = factory.create("김자바");
    Product card3 = factory.create("타자치는 복서");

    card1.use();
    card2.use();
    card3.use();
  }
}
