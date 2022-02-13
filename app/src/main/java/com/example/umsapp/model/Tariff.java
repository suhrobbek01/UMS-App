package com.example.umsapp.model;

import java.io.Serializable;

public class Tariff implements Serializable {
    private String name;
    private String code;
    private String data;

    public Tariff(String name, String code, String data) {
        this.name = name;
        this.code = code;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
