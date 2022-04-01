package ru.itsjava.oop;

// Класс Квадрат
public class Square extends Figure {
    // Поля

    // Конструктор
    public Square() {

    }

    public Square(int sideA) {
        super(sideA);
    }

    // Методы
    // Вернуть значение площади квадрата
    @Override
    public double getArea() {
        if (getSideA() <= 0) {
            System.out.print("Проверьте корректность длины сторон квадрата: ");
            return 0;
        }
        return getSideA() * getSideA();
    }
}
