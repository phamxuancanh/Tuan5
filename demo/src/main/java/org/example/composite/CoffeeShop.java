package org.example.composite;

import java.util.ArrayList;
import java.util.List;

class CoffeeShop extends CoffeeShopComponent {
    private List<CoffeeShopComponent> tables;

    public CoffeeShop() {
        tables = new ArrayList<>();
    }

    public void addTable(CoffeeShopComponent table) {
        tables.add(table);
    }

    @Override
    public double calculateRevenue() {
        double totalRevenue = 0;
        for (CoffeeShopComponent table : tables) {
            totalRevenue += table.calculateRevenue();
        }
        return totalRevenue;
    }
}