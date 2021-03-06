package ymn;

import javafx.scene.input.Clipboard;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import ymn.debug.Debug;

/**
 * メイン画面 Controller class
 *
 * @author 山梨智之
 */
public class MainFXMLController implements Initializable {

    //<editor-fold defaultstate="collapsed" desc="フィールド">
    
    /**
     * メインパネル
     */
    @FXML
    private AnchorPane mainPane;

        
    /**
     * コピーボタン
     */
    @FXML
    private Button copyButton;
    
    /**
     * ファイルフォーマットコンボボックス
     */
    @FXML
    private ComboBox<String> fileFormatComboBox;
    
    /**
     * テンプレートファイル名テキストフィールド
     */
    @FXML
    private TextField templateTextField;
    
    /**
     * テンプレートファイル選択ボタン
     */
    @FXML
    private Button templateSelectButton;
    
    /**
     * データファイルファイル名テキストフィールド
     */
    @FXML
    private TextField dataTextField;
    
    /**
     * データファイル選択ボタン
     */
    @FXML
    private Button dataSelectButton;
    
    /**
     * 変換ボタン
     */
    @FXML
    private Button convertButton;
    
    /**
     * 変換結果テキストエリア
     */
    @FXML
    private TextArea convertTextArea;
    //</editor-fold>

    /**
     * ダイアログようにWindowを取得
     * @return 
     */
    private Window getWindow(){
        return mainPane.getScene().getWindow();
    }
    
    //<editor-fold defaultstate="collapsed" desc="イベント">

    /**
     * 初期化
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> ob;
        ob = FXCollections.observableArrayList();
        ob.add("UTF-8");
        ob.add("Shift-JIS");
        fileFormatComboBox.setItems(ob);
        fileFormatComboBox.setValue("UTF-8");
    }    
    
    /**
     * ファイル選択ボタン
     */
    @FXML
    private void selectFileAction(ActionEvent event) {
        Button bt = (Button)event.getSource();
        FileChooser fc = new FileChooser();
        // showOpenDialogの引数未確認
        File fileP = fc.showOpenDialog(getWindow());
        String fineName = fileP.getAbsolutePath();
        
        if (bt == templateSelectButton){
            templateTextField.setText(fineName);
        }else if(bt == dataSelectButton){
            dataTextField.setText(fineName);
        }
    }

    /**
     * 変換ボタン
     * @param event 
     */
    @FXML
    private void convertButtonAction(ActionEvent event) {
        TextConvert tc = new TextConvert();
        String convertStr = tc.convert(templateTextField.getText(), dataTextField.getText(), fileFormatComboBox.getValue());
        convertTextArea.setText(convertStr);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("変換完了");
        alert.show();
    }

    /**
     * コピーボタン
     * @param event 
     */
    @FXML
    private void copyButtonAction(ActionEvent event) {
        final Clipboard clipboard = Clipboard.getSystemClipboard();
        final ClipboardContent content = new ClipboardContent();
        content.putString(convertTextArea.getText());
        clipboard.setContent(content);
    }
    
    /**
     * ドラッグ中
     * @param event 
     */
    @FXML
    private void selectFileDragOver(DragEvent event) {
        TextField tx = (TextField)event.getSource();
        Dragboard board = event.getDragboard();
        if (board.hasFiles()) {
            event.acceptTransferModes(TransferMode.COPY);
        }
    }

    /**
     * ドラッグ完了
     * @param event 
     */
    @FXML
    private void selectFileDragDroped(DragEvent event) {
        TextField tx = (TextField)event.getSource();
        Dragboard board = event.getDragboard();
        if (!board.hasFiles()) {
            event.setDropCompleted(false);
            return;
        }
        event.setDropCompleted(true);
        File file = board.getFiles().get(0);
        String fileName = file.getPath();
        tx.setText(fileName);
    }
    
    //</editor-fold>
    
}
