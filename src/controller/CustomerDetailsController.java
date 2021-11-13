package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Customers;
import view.tm.CustomerTm;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class CustomerDetailsController {

    public JFXTextField txtNic;
    public JFXTextField txtName;
    public JFXTextField txtCNumber;
    public JFXTextField txtEmail;
    public JFXTextField txtAddress;
    public JFXTextField txtRoomNumber;
    public JFXTextField txtCheckmate;
    public JFXTextField txtCheckout;
    public JFXButton butHome;
    public JFXButton botnet;
    public JFXButton ButSave;
    public AnchorPane CusDetails;

    static ArrayList<Customers> CustomerList = new ArrayList();

    public void movetoName(ActionEvent actionEvent) {
        txtName.requestFocus();
    }

    public void movetoConumber(ActionEvent actionEvent) {
        txtCNumber.requestFocus();
    }

    public void movetoEmail(ActionEvent actionEvent) {
        txtEmail.requestFocus();
    }

    public void movetoAddres(ActionEvent actionEvent) {
        txtAddress.requestFocus();
    }

    public void movetoRoomNumber(ActionEvent actionEvent) {
        txtRoomNumber.requestFocus();
    }

    public void movetoCheckinDate(ActionEvent actionEvent) {
        txtCheckmate.requestFocus();
    }

    public void movetoCheckInout(ActionEvent actionEvent) {
        txtCheckout.requestFocus();
    }

    public void moveToHome(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) CusDetails.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void moveToNext(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/CusDetailsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) CusDetails.getScene().getWindow();
        window.setScene(new Scene(load));
    }


    public void saveUpdate(ActionEvent actionEvent) {
        Customers Customer = new Customers(txtNic.getText(), txtName.getText(), txtCNumber.getText(), txtEmail.getText(), txtAddress.getText(), txtRoomNumber.getText(), txtCheckmate.getText(), txtCheckout.getText());
        txtNic.clear();
        txtName.clear();
        txtCNumber.clear();
        txtCNumber.clear();
        txtEmail.clear();
        txtAddress.clear();
        txtRoomNumber.clear();
        txtCheckmate.clear();
        txtCheckout.clear();
        if (CustomerList.add(Customer)) {

            loadAlCustomer();
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
        } else {

            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }
    }

    private void loadAlCustomer() {
        ObservableList<CustomerTm> tmObservableList = FXCollections.observableArrayList();
        for (Customers temp : CustomerList) {
            tmObservableList.add(new CustomerTm(temp.getNic(),temp.getName(),temp.getCnumber(),temp.getMail(),temp.getAddress(),temp.getRoomno(),temp.getCheckdate(),temp.getCheckout())

            );
        }
    }
}

