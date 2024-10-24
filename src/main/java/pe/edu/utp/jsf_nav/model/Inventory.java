package pe.edu.utp.jsf_nav.model;

public class Inventory {
    private int id;
    private String name;
    private float amount;
    private float priceUnit;
    private String unitMeasure;
    private Restaurant restaurant;

    public Inventory() {}

    public Inventory(int inventoryId, String name, float amount, float priceUnit, String unitMeasure, Restaurant restaurant) {
        this.id = inventoryId;
        this.name = name;
        this.amount = amount;
        this.priceUnit = priceUnit;
        this.unitMeasure = unitMeasure;
        this.restaurant = restaurant;
    }

    public int getId() {
        return id;
    }

    public void setId(int inventoryId) {
        this.id = inventoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(float priceUnit) {
        this.priceUnit = priceUnit;
    }

    public String getUnitMeasure() {
        return unitMeasure;
    }

    public void setUnitMeasure(String unitMeasure) {
        this.unitMeasure = unitMeasure;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
