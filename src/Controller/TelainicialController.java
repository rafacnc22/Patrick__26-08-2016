/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.Empresas;
import Main.Pessoas;
import Main.Patrick__26082016;
import Main.Telainicial;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Rafael
 */
public class TelainicialController implements Initializable {

    @FXML
    private Button idcadastrarpessoas;
    @FXML
    private Button idtelacadastroempresa;
    @FXML
    private Button idlistarpessoa;
    @FXML
    private Button idlistarempresa;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        idtelacadastroempresa.setOnMouseClicked((MouseEvent s) -> {
            Empresas tela1 = new Empresas();
            try {
                tela1.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelainicialController.class.getName()).log(Level.SEVERE, null, ex);
            }

        });
        idcadastrarpessoas.setOnMouseClicked((MouseEvent e) -> {
            Pessoas tela = new Pessoas();
            try {
                tela.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelainicialController.class.getName()).log(Level.SEVERE, null, ex);
            }

        });
        idlistarpessoa.setOnMouseClicked((MouseEvent e) -> {
            for (int i = 0; i < BD.pessoa.size(); i++) {
                System.out.println("########Lista de Pessoas########");
                System.out.println("Nome " + BD.pessoa.get(i).nomepessoa);
                System.out.println("Sobrenome " + BD.pessoa.get(i).sobrenome);
                System.out.println("Email " + BD.pessoa.get(i).email);
                System.out.println("Endereço " + BD.pessoa.get(i).endereçopessoa);
                System.out.println("CPF " + BD.pessoa.get(i).cpfpessoa);
                System.out.println("RG " + BD.pessoa.get(i).rg);
                System.out.println("Cidade " + BD.pessoa.get(i).cidadepessoa);
                System.out.println("Estado " + BD.pessoa.get(i).estadopessoa);
                System.out.println("Numero de indereço " + BD.pessoa.get(i).numeropessoa);
            }
        });
        idlistarempresa.setOnMouseClicked((MouseEvent e) -> {
            for (int i = 0; i < BD.empresa.size(); i++) {
                System.out.println("########Lista de Empresas########");
                System.out.println("Nome " + BD.empresa.get(i).nomeempresa);
                System.out.println("CNPJ " + BD.empresa.get(i).cnpj);
                System.out.println("Endereço " + BD.empresa.get(i).endereçoempresa);
                System.out.println("CPF " + BD.empresa.get(i).cpfempresa);
                System.out.println("Cidade " + BD.empresa.get(i).cidadeempresa);
                System.out.println("Estado " + BD.empresa.get(i).estadoempresa);
                System.out.println("Numero de indereço " + BD.empresa.get(i).numeroempresa);
            }
        });
        
    }

}
