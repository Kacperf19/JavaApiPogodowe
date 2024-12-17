package com.example.weather_app.model;

import com.sun.tools.javac.Main;
import lombok.Setter;

import java.util.List;

@Setter
public class WeatherResponse {


    public String getName() {
        return name;
    }

    public Wind getWind() {
        return wind;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public Main getMain() {
        return main;
    }

    public Sys getSys() {
        return sys;
    }

    private String name;
    private Sys sys;
    private List<Weather> weather;
    private Main main;
    private Wind wind;



    public static class Sys{
        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        private String country;

    }

    public static class Weather{

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        private int id;
        private String description;
    }
    public static class Main{
        public double temp ;

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public double getTemp() {
            double roundedTemperature = Math.round(temp * 10.0) / 10.0;
            return roundedTemperature;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        private int humidity ;
    }
    public static class Wind{
        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        private double speed;

    }
}
