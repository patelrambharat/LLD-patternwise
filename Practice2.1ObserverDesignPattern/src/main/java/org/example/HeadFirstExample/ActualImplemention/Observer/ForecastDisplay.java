package org.example.HeadFirstExample.ActualImplemention.Observer;

import org.example.HeadFirstExample.ActualImplemention.Observable.Observable;

public class ForecastDisplay implements Observer, DisplayElement {
    private Observable observable;
    private double temp;
    private double pressure;
    private double humidity;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.registerObserver(this);
    }

    public void update(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        // Calculate Forecast
        System.out.println("=================================");
        System.out.println("ForecastDisplay Stats -----------");
        System.out.println("Temperature : " + temp);
        System.out.println("Humidity : " + humidity);
        System.out.println("Pressure : " + pressure);
        System.out.println();
    }
}