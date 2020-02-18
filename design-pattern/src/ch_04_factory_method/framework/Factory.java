package ch_04_factory_method.framework;

public abstract class Factory {

  public final Product create(String owner) {
    Product p = createProduct(
        owner); // new를 사용해서 실제의 인스턴스를 생성하는 대신에, 인스턴스 생성을 위한 메소드를 호출해서 구체적인 클래스 이름에 의한 속박에서 상위 클래스를 자유롭게 만든다.
    registerProduct(p);
    return p;
  }

  protected abstract Product createProduct(String owner);

  protected abstract void registerProduct(Product product);
}
