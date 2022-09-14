package com.example.petoo.Activity;

import java.util.Map;

public class PlaceOrder {
    String address, location, name
            , phone, resid, resname
            , status
            , totalprice, userid, payment, did;
    Map<String, Pack>food;

    long timestamp;

    public PlaceOrder(){

    }

    public PlaceOrder(String address, String location, String name, String phone, String resid, String resname, String status, long timestamp
            , String totalprice, String userid, Map<String, Pack> food, String payment, String did) {
        this.address = address;
        this.location = location;
        this.name = name;
        this.phone = phone;
        this.resid = resid;
        this.resname = resname;
        this.status = status;
        this.payment = payment;
        this.timestamp = timestamp;
        this.totalprice = totalprice;
        this.userid = userid;
        this.food = food;
        this.did = did;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public String getResid() {
        return resid;
    }

    public void setResid(String resid) {
        this.resid = resid;
    }

    public String getResname() {
        return resname;
    }

    public void setResname(String resname) {
        this.resname = resname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Map<String, Pack> getfood() {
        return food;
    }

    public void setfood(Map<String, Pack> food) {
        this.food = food;
    }

    public static class Pack implements java.io.Serializable{
        String discount, name, price, quantity;

        public Pack(){

        }

        public Pack(String discount, String name, String price, String quantity) {
            this.discount = discount;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getDiscount() {
            return discount;
        }

        public void setDiscount(String discount) {
            this.discount = discount;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }
    }

}
