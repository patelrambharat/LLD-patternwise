package org.example.HeadFirstExample.ActualImplemention;

import org.example.HeadFirstExample.ActualImplemention.Observable.WeatherData;
import org.example.HeadFirstExample.ActualImplemention.Observer.CurrentConditionsDisplay;
import org.example.HeadFirstExample.ActualImplemention.Observer.ForecastDisplay;
import org.example.HeadFirstExample.ActualImplemention.Observer.StatisticsDisplay;

public class WeatherDataRunner {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(27.6, 10.0, 8.9);

        // Registering Statistics Display
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        // Remove Forecast Display
        weatherData.removeObserver(forecastDisplay);

        // Measurements changed
        weatherData.setMeasurements(31.2, 9.5, 11.2);
    }
}