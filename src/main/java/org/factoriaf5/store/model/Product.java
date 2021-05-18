package org.factoriaf5.store.model;

public class Product {
    private final String name;
    private final double price;

public Product(String name, double price) {
    this.name = name;
    this.price = price;
}
public String getName() {
    return name;
}
public double getPrice() {
    return price;
}
}
