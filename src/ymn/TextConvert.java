package ymn;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.MessageFormat;
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
     * @param dataFile データファイル名
     * @return 変換結果
     */
    public String convert(String templateFile, String dataFile, String fmt){
        String templateStr = readTextFile(templateFile, fmt);
        MessageFormat msgFmt = new MessageFormat(templateStr);
        String dataStr = readTextFile(dataFile, fmt);
        StringBuilder sb = new StringBuilder();
        String[] dataLines  = dataStr.split("\n");
        for (String dataLine : dataLines) {
            String[] data  = dataLine.trim().split("\t");
            String convString = msgFmt.format(data);
            sb.append(convString);
        }     
        return sb.toString();
    }
    
    /**
     * ファイル読込
     * @param fileName
     */
    private String readTextFile(String fileName, String fmt) {
        String retString = "";

        try {
            byte[] byteText = Files.readAllBytes(Paths.get(fileName));
            retString = new String(byteText, fmt);
        } catch (Exception e) {
              Debug.message(e.getMessage());
        }
        return retString;
    }

    //</editor-fold>
    
}
