package ch_13_visitor;

public class Main {

  public static void main(String[] args) {
    try {
      System.out.println("Making root entries...");
      Directory rootDir = new Directory("root");
      Directory binDir = new Directory("bin");
      Directory tmpDir = new Directory("tmp");
      Directory usrDir = new Directory("usr");
      rootDir.add(binDir);
      rootDir.add(tmpDir);
      rootDir.add(usrDir);
      binDir.add(new File("vi", 10000));
      binDir.add(new File("latex", 20000));
      rootDir.accept(new ListVisitor());

      System.out.println("");
      System.out.println("Making user entries");
      Directory kim = new Directory("Kim");
      Directory lee = new Directory("Lee");
      Directory park = new Directory("Park");
      usrDir.add(kim);
      usrDir.add(lee);
      usrDir.add(park);
      kim.add(new File("diary.html", 100));
      kim.add(new File("Composite.java", 200));
      lee.add(new File("memo.txt", 300));
      park.add(new File("game.doc", 400));
      park.add(new File("junk.mail", 500));
      rootDir.accept(new ListVisitor());
    } catch (FileTreatmentException e) {
      e.printStackTrace();
    }
  }
}
