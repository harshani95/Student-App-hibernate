package entity;

import javax.persistence.Entity;

@Entity
public class Laptop {
    private long code;
    private String brand;

    public Laptop() {
    }

    public Laptop(long code, String brand) {
        this.code = code;
        this.brand = brand;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
