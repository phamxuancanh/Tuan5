package org.example.composite;

import java.util.ArrayList;
import java.util.List;

class Table extends CoffeeShopComponent {
    private List<CoffeeShopComponent> products;

    public Table() {
        products = new ArrayList<>();
    }

    public void addProduct(CoffeeShopComponent product) {
        products.add(product);
    }

    @Override
    public double calculateRevenue() {
        double totalRevenue = 0;
        for (CoffeeShopComponent product : products) {
            totalRevenue += product.calculateRevenue();
        }
        return totalRevenue;
    }
}