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
    private Sensor sensor;
    
    public Building (String name, String placement) {
       this.name = name;
       this.placement = placement;
       
    }
    

    
    public ISensor addSensor(String name) {
        ISensor sensor = new Sensor(name);
        sensors.add(sensor);
        return sensor;
    
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
    
    public ISensor getSensor(String name) {
        for (ISensor sen : this.sensors) {
            if ( name.equals(sen.getName())) {
                return sen;
            }
        }
        return null;
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
    
    
    
    public String getName() {
        return this.name;
    }
    
    
   public String toString() {
       return this.name + ", " + this.placement;
   }




    
}
