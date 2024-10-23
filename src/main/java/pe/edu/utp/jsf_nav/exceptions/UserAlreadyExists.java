package pe.edu.utp.jsf_nav.exceptions;

public class UserAlreadyExists extends RuntimeException {

    public UserAlreadyExists(String message) {
        super(message);
    }

}
