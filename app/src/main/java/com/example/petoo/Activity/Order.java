package com.example.petoo.Activity;

public class Order {
    private int id;
    private String productname, quantity,price, discount, rid;

    public Order(){ }

    public Order(int id, String productname, String quantity, String price, String discount, String rid) {
        this.id = id;
        this.rid = rid;
        this.productname = productname;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
