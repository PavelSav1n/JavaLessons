package ru.itsjava.oop;

public class Figure {

    // Поля
    private int sideA;
    private int sideB;
    private int sideC;

    //Конструктор
    public Figure() {
//        System.out.println("Пустой конструктор фигуры");

    }

    // Конструктор для квадрата
    public Figure(int sideA) {
        this.sideA = sideA;
    }

    // Конструктор для прямоугольника
    public Figure(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    // Конструктор для треугольника
    public Figure(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    //Методы
    // Пример метода getPerimeter определён только в суперклассе Figure
    public int getPerimeter() {


        if (sideA > 0 && sideB > 0 && sideC > 0) {
            return sideA + sideB + sideC;
        }
        if (sideA > 0 && sideB > 0 && sideC == 0) {
            return sideA * 2 + sideB * 2;
        }
        if (sideA > 0 && sideB == 0 && sideC == 0) {
            return sideA * 4;
        }
        System.out.print("Стороны фигуры не могут быть отрицательными или равны 0: ");
        return 0;


    }


    // Методы для получения приватных аргументов суперкласса без возможности их изменения
    // Типа инкапсуляция
    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }


    public double getArea() {
        System.out.println("Площадь внутри суперкласса Figure");
        return 0;
    }

}
