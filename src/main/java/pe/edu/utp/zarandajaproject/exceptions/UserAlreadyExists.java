package pe.edu.utp.zarandajaproject.exceptions;

public class UserAlreadyExists extends RuntimeException {

    public UserAlreadyExists(String message) {
        super(message);
    }

}
