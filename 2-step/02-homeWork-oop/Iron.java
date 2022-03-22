package ru.itsjava.oop;

public class Iron {

    // Поля
    private String name;
    private int watt;
    private double price;

    // Конструктор
    public Iron() {

    }

    public Iron(String name, int watt, double price) {
        this.name = name;
        this.watt = watt;
        this.price = price;
    }

    // Методы
    public void setName(String name) {
        this.name = name;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getWatt() {
        return watt;
    }

    public double getPrice() {
        return price;
    }
}
