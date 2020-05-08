package ch_15_facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {

  private Database() { // new 인스턴스 생성 제한

  }

  public static Properties getProperties(String dbname) {
    String filename = "ch_15_facade/"+dbname + ".txt";
    Properties prop = new Properties();

    try {
      prop.load(new FileInputStream(filename));
    } catch (IOException e) {
      System.out.println("Warning: " + filename + " is not found.");
    }

    return prop;
  }

}
