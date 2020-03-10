package ch_13_visitor;

import ch_11_composite.FileTreatmentException;
import java.util.Iterator;

public abstract class Entry implements Element {

  public abstract String getName();

  public abstract int getSize();

  public Entry add(Entry entry) throws FileTreatmentException {
    throw new FileTreatmentException();
  }

  public Iterator iterator() throws FileTreatmentException {
    throw new FileTreatmentException();
  }

  public String toString() {
    return getName() + " (" + getSize() + ")";
  }
}
