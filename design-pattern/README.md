# Design Patterns

## index

- [Chapter.03 Template Method](./src/ch_03_template_method/Main.java)
  - 하위 클래스에서 구체적으로 처리하기
  - 상위 클래스에서 처리의 뼈대를 결정하고, 하위 클래스에서 그 구체적인 내용을 경정하는 디자인 패턴
  - 로직을 공통화할 수 있다.
  - 상위 클래스형 변수에 하위 클래스의 어떠한 인스턴스를 대입해도 제대로 작동할 수 있도록 한다.(Th
  e Liskov Substitution Principle)
  - 하위 클래스는 상위 클래스에서 선언된 추상 메소드를 구현할 책임이 생김(Subclass responsibility)
- [Chapter.04 Factory Method](./src/ch_04_factory_method/Main.java)
  - 하위 클래스에서 인스턴스 작성하기 
  - 인스턴스를 생성하는 공장을 Template Method 패턴으로 구성한 것
  - 인스턴스 생성을 위한 골격은 상위 클래스에서 실제 인스턴스 생성은 하위 클래스에서 한다. -> 분리해서 생각할 수 있다.
  - creator의 역할을 수행하는 클래스는 대부분 Singleton 패턴으로 만들 수 있다.
- [Chapter.05 Singleton](./src/ch_05_singleton/Main.java)
  - 인스턴스를 한 개만 만들기
  - 인스턴스가 한 개밖에 존재하지 않는 것을 보증하는 패턴
- [Chapter.06 Prototype](./src/ch_06_prototype/Main.java)
  - 복사해서 인스턴스 만들기
  - 인스턴스에서 새로운 인스턴스를 만드는 패턴
    - Croneable과 clone
      - clone은 복사를 할 뿐이지 생성자를 호출하는 것이 아니다.
      - clone은 피상적인 복사(shallow copy)이다.
      - clone 메소드를 오버라이드 하는 경우에 super.clone()을 호출해야 한다.
- [Chapter.07 Builder](./src/ch_07_builder/Main.java)
  - 복잡한 인스턴스 조립하기
- [Chapter.08 Abstract Factory](./src/ch_08_abstract_factory/Main.java) 
  - 관련 부품을 조합해서 제품 만들기
  - 추상적인 공장에서는 추상적인 부품을 조합해서 추상적인 제품을 만든다.
  - 부품의 구체적인 구현에는 주목하지 않고 인터페이스(API)에 주목한다.
  - 인터페이스(API)만을 사용해서 부품을 조립하고 제품으로 완성한다.
  - 공장을 추가하는 것은 간단하나, 부품을 추가하는것은 곤란하다.
    - 구체적인 공장 전부에 새로 추가된 부품에 대응하는 수정을 해야한다.
  - 인스턴스를 만드는 다양한 방법
    - new
    - clone
    - java.lang.Class newInstance()
- [Chapter.09 Bridge](./src/ch_09_bridge/Main.java)
  - 기능 계층과 구현 계층 분리하기
  - `기능 클래스 계층`과 `구현 클래스 계층` 사이를 연결
  - `기능 클래스 계층`: 새로운 기능을 추가하고 싶을 경우 클래스 계층 안에서 자신의 목적과 가까운 클래스를 찾아내 그 하위 클래스를 만들어, 목적한 기능을 추가한 새로운 클래스를 만든다.
    - 클래스 계층은 너무 깊게 하지 않는 편이 좋다.
  - `구현 클래스 계층`: AbstractClass의 하위 클래스를 만들어 추상 메소드를 구현하는 것
  - 하위 클래스를 만들려고 할 때, 의도를 확인할 필요가 있다.(기능/구현)
  - 새로 추가한 기능은 '모든 구현'에서 이용할 수 있다.
  - 상속은 견고한 연결이고 위임은 느슨한 연결이다.
    - Display.class 에서 구현 인스턴스의 메서드를 호출해서 떠넘기는 방식
- [Chapter.10 Strategy](./src/ch_10_strategy/Main.java)
  - 알고리즘을 모두 바꾸기
  - 알고리즘을 교체해서 같은 문제를 다른 방법으로 해결할 수 있도록 도와주는 패턴
 