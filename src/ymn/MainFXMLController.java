/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ymn;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author user
 */
public class MainFXMLController implements Initializable {

    @FXML
    private Button copyButton;
    @FXML
    private AnchorPane fileFormatComboBox;
    @FXML
    private TextField templateTextField;
    @FXML
    private Button templateSelectButton;
    @FXML
    private TextField dataTextField;
    @FXML
    private Button dataSelectButton;
    @FXML
    private Button convertButton;
    @FXML
    private TextArea convertTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
