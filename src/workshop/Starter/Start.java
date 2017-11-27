/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.Starter;

import workshop.Acquaintance.IBusiness;
import workshop.Acquaintance.IUI;
import workshop.Business.BuildingFacade;
import workshop.UI.UIFacade;


/**
 *
 * @author Jonas
 */
public class Start {
    
    public static void main(String[] args) {
        IBusiness building = new BuildingFacade();
        IUI UI = new UIFacade(); 
        UI.injectBusiness(building);
        UI.start();
        
    }
}
