package behavioural.observer.obserable;

import behavioural.observer.observer.Observer;

public interface Observable {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();

}
