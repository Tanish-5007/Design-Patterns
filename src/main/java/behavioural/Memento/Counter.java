package behavioural.Memento;

public class Counter {

    private int count;

    public void increment() {
        count++;
    }

    public Memento save() {
        return new Memento(count);
    }

    public void restore(Memento m) {
        count = m.getState();
    }

    @Override
    public String toString() {
        return "Count: " + count;
    }

}
