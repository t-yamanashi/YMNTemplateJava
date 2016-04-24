package ymn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import ymn.debug.Debug;

/**
 * 文字返還クラス
 * @author 山梨智之
 */
public class TextConvert {
    
    /**
     * 変換実行
     * @param templateFile テンプレートファイル名
     */
    public void Convert(String templateFile){
        try {
            byte[] byteText = Files.readAllBytes(Paths.get(templateFile));
            String str = new String(byteText, StandardCharsets.UTF_8);
            Debug.message(str);
        } catch (Exception e) {
            Debug.message(e.getMessage());
        }
       
    }
   
    
}
