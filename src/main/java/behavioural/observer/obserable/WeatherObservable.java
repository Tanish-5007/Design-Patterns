package behavioural.observer.obserable;

import behavioural.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherObservable implements Observable{

    private final List<Observer> observerList;
    private int temperature;
    private int humidity;

    public WeatherObservable(){
        this.observerList = new ArrayList<>();
    }

    private boolean hasObserver(Observer observer){
        int index = observerList.indexOf(observer);
        return index >= 0;
    }

    @Override
    public void registerObserver(Observer observer) {
        if(!hasObserver(observer)){
            observerList.add(observer);
        }
    }
    @Override
    public void removeObserver(Observer observer) {
        if(hasObserver(observer)){
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update(temperature, humidity);
        }
    }

    public void parameterChanged(int temperature, int humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}
