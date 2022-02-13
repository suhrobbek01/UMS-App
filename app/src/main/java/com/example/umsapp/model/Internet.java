package com.example.umsapp.model;

import java.io.Serializable;

public class Internet implements Serializable {
    private String count;
    private String price;
    private String code;

    public Internet(String count, String price, String code) {
        this.count = count;
        this.price = price;
        this.code = code;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Internet{" +
                "count='" + count + '\'' +
                ", price='" + price + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}