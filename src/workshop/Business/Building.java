/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.Business;

import java.util.ArrayList;
import java.util.List;
import workshop.Acquaintance.IBuilding;
import workshop.Acquaintance.ISensor;

/**
 *
 * @author Jonas
 */
public class Building implements IBuilding {
    private String name; 
    private String placement;
    private int SensorCount;
    private List<ISensor> sensors = new ArrayList(); 
    
    public Building (String name, String placement) {
       this.name = name;
       this.placement = placement;
       
    }
    
    public void addSensor(ISensor sensor) {
        if(sensors.contains(sensor)) {
            System.out.println("Sensor already exists.");
        } else {
        sensors.add(sensor);
    }
    }
    
    public void removeSensor(ISensor sensor) {
        if(sensors.contains(sensor)) {
        sensors.remove(sensor);
        } else {
            System.out.println("Sensor doesn't exist.");
        } 
    }
    
    public List getSensorList() {
        return this.sensors;
    }
    
    public void getMeasurements() {
        int i = 0;
        for (ISensor sensor : sensors) {
            i++;
            System.out.println("Sensor " + i);
            for (Double d : sensor.getTemperatureHistory()) {
                System.out.println(d);  
            }
        }
       
    }
    
    
   public String toString() {
       return this.name + ", " + this.placement;
   }


    
}
