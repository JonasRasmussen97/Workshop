/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.UI;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import workshop.Acquaintance.IBuilding;
import workshop.Acquaintance.IBuildingController;
import workshop.Acquaintance.IBusiness;
import workshop.Acquaintance.ISensor;
import workshop.Acquaintance.IUI;
import workshop.Business.Building;
import workshop.Business.BuildingFacade;
import workshop.Business.Sensor;

/**
 *
 * @author Jonas
 */
public class UIFacade extends Application implements IUI {
    
    private static IBusiness business; 

    /**
     * @param args the command line arguments
     */
           @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("UI.fxml"));
        Parent root = loader.load();
        
        
        UIController controller = loader.getController();
        controller.injectBusiness(business);
        
        
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void injectBusiness(IBusiness _business) {
       business = _business;
    }

    @Override
    public void start() {
       launch();
    }
    }
    

