package ru.itsjava.oop;

// Класс Треугольник
public class Rectangle extends Figure {
    // Поля

    // Конструктор
    public Rectangle() {

    }

    public Rectangle(int sideA, int sideB) {
        super(sideA, sideB);
    }

    // Методы
    // Вернуть значение площади прямоугольника
    @Override
    public double getArea() {
        if (getSideA() <= 0 || getSideB() <= 0) {
            System.out.print("Проверьте корректность длины сторон квадрата: ");
            return 0;
        }
        return getSideA() * getSideB();
    }
}
