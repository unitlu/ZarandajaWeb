package pe.edu.utp.jsf_nav.model;

public class Manager {
    private int id;
    private String name;
    private String email;
    private String phone;

    public Manager() {}

    public Manager(int adminId, String name, String email, String phone) {
        this.id = adminId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int adminId) {
        this.id = adminId;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}