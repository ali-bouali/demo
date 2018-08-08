package com.demo.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Product implements Serializable {


    @Id
    @GeneratedValue
    private Long idProduct;

    private String name;
    private String description;
    private Double price;
    private Boolean availability;
    private String state;

    @OneToOne(mappedBy = "product")
    private Ad ad;

    @OneToMany(mappedBy = "product")
    private Photo productPhoto;

    public Product(String name, String description, Double price, Boolean availability, String state) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.availability = availability;
        this.state = state;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
