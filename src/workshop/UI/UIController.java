/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.UI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import workshop.Acquaintance.IBuilding;
import workshop.Acquaintance.IBusiness;
import workshop.Acquaintance.ISensor;

/**
 * FXML Controller class
 *
 * @author Jonas
 */
public class UIController implements Initializable {

    @FXML
    private ListView<IBuilding> buildingList;

    @FXML
    private TextField buildingName;
    @FXML
    private TextField buildingAddress;

    private ObservableList<IBuilding> buildings;
    private ObservableList<ISensor> sensorObsList;

    private IBusiness business;
    @FXML
    private ListView<ISensor> sensorList;
    @FXML
    private MenuItem menu1;
    @FXML
    private TextField co2;
    @FXML
    private TextField temp;
    @FXML
    private ComboBox<IBuilding> Buildings;
    @FXML
    private TextField sensorName;
    @FXML
    private ComboBox<IBuilding> sensorToList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        buildings = FXCollections.observableArrayList();
        sensorObsList = FXCollections.observableArrayList();
        

    }

    @FXML
    private void createBuilding(ActionEvent event) {
        IBuilding newBuilding = business.addBuilding(buildingName.getText(), buildingAddress.getText());

        buildingAddress.clear();
        buildingName.clear();

        buildings.add(newBuilding);

        Buildings.setItems(buildings);
        sensorToList.setItems(buildings);
        buildingList.setItems(buildings);

    }

    public void injectBusiness(IBusiness _business) {
        business = _business;
    }

    @FXML
    private void deleteBuilding(ActionEvent event) {
        //Removing from ObservableList

        this.business.removeBuilding(buildingList.getSelectionModel().getSelectedItem());
        buildingList.getItems().remove(buildingList.getSelectionModel().getSelectedItem());

    }

    @FXML
    private void removeSensor(ActionEvent event) {
    }

    @FXML
    private void createSensor(ActionEvent event) {

        ISensor newSensor = Buildings.getValue().addSensor(sensorName.getText());

        sensorObsList.add(newSensor);

        sensorName.clear();

    }

    @FXML
    private void Menu1(ActionEvent event) {

    }

    @FXML
    private void menu2(ActionEvent event) {

    }

    @FXML
    private void chooseBuilding(ActionEvent event) {
    }

    @FXML
    private void saveMeasurement(ActionEvent event) {

    }

    @FXML
    private void sensorToList(ActionEvent event) {

        sensorObsList = FXCollections.observableArrayList(sensorToList.getValue().getSensorList());
       sensorList.setItems(sensorObsList);
    }

}
