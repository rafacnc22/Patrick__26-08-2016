/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.Empresas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Rafael
 */
public class EmpresasController implements Initializable {

    @FXML
    private Button idcadastroempresa;
     @FXML
    private Button idcancelarempresa;
    @FXML
    private TextField idnomeempresa;
    @FXML
    private TextField idcnpj;
    @FXML
    private TextField idcpfempresa;
    @FXML
    private TextField idendereçoempresa;
    @FXML
    private TextField idnumeroempresa;
    @FXML
    private TextField idcidadeempresa;
    @FXML
    private TextField idestadoempresa;

    String estadoempresa;
    String cidadeempresa;
    String numeroempresa;
    String endereçoempresa;
    String cpfempresa;
    String cnpj;
    String nomeempresa;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        idcadastroempresa.setOnMouseClicked((MouseEvent e) -> {
            EmpresasController e1 = new EmpresasController();
            e1.nomeempresa = idnomeempresa.getText();
            e1.cnpj = idcnpj.getText();
            e1.cpfempresa = idcpfempresa.getText();
            e1.endereçoempresa = idendereçoempresa.getText();
            e1.numeroempresa = idnumeroempresa.getText();
            e1.cidadeempresa = idcidadeempresa.getText();
            e1.estadoempresa = idestadoempresa.getText();
            BD.empresa.add(e1);
            Empresas.getStage().close();
            Alert alerta1 = new Alert(Alert.AlertType.INFORMATION);
            alerta1.setTitle("Cadastro Concluido");
            alerta1.setHeaderText("Cadastro Concluido");
            alerta1.show();
        });
        idcancelarempresa.setOnMouseClicked((MouseEvent e) -> {
            Empresas.getStage().close();
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Cadastro Cancelado");
            alerta.setHeaderText("Cadastro Cancelado");
            alerta.show();
        });
    }

}
