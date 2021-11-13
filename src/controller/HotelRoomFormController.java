package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Rooms;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class HotelRoomFormController {
    public AnchorPane RoomsForm;
    public JFXButton butHome;
    public TableView tblRoomDetails;
    public TableColumn colRomano;
    public TableColumn coltype;
    public TableColumn colcost;
    public TableColumn colmealplan;
    public TableColumn colcheckindate;
    public TableColumn checkout;
    public TableColumn colAvailability;

    public JFXTextField txtRoomNo;
    public JFXTextField txtType;
    public JFXTextField txtCost;
    public JFXTextField txtMealplan;
    public JFXTextField txtChecking;
    public JFXTextField txtCheckout;
    public JFXTextField txtAvailability;

    static ArrayList<Rooms> RoomsList = new ArrayList();
    public TableColumn colAddRoom;
    public TableColumn colModifyRoom;
    public TableColumn coldelete;
    public JFXTextField txtAddNewRoom;
    public JFXTextField txtModifyRoom;


    public void movetoRoomtype(ActionEvent actionEvent) {
        txtType.requestFocus();
    }

    public void movetoCost(ActionEvent actionEvent) {
        txtCost.requestFocus();
    }

    public void movetoMealPaln(ActionEvent actionEvent) {
        txtMealplan.requestFocus();
    }

    public void movetoCheckindates(ActionEvent actionEvent) {
        txtChecking.requestFocus();
    }

    public void movetoCheckout(ActionEvent actionEvent) {
        txtCheckout.requestFocus();
    }



    public void gotoHome(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) RoomsForm.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void SaveUpdate(ActionEvent actionEvent) {
        Rooms Room = new Rooms(txtRoomNo.getText(),txtType.getText(),txtCost.getText(),txtMealplan.getText(),txtChecking.getText(),txtCheckout.getText(),txtAvailability.getText());
        txtRoomNo.clear();
        txtType.clear();
        txtCost.clear();
        txtMealplan.clear();
        txtChecking.clear();
        txtCheckout.clear();
       txtAvailability.clear();
        if (RoomsList.add(Room)){

            new Alert(Alert.AlertType.CONFIRMATION,"Saved..", ButtonType.CLOSE).show();
        }else{

            new Alert(Alert.AlertType.WARNING,"Try Again..", ButtonType.CLOSE).show();
        }
    }

    public void moveToModifyRoom(ActionEvent actionEvent) {
        txtModifyRoom.requestFocus();
    }

    public void movetoAddNewRoom(ActionEvent actionEvent) {
        txtAddNewRoom.requestFocus();
    }

    public void moveToAvailability(ActionEvent actionEvent) {
        txtAvailability.requestFocus();
    }
}
