package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Booking;
import view.tm.BookingTm;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class BookingFormController {
    public TableView<BookingTm>tblBooking;
    public TableColumn colRoom;
    public TableColumn colName;
    public TableColumn colPhoneNumber;
    public TableColumn colDate;
    public TableColumn colMealsPlan;
    public TableColumn colCheckInOut;
    public TableColumn colAvailability;
    public JFXButton butHome;
    public JFXTextField txtRno;
    public JFXTextField txtName;
    public JFXTextField txtDate;
    public JFXTextField txtMealsPlan;
    public JFXTextField txtCheckInDate;
    public JFXTextField txtCheckout;
    public JFXTextField telephoneNumber;
    public JFXTextField txtAvailability;
    public TableColumn colCheckingDate;
    public AnchorPane BookingPage;
    public Button bookings;

    static ArrayList<Booking> BookingList = new ArrayList();

      public void initialize(){
          colRoom.setCellValueFactory(new PropertyValueFactory<>("Room No"));
          colName.setCellValueFactory(new PropertyValueFactory<>("Name"));
          colPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("Phone Number"));
          colDate.setCellValueFactory(new PropertyValueFactory<>("Date"));
          colMealsPlan.setCellValueFactory(new PropertyValueFactory<>("MealsPlan"));
          colCheckingDate.setCellValueFactory(new PropertyValueFactory<>("CheckingDate"));
          colCheckInOut.setCellValueFactory(new PropertyValueFactory<>("CheckInOut"));
          colAvailability.setCellValueFactory(new PropertyValueFactory<>("Availability"));
      }

    public void opentoHomePage(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) BookingPage.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void movetoName(ActionEvent actionEvent) {
        txtName.requestFocus();
    }

    public void moveToPhoneNumber(ActionEvent actionEvent) {
        telephoneNumber.requestFocus();
    }

    public void moveToDate(ActionEvent actionEvent) {
        txtDate.requestFocus();
    }

    public void moveToMealsPlan(ActionEvent actionEvent) {
        txtMealsPlan.requestFocus();
    }

    public void moveToCheckinDate(ActionEvent actionEvent) {
        txtCheckInDate.requestFocus();
    }

    public void moveToCheckInOut(ActionEvent actionEvent) {
        txtCheckout.requestFocus();
    }

    public void movetoAvailability(ActionEvent actionEvent) {
        txtAvailability.requestFocus();
    }



    public void SaveUpdate(ActionEvent actionEvent) {
        Booking Book= new Booking(txtRno.getText(),txtName.getText(),telephoneNumber.getText(),txtDate.getText(),txtMealsPlan.getText(),txtCheckInDate.getText(),txtCheckout.getText(),txtAvailability.getText());
        txtRno.clear();
        txtName.clear();
        telephoneNumber.clear();
        txtDate.clear();
        txtMealsPlan.clear();
        txtCheckInDate.clear();
        txtCheckout.clear();
        txtAvailability.clear();
    if (BookingList.add(Book)){
            loadAll();
            new Alert(Alert.AlertType.CONFIRMATION,"Saved..", ButtonType.CLOSE).show();
        }else{
            new Alert(Alert.AlertType.WARNING,"Try Again..", ButtonType.CLOSE).show();
        }
    }


    private void loadAll(){
        ObservableList<BookingTm> tmObservableList = FXCollections.observableArrayList();
        for(Booking temp:BookingList
           ) {
            tmObservableList.add(
                    new BookingTm(temp.getRoomnumber(), temp.getName(), temp.getPhonenumber(), temp.getData(), temp.getMealsplan(), temp.getCheckindate(), temp.getCheckinout(), temp.getAvailability())

            );
        }

        tblBooking.setItems(tmObservableList);


    }

    }
