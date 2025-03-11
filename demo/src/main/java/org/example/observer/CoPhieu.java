package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class CoPhieu implements Publisher{
    private List<Observer> observers = new ArrayList<>();
    private double price;
    public void setPrice(double price){
        this.price = price;
        notifyObserver();
    }
    public double getPrice(){
        return price;
    }
    @Override
    public void attach(Observer observer) {
        System.out.println("dang ky" + observer.toString());
    }

    @Override
    public void detach(Observer observer) {
        System.out.println("bo dang ky" + observer.toString());

    }

    @Override
    public void notifyObserver() {
        System.out.println("canh");

    }
}
