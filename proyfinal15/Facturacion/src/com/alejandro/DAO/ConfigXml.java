package com.alejandro.DAO;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class ConfigXml {

    public HashMap<String, String> getConfiguracionbd() {
        HashMap<String, String> hm = null;
        try {
            FileInputStream fis = new FileInputStream("config/configDB.xml");
           //convierte un valor almacenado como una cadena XML
            XMLDecoder decoder = new XMLDecoder(fis);
            
            //hashmap es la implementación de la interface Map,
            //esta interface es un tipo de Collection que almacena datos asociando una llave a un valor
            hm = (HashMap<String, String>) decoder.readObject();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
        return hm;
    }

}
