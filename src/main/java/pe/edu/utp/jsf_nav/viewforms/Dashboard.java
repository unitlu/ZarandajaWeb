package pe.edu.utp.jsf_nav.viewforms;

import pe.edu.utp.jsf_nav.util.LogFile;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.io.Serializable;

// IMPORTANTE: import javax.faces.bean.ManagedBean;
@ManagedBean
@RequestScoped
public class Dashboard implements Serializable {
    private String sessionId;

    public Dashboard() throws IOException {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        sessionId = (String) externalContext.getSessionMap().get("sessionId");

        // Si no se recibio el sessionId se redirije a index.xhtml
        // -- Colocar codigo aqui --

        FacesContext facesContext1 = FacesContext.getCurrentInstance();
        ExternalContext externalContext1 = facesContext1.getExternalContext();
        sessionId = (String) externalContext1.getSessionMap().get("sessionId");

        if (sessionId == null) {
            LogFile.info("dashboard sin sesssion id");
            externalContext.redirect(externalContext1.getRequestContextPath() + "/index.xhtml");
        }
    }

    public String getSessionId() {
        return sessionId;
    }

    public String logout(){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        externalContext.getSessionMap().remove("sessionId");
        return "index.xhtml?faces-redirect=true";
    }

}
