/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.UI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import workshop.Acquaintance.IBuilding;
import workshop.Acquaintance.IBusiness;

/**
 * FXML Controller class
 *
 * @author Jonas
 */
public class UIController implements Initializable {
    
    

    @FXML
    private ListView buildingList;
    
    @FXML
    private TextField buildingName;
    @FXML
    private TextField buildingAddress;
    
    private IBusiness business;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    
        
      
    }    

    @FXML
    private void createBuilding(ActionEvent event) {
        IBuilding newBuilding =  business.addBuilding(buildingName.getText(), buildingAddress.getText());
       
        buildingAddress.clear();
        buildingName.clear();
        

    }
    
    public void injectBusiness(IBusiness _business) {
        business = _business;
    }
    
    
}
