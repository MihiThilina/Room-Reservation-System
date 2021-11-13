package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class IncomeReportFormController {
    public Button butHome;
    public AnchorPane AnnualReport;
    public JFXTextField textDate;
    public JFXTextField txtCusName;
    public JFXTextField txtIncome;
    public JFXTextField txtMail;
    public JFXTextField txtAincome;


    public void BackToHome(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) AnnualReport.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void movetoCusName(ActionEvent actionEvent) {
        txtCusName.requestFocus();
    }

    public void moveToMaill(ActionEvent actionEvent) {
        txtMail.requestFocus();
    }

    public void MoveToAIncome(ActionEvent actionEvent) {
        txtAincome.requestFocus();
    }

    public void MoveToMIncome(ActionEvent actionEvent) {
        txtIncome.requestFocus();
    }
}
