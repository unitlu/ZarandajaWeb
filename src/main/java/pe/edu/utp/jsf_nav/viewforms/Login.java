package pe.edu.utp.jsf_nav.viewforms;

import pe.edu.utp.jsf_nav.service.Auth;
import pe.edu.utp.jsf_nav.util.LogFile;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.naming.NamingException;
import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;

// IMPORTANTE: import javax.faces.bean.ManagedBean;
@ManagedBean
@RequestScoped
public class Login implements Serializable {
    private String email;
    private String password;

    public Login() {
        email = "";
        password = "";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String checkCredentials() throws SQLException,
            NamingException, IOException {
		// -- Colocar aqui el codigo para revisar credenciales --
		if(Auth.isValidUser(email,password)){
            FacesContext facesContext = FacesContext.getCurrentInstance();
            ExternalContext externalContext = facesContext.getExternalContext();
            externalContext.getSessionMap().put("sessionId", email);
            return "dashboard.xthml?faces-redirect=true";
        }else {
            return "login_error.xthml?faces-redirect=true";
        }
    }

    public String checkUserAndPassword() throws SQLException,
            NamingException, IOException {
        // -- Colocar aqui el codigo para revisar credenciales --
		if (Auth.isValidUser(email, password)) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            ExternalContext externalContext = facesContext.getExternalContext();
            externalContext.getSessionMap().put("sessionId", email);
            return "success";
        }else {
            return "failure";
        }

    }

}
