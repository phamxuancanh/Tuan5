package org.example.composite;

class Product extends CoffeeShopComponent {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double calculateRevenue() {
        return this.price;
    }
}