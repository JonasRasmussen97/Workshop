/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.Business;

import java.util.ArrayList;
import java.util.List;
import workshop.Acquaintance.ISensor;

/**
 *
 * @author Jonas
 */
public class Sensor implements ISensor {
    
    private double temperature;
    private double co2Level;
    private List<Double> temperatureHistory = new ArrayList();
    private List<Double> co2LevelHistory = new ArrayList();
    private String name;
    
    public Sensor(String name) {
        this.name = name;
    }
    
    public void setTemperature(double temperature) {
        this.temperature = temperature;
        temperatureHistory.add(temperature);
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getTemperature() {
        return temperature;
    }
    
    public void setco2Level(double co2Level) {
        this.co2Level = co2Level;
        co2LevelHistory.add(co2Level);
    }
    
    public double getco2Level() {
        return co2Level;
    }
    
   

    @Override
    public List<Double> getTemperatureHistory() {
      return temperatureHistory;  
    }

    @Override
    public List<Double> getCo2LevelHistory() {
       return co2LevelHistory;
    }
      
    
    
    public String toString() {
        return this.name;
    }
    
}
