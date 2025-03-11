package org.example.composite;

public class Main {
    public static void main(String[] args) {
        // Tạo các sản phẩm
        Product coffee = new Product("Cà phê", 30.0);
        Product tea = new Product("Trà", 20.0);

        // Tạo bàn 1 và thêm sản phẩm vào bàn 1
        Table table1 = new Table();
        table1.addProduct(coffee);
        table1.addProduct(tea);

        // Tạo bàn 2 và thêm sản phẩm vào bàn 2
        Table table2 = new Table();
        table2.addProduct(coffee);

        // Tạo quán cà phê và thêm bàn vào quán
        CoffeeShop coffeeShop = new CoffeeShop();
        coffeeShop.addTable(table1);
        coffeeShop.addTable(table2);

        // Tính doanh thu của quán cà phê
        System.out.println("Doanh thu của quán cà phê: " + coffeeShop.calculateRevenue() + " VND");
    }
}
