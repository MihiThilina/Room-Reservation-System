package controller;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Customers;
import view.tm.CustomerTm;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class CusDetailsFormController {
    public AnchorPane CusDetailsForm;
    public TableView tblCusDetails;
    public TableColumn colNic;
    public TableColumn colName;
    public TableColumn colPhoneNo;
    public TableColumn colEmail;
    public TableColumn colAddress;
    public TableColumn colRoomNo;
    public TableColumn colCheckingDate;
    public TableColumn colCheckout;
    public JFXButton butBack;

    static ArrayList<Customers> CustomerList = new ArrayList();

    public void initialize(){
        tblCusDetails.setItems(FXCollections.observableArrayList(CustomerDetailsController.CustomerList));
        colNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colPhoneNo.setCellValueFactory(new PropertyValueFactory<>("phone no"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colRoomNo.setCellValueFactory(new PropertyValueFactory<>("roomnumber"));
        colCheckingDate.setCellValueFactory(new PropertyValueFactory<>("checkdate"));
        colCheckout.setCellValueFactory(new PropertyValueFactory<>("checkout"));
        loadAlCustomer();
}
    public void Backto(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/CustomerDetails.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) CusDetailsForm.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    private void loadAlCustomer() {
        ObservableList<CustomerTm> tmObservableList = FXCollections.observableArrayList();
        for (Customers temp:CustomerList){
            tmObservableList.add(new CustomerTm(temp.getNic(),temp.getName(),temp.getCnumber(),temp.getMail(),temp.getAddress(),temp.getRoomno(),temp.getCheckdate(),temp.getCheckout())
            );
        }
        tblCusDetails.setItems(tmObservableList);
    }

}
