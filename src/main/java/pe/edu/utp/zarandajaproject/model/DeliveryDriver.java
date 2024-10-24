package pe.edu.utp.zarandajaproject.model;

public class DeliveryDriver {
    private int id;
    private String name;
    private String phone;
    private String transport;

    public DeliveryDriver() {}

    public DeliveryDriver(int id, String name, String phone, String transport) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.transport = transport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }
}
