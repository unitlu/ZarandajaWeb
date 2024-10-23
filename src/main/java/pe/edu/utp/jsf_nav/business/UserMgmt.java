package pe.edu.utp.jsf_nav.business;

import pe.edu.utp.jsf_nav.exceptions.UserAlreadyExists;
import pe.edu.utp.jsf_nav.viewforms.RegisterUser;
import pe.edu.utp.jsf_nav.service.AppConfig;
import pe.edu.utp.jsf_nav.service.Auth;
import pe.edu.utp.jsf_nav.util.DataAccessMariaDB;
import pe.edu.utp.jsf_nav.util.LogFile;

import java.io.IOException;
import java.sql.Connection;

public class UserMgmt {


//    public static void newUser(RegisterUser user) throws IOException {
//        // #CALL pr_AddUser('fids','Fernando','fids@gmail.com','e10adc3949ba59abbe56e057f20f883e');
//        String strSQL = String.format("CALL pr_AddUser('%s','%s','%s','%s') -- pwd = %s",
//                user.getLogin(), user.getFullName(), user.getEmail(), Auth.md5( user.getPassword() ), user.getPassword()
//        );
//        LogFile.info(strSQL);
//        // try-with-resource
//        try ( Connection cnn = DataAccessMariaDB.getConnection(DataAccessMariaDB.TipoDA.DATASOURCE, AppConfig.getDatasource()) ) {
//            int ne = cnn.createStatement().executeUpdate(strSQL);
//            cnn.close();
//        }catch (Exception e){
//            String msg = String.format( "Ocurrio una excepcion en %s: %s", strSQL, e.getMessage());
//            LogFile.error(msg);
//            throw new IllegalStateException(msg);
//        }
//    }

    // Version 2
    public static void newUser(RegisterUser user) throws IOException {
        // #CALL pr_AddUser('fids','Fernando','fids@gmail.com','e10adc3949ba59abbe56e057f20f883e');
        String strSQL = String.format("CALL pr_AddUser('%s','%s','%s','%s') -- pwd = %s",
                user.getLogin(), user.getFullName(), user.getEmail(), Auth.md5( user.getPassword() ), user.getPassword()
        );
        LogFile.info(strSQL);
        // try-with-resource
        try ( Connection cnn = DataAccessMariaDB.getConnection(DataAccessMariaDB.TipoDA.DATASOURCE, AppConfig.getDatasource()) ) {
            int ne = cnn.createStatement().executeUpdate(strSQL);
            cnn.close();
        }catch (Exception e){
            String msg = String.format( "Ocurrio una excepcion en %s: %s", strSQL, e.getMessage());
            LogFile.error(msg);

            // Usanso excepciones propias
            // Revisar si se envia una excepcion propia
            if ( e.getMessage().contains("Duplicate entry") ) {
                throw new UserAlreadyExists(user.getLogin());
            }else {
                throw new IllegalStateException(msg);
            }

        }
    }

}
