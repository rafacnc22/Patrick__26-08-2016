/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.Pessoas;
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
public class PessoasController implements Initializable {

    @FXML
    private Button cadastropessoa;
    @FXML
    private Button idcancelarpessoa;
    @FXML
    private TextField idnomepessoa;
    @FXML
    private TextField idsobrenome;
    @FXML
    private TextField idrg;
    @FXML
    private TextField idcpfpessoa;
    @FXML
    private TextField idemail;
    @FXML
    private TextField idendereçopessoa;
    @FXML
    private TextField numeroendrepessoa;
    @FXML
    private TextField idcidadepessoa;
    @FXML
    private TextField idestadopessoa;

    String estadopessoa;
    String cidadepessoa;
    String numeropessoa;
    String endereçopessoa;
    String email;
    String cpfpessoa;
    String rg;
    String sobrenome;
    String nomepessoa;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cadastropessoa.setOnMouseClicked((MouseEvent e) -> {
            PessoasController p = new PessoasController();
            p.nomepessoa = idnomepessoa.getText();
            p.sobrenome = idsobrenome.getText();
            p.rg = idrg.getText();
            p.cpfpessoa = idcpfpessoa.getText();
            p.email = idemail.getText();
            p.endereçopessoa = idendereçopessoa.getText();
            p.numeropessoa = numeroendrepessoa.getText();
            p.cidadepessoa = idcidadepessoa.getText();
            p.estadopessoa = idestadopessoa.getText();
            BD.pessoa.add(p);
            Pessoas.getStage().close();
            Alert alerta1 = new Alert(Alert.AlertType.INFORMATION);
            alerta1.setTitle("Cadastro Concluido");
            alerta1.setHeaderText("Cadastro Concluido");
            alerta1.show();
        });
        idcancelarpessoa.setOnMouseClicked((MouseEvent e) -> {
            Pessoas.getStage().close();
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Cadastro Cancelado");
            alerta.setHeaderText("Cadastro Cancelado");
            alerta.show();
        });
    }

}
