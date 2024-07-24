package behavioural.observer.observer;

import behavioural.observer.obserable.Observable;

public class AverageTemperatureDisplay implements Observer{

    private int sumOfTemperature;
    private int totalTemperature;

    public AverageTemperatureDisplay(Observable observable){
        sumOfTemperature = 0;
        totalTemperature = 0;
        observable.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity) {
        sumOfTemperature += temperature;
        totalTemperature++;
        display();
    }

    public void display(){
        System.out.println("Average temperature is- " + sumOfTemperature/totalTemperature);
    }
}
