/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.Business;

import java.util.ArrayList;
import java.util.List;
import workshop.Acquaintance.IBuilding;
import workshop.Acquaintance.IBuildingController;
import workshop.Acquaintance.IBusiness;
import workshop.Acquaintance.ISensor;

/**
 *
 * @author Jonas
 */
public class BuildingFacade implements IBusiness {
    
    private List<IBuilding> buildingList = new ArrayList();
    
    
    public BuildingFacade() {
        
    }
    
    public IBuilding addBuilding(String name, String placement) {
        IBuilding newBuilding = new Building(name, placement);
        buildingList.add(newBuilding);
        return newBuilding;
    }
    
    public void removeBuilding(Building building) {
        buildingList.remove(building);
    }
    
    public List getAllBuildings() {
        return this.buildingList;
    }

    @Override
    public List<IBuilding> getBuildings() {
      return this.buildingList;
    }
    
    public void removeBuilding(IBuilding building) {
        this.buildingList.remove(building);
    }

    
    
    
    
    
}
