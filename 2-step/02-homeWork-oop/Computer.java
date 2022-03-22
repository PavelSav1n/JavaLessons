package ru.itsjava.oop;

public class Computer {

    // Поля
    private String name;
    private String type;
    private double price;


    // Конструктор

    public Computer() {
    }

    public Computer(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;

    }

    // Методы
    public void about() {
        System.out.println("Name:" + name + "\nType: " + type + "\nPrice: $" + price);
        System.out.println();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
