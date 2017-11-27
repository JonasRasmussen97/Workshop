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
public interface ISensor {
    public void setTemperature(double temperature);
    public double getTemperature();
    public void setco2Level(double co2Level);
    public double getco2Level();
    public List<Double> getTemperatureHistory();
    public List<Double> getCo2LevelHistory();
    public String getName();
}
