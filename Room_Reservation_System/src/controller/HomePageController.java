package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {
    public Button btnAdmin;
    public Button btnReceipt;

    public void AdminOnActiojnh(ActionEvent actionEvent) throws IOException {
        Stage primaryStage=new Stage();
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LogInAdmin.fxml"))));
        primaryStage.show();
    }

    public void ReceptionistOnAction(ActionEvent actionEvent) throws IOException {
        Stage primaryStage=new Stage();
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LogInReceptionist.fxml"))));
        primaryStage.show();
    }
}
