package com.isoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection con=null;

    public static Connection getConnection(){
        if (con==null){
            try {
                Class.forName(PropertiesUtil.getValue("driver"));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                con= DriverManager.getConnection(PropertiesUtil.getValue("url"),"root","990118");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        return con;
    }
}
