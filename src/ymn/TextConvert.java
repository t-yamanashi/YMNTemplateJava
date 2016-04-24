package ymn;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import ymn.debug.Debug;

/**
 * 文字返還クラス
 * @author 山梨智之
 */
public class TextConvert {
        
    //<editor-fold defaultstate="collapsed" desc="メソッド">

    /**
     * 変換実行
     * @param templateFile テンプレートファイル名
     * @return 変換結果
     */
    public String convert(String templateFile){
        String str = readTextFile(templateFile);
        return str;
    }

    /**
     * ファイル読込
     * @param fileName
     */
    private String readTextFile(String fileName) {
        String retString = "";
        try {
            byte[] byteText = Files.readAllBytes(Paths.get(fileName));
            retString = new String(byteText, StandardCharsets.UTF_8);
        } catch (Exception e) {
              Debug.message(e.getMessage());
        }
        return retString;
    }

    //</editor-fold>
    
}
