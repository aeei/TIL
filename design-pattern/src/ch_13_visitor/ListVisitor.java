package ch_13_visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {

  private String currentDirectory = "";

  public void visit(File file) {
    System.out.println(currentDirectory + "/" + file);
  }

  public void visit(Directory directory) {
    System.out.println(currentDirectory + "/" + directory);

    String saveDirectory = currentDirectory;
    currentDirectory = currentDirectory + "/" + directory.getName();

    Iterator<Entry> it = directory.iterator();
    while (it.hasNext()) {
      Entry entry = it.next();
      entry.accept(this);
    }

    currentDirectory = saveDirectory;
  }
}
