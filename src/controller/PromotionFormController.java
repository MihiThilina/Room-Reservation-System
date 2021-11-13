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
import model.Booking;
import model.Promotion;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class PromotionFormController {
    public AnchorPane PramotionPlan;
    public TableColumn colMealPlan;
    public TableView tblPromotion;
    public TableColumn colType;
    public TableColumn colAddNew;
    public TableColumn colPrice;
    public TableColumn colDate;
    public TableColumn colDelete;
    public JFXTextField txtMealPlan;
    public JFXTextField txtType;
    public JFXTextField txtAddNew;
    public JFXTextField txtPrice;
    public JFXTextField txtDate;
    public JFXButton butHome;

    static ArrayList<Promotion> PromotionList = new ArrayList();
    public JFXTextField txtModifying;

    public void movetoType(ActionEvent actionEvent) {
        txtType.requestFocus();
    }

    public void movetoAddnew(ActionEvent actionEvent) {
        txtAddNew.requestFocus();
    }

    public void movetoPrice(ActionEvent actionEvent) {
        txtPrice.requestFocus();
    }



    public void BackToHome(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)PramotionPlan.getScene().getWindow();
        window.setScene(new Scene(load));
    }



    public void SaveUpdate(ActionEvent actionEvent) {
        Promotion Promotionlist = new Promotion(txtMealPlan.getText(),txtType.getText(),txtAddNew.getText(),txtPrice.getText(),txtDate.getText());
        txtMealPlan.clear();
        txtType.clear();
        txtAddNew.clear();
        txtPrice.clear();
        txtDate.clear();
        if (PromotionList.add(Promotionlist)){
            new Alert(Alert.AlertType.CONFIRMATION,"Saved..", ButtonType.CLOSE).show();
        }else{
            new Alert(Alert.AlertType.WARNING,"Try Again..", ButtonType.CLOSE).show();
        }
      }
    public void movetoModifyPlan(ActionEvent actionEvent) {
        txtModifying.requestFocus();
    }
}
