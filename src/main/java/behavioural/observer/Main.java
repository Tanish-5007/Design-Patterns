package behavioural.observer;

import behavioural.observer.obserable.WeatherObservable;
import behavioural.observer.observer.AverageTemperatureDisplay;
import behavioural.observer.observer.CurrentWeatherConditionDisplay;
import behavioural.observer.observer.Observer;

public class Main {

    public static void main(String[] args){
        WeatherObservable observable = new WeatherObservable();

        Observer observer1 = new CurrentWeatherConditionDisplay(observable);
        Observer observer2 = new AverageTemperatureDisplay(observable);

        observable.parameterChanged(20, 10);
        observable.parameterChanged(40, 30);
    }

}
