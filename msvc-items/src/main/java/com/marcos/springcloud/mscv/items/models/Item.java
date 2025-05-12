package com.marcos.springcloud.mscv.items.models;

public class Item {

    private Product product;
    private int quantity;
    public Item(Product product2, int i) {
        this.product = product2;
        this.quantity = i;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Double getTotal(){
        return product.getPrice() * quantity;
    }
}
