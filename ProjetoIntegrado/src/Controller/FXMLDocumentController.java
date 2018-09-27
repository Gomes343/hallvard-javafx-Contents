/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author a1700677
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    private Stage primaryStage;
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
  Node node=(Node) event.getSource();
  Stage stage=(Stage) node.getScene().getWindow();
  Parent root = FXMLLoader.load(getClass().getResource("/View/InicioFXML.fxml"));/* Exception */
  Scene scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
  
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.primaryStage = primaryStage;
    }    
    
}
