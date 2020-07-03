package com.isoft.util;
import java.util.ResourceBundle;
public class PropertiesUtil {
    public static String getValue(String key){
        String val="";
        try{
            ResourceBundle res=ResourceBundle.getBundle("db");
            val=res.getString(key);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        return val;
    }
}
