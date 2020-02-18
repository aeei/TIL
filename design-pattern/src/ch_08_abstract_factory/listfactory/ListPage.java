package ch_08_abstract_factory.listfactory;

import ch_08_abstract_factory.factory.Item;
import ch_08_abstract_factory.factory.Page;
import java.util.Iterator;

public class ListPage extends Page {

  public ListPage(String title, String author) {
    super(title, author);
  }

  public String makeHTML() {
    StringBuffer buffer = new StringBuffer();
    buffer.append("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /><title>" + title + "</title></head>\n");
    buffer.append("<body>\n");
    buffer.append("<h1>" + title + "</h1>\n");
    buffer.append("<ul>\n");

    Iterator it = content.iterator();
    while (it.hasNext()) {
      Item item = (Item) it.next();
      buffer.append(item.makeHTML());
    }

    buffer.append("</ul>\n");
    buffer.append("<hr><address>" + author + "</address>");
    buffer.append("</body></html>\n");

    return buffer.toString();
  }
}
