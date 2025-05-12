package com.marcos.springcloud.mscv.items.models;

import java.time.LocalDate;

public class Product {

    
    private Long id;
    private String name;
    private Double price;
    private LocalDate crateAt;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public LocalDate getCrateAt() {
        return crateAt;
    }
    public void setCrateAt(LocalDate crateAt) {
        this.crateAt = crateAt;
    }

}
