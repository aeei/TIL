# Design Patterns

## index

- [Chapter.03 Template Method](./src/ch_03_template_method/Main.java)
  - 상위 클래스에서 처리의 뼈대를 결정하고, 하위 클래스에서 그 구체적인 내용을 경정하는 디자인 패턴
  - 로직을 공통화할 수 있다.
  - 상위 클래스형 변수에 하위 클래스의 어떠한 인스턴스를 대입해도 제대로 작동할 수 있도록 한다.(Th
  e Liskov Substitution Principle)
  - 하위 클래스는 상위 클래스에서 선언된 추상 메소드를 구현할 책임이 생김(Subclass responsibility)
- [Chapter.04 Factory Method](./src/ch_04_factory_method/Main.java)
  - 인스턴스를 생성하는 공장을 Template Method 패턴으로 구성한 것
  - 인스턴스 생성을 위한 골격은 상위 클래스에서 실제 인스턴스 생성은 하위 클래스에서 한다. -> 분리해서 생각할 수 있다.
  - creator의 역할을 수행하는 클래스는 대부분 Singleton 패턴으로 만들 수 있다.
- [Chapter.05 Singleton](./src/ch_05_singleton/Main.java)
  - 인스턴스가 한 개밖에 존재하지 않는 것을 보증하는 패턴
- [Chapter.06 Prototype](./src/ch_06_prototype/Main.java)
  - 인스턴스에서 새로운 인스턴스를 만드는 패턴
    - Croneable과 clone
      - clone은 복사를 할 뿐이지 생성자를 호출하는 것이 아니다.
      - clone은 피상적인 복사(shallow copy)이다.
      - clone 메소드를 오버라이드 하는 경우에 super.clone()을 호출해야 한다.