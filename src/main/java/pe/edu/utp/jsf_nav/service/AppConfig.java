package pe.edu.utp.jsf_nav.service;

import java.util.ResourceBundle;

public class AppConfig {
    static ResourceBundle rb = ResourceBundle.getBundle("app");
    public static String getDatasource(){
        return rb.getString("datasource");
    }

    public static String getErrorLogFile(){
        return rb.getString("errorLog");
    }
}
