package ch_08_abstract_factory;

import ch_08_abstract_factory.factory.Factory;
import ch_08_abstract_factory.factory.Link;
import ch_08_abstract_factory.factory.Page;
import ch_08_abstract_factory.factory.Tray;

public class Main {

  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Usage: java Main class.name.of.ConcreateFactory");
      System.out.println("Example 1: java Main listfactory.ListFactory");
      System.out.println("Example 2: java Main tablefactory.TableFactory");
      System.exit(0);
    }
    Factory factory = Factory.getFactory(args[0]);

    Link sqlgate = factory.createLink("SQLGate", "https://www.sqlgate.com/");
    Link querypie = factory.createLink("QueryPie", "https://www.querypie.com/");

    Link google = factory.createLink("Google", "https://www.google.com/");
    Link naver = factory.createLink("Naver", "https://www.naver.com/");

    Tray trayProducts = factory.createTray("CHEQUER DB IDE 제품");
    trayProducts.add(sqlgate);
    trayProducts.add(querypie);

    Tray traySearch = factory.createTray("검색엔진");
    traySearch.add(google);
    traySearch.add(naver);

    Page page = factory.createPage("LinkPage", "김켈리");
    page.add(trayProducts);
    page.add(traySearch);
    page.output();
  }
}
