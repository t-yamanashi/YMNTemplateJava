/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ymn;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import ymn.debug.Debug;

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

    @FXML
    private void selectFileAction(ActionEvent event) {
        FileChooser fc = new FileChooser();
        // showOpenDialogの引数未確認
        File fileP = fc.showOpenDialog(null);
        templateTextField.setText(fileP.getAbsolutePath());
        
    }

    @FXML
    private void convertButtonAction(ActionEvent event) {
        Button bt = (Button)event.getSource();
        Debug.message(bt.getId());
    }

    @FXML
    private void copyButtonAction(ActionEvent event) {
        Button bt = (Button)event.getSource();
        Debug.message(bt.getId());
    }
    
}
