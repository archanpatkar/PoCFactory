package com.archanpatkar.Props;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropLoader 
{
    public static Properties getPFile(String Path)  {
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream(Path));
            return prop;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PropLoader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PropLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
