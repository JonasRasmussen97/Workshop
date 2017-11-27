/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.Acquaintance;

import java.util.List;
import workshop.Business.Building;

/**
 *
 * @author Jonas
 */
public interface IBuildingController {
    public void addBuilding(Building building);
    public void removeBuilding(Building building);
    public List getAllBuildings();
}
