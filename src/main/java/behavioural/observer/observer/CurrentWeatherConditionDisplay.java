package behavioural.observer.observer;

import behavioural.observer.obserable.Observable;

public class CurrentWeatherConditionDisplay implements Observer{

    private int temperature;
    private int humidity;

    public CurrentWeatherConditionDisplay(Observable observable){
        observable.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    private void display(){
        System.out.println("Current weather condition: temperature- " + temperature + " Humidity- "+ humidity);
    }
}
