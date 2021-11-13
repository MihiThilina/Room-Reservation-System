package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class HomePageFormController {
    public JFXButton booking;
    public JFXButton PrmtnsDetails;
    public JFXButton rmsDetails;
    public JFXButton cusDetails;
    public AnchorPane HmePage;

    public void openBooking(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/BookingForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) HmePage.getScene().getWindow();
        window.setScene(new Scene(load));

    }

    public void openPromotions(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/PromotionForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) HmePage.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openRoomDetails(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HotelRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) HmePage.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void opencusDetails(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/CustomerDetails.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) HmePage.getScene().getWindow();
        window.setScene(new Scene(load));

    }

    public void Logout(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) HmePage.getScene().getWindow();
        window.setScene(new Scene(load));

    }
}
