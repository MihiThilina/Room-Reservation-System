package controller;

import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Vehicle;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class LoginFormController {
    public TextField txtPassword;
    public TextField txtUName;
    public JFXButton SignIn;
    public AnchorPane SignFormcontext;
    public JFXButton butConfirm;
    public javafx.scene.control.CheckBox CheckBox;
    public JFXPasswordField passwordHidden;
    public JFXRadioButton password;
    public JFXButton SignIn1;
    public TextField txtUName1;
    public JFXButton butLodgingAdmin;
    public JFXComboBox cmbVehicle;
    public JFXTextField txtVehicle;
    private String content;


    //int[] xr=new int[5];

    static ArrayList<Vehicle> roomList = new ArrayList();







    public void moveTopassword(ActionEvent actionEvent) {
        txtPassword.requestFocus();

    }

    public void OpentoMenu(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) SignFormcontext.getScene().getWindow();
        window.setScene(new Scene(load));

    }


    public void PasswordCheck(ActionEvent actionEvent) {

    }

    public void showpasswor(ActionEvent actionEvent) {
        if(CheckBox.isSelected()){
            txtPassword.setText(passwordHidden.getText());
            txtPassword.setVisible(true);
            txtPassword.setVisible(true);
            return;
        }
        passwordHidden.setText(txtPassword.getText());
        passwordHidden.setVisible(true);
        txtPassword.setVisible(true);

    }

    public void OpentoAnnualReport(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/IncomeReportForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) SignFormcontext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void showType(ActionEvent actionEvent) {

    }
}


