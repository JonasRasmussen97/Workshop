/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.Acquaintance;

import java.util.List;


/**
 *
 * @author Jonas
 */
public interface IBuilding {
    public void addSensor(ISensor sensor);
    public void removeSensor(ISensor sensor);
    public List getSensorList();
}
