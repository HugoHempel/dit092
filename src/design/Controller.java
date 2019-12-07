package design;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

// TODO: FIX ALL ENCAPSULATION

public class Controller {

    @FXML
    private javafx.scene.control.Button exitApp;


    @FXML
    private ChoiceBox calculatorBox;
    @FXML
    ObservableList<String> calculatorBoxList = FXCollections.observableArrayList("Planned Value (PV)", "Earned Value (EV)", "Actual Cost (AC)", "Budget at Completion(BAC)", "Schedule Variance (SV)", "Schedule Performance Index (SPI)", "Cost Variance (CV)", "Cost Performance Index (CPI)");

    public void search(){
        System.out.println("lmao");

    }

    @FXML
    public void viewMember(ActionEvent event) throws IOException {

        Parent viewMemberParent = FXMLLoader.load(getClass().getResource("userInfo.fxml"));
        Scene viewMemberScene = new Scene(viewMemberParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(viewMemberScene);
        window.show();
    }

    public void addMember(){

    }

    @FXML
    public void projectOverview(ActionEvent event) throws IOException{

        Parent projectMemberParent = FXMLLoader.load(getClass().getResource("projectOverview.fxml"));
        Scene projectMemberScene = new Scene(projectMemberParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(projectMemberScene);
        window.show();

    }

    @FXML
    public void displayValue(){

    }

    // This code is for all back buttons that go back to the dashboard.
    @FXML
    public void back(ActionEvent event) throws IOException {

        Parent backMemberParent = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
        Scene backMemberScene = new Scene(backMemberParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(backMemberScene);
        window.show();
    }

    public void exit(){
        Stage stage = (Stage) exitApp.getScene().getWindow();
        // do what you have to do
        stage.close();
    }

}
