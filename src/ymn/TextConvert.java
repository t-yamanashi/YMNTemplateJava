/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ymn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import ymn.debug.Debug;

/**
 *
 * @author user
 */
public class TextConvert {
    
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
