/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.Patrick__26082016;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import Main.Telainicial;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

/**
 *
 * @author Rafael
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button idbotaosair;
    @FXML
    private TextField idusuario;
    @FXML
    private Button identrar;
    @FXML
    private PasswordField idsenha;

    @FXML
    private void handleButtonAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        idbotaosair.setOnMouseClicked((MouseEvent e) -> {
            Patrick__26082016.getStage().close();

        });
        identrar.setOnMouseClicked((MouseEvent e) -> {
            String usuario = idusuario.getText();
            String senha = idsenha.getText();
            if (usuario.equals("user123") && senha.equals("user123")) {
                Telainicial tela = new Telainicial();
                try {
                    tela.start(new Stage());
                    Patrick__26082016.getStage().close();
                } catch (Exception ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else{
                  Alert alerta = new Alert(AlertType.ERROR);
                  alerta.setTitle("erro");
                  alerta.setHeaderText("Login ou senha invalidos");
                  alerta.show();
             
            }
        });

    }

}
