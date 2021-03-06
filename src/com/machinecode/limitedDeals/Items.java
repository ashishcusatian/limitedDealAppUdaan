package com.machinecode.limitedDeals;

public class Items {
    int id;
    String name;
    double price;

    public Items(String name, double price) {
        this.name = name;
        this.price = price;
        this.id = IdGenerator.generatorId();
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
