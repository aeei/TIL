package ch_03_template_method;

public abstract class AbstractDisplay {
    public abstract void open(); // 하위 클래스에 구현을 맡김

    public abstract void print(); // 하위 클래스에 구현을 맡김

    public abstract void close(); // 하위 클래스에 구현을 맡김

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

}
