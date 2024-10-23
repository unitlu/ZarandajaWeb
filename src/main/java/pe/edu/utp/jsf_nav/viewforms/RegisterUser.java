package pe.edu.utp.jsf_nav.viewforms;

import org.apache.commons.lang3.StringEscapeUtils;
import pe.edu.utp.jsf_nav.business.UserMgmt;
import pe.edu.utp.jsf_nav.exceptions.UserAlreadyExists;
import pe.edu.utp.jsf_nav.util.LogFile;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.IOException;
import java.io.Serializable;

// IMPORTANTE: import javax.faces.bean.ManagedBean;
@ManagedBean
@RequestScoped
public class RegisterUser implements Serializable {
    private String login;
    private String fullName;
    private String email;
    private String password;

    public RegisterUser() {
        // Inicializar los datos del constructor
    }

    // Crear constructor completo

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String newUser() throws IOException {
        try {
            UserMgmt.newUser(this);
			// Retornar la página register_ok con redireccion a true
            return "pendiente_codificar";
        } catch (IOException | IllegalStateException e) {
            // Guardar mensaje de error en LogFile
            // Devolver el outcome: register_error.xhtml?faces-redirect=true&error=detalle_del_error
            return "pendiente_codificar";
        }
    }
}
