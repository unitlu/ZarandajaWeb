package pe.edu.utp.zarandajaproject.model;

public class Cook {
    private int id;
    private String name;
    private String email;

    public Cook() {}

    public Cook(int cookId, String name, String email) {
        this.id = cookId;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int cookId) {
        this.id = cookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
