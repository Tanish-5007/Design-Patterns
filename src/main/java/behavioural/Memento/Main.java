package behavioural.Memento;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Memento saved;

        counter.increment();
        counter.increment();
        System.out.println(counter);

        saved = counter.save();

        counter.increment();
        System.out.println(counter);

        counter.restore(saved);
        System.out.println(counter);
    }
}
