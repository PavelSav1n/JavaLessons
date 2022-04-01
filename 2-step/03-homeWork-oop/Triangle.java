package ru.itsjava.oop;

//Класс Треугольник
public class Triangle extends Figure {
    // Поля

    // Конструктор
    public Triangle() {
        System.out.println("Пустой конструктор треугольника");
    }

    public Triangle(int sideA, int sideB, int sideC) {
        super(sideA, sideB, sideC);

    }

    // Методы
    // Вернуть значение площади треугольника
    @Override
    public double getArea() {
        if (getSideA() <= 0 || getSideB() <= 0 || getSideC() <= 0) {
            System.out.print("Стороны треугольника должны быть больше 0! ");
            return 0;
        }
        // Используем формулу Герона для рассчёта площади
        int halfPerimeter = (getSideA() + getSideB() + getSideC()) / 2;
        double triangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - getSideA()) * (halfPerimeter - getSideB()) * (halfPerimeter - getSideC()));
        // Если сумма двух сторон меньше либо равна третьей, то этот треугольник невозможно построить в евклидовой геометрии
        if (triangleArea <= 0 || Double.isNaN(triangleArea)) {
            System.out.print("Проверьте корректность длины сторон треугольника: ");
            return 0;
        }
        return triangleArea;

    }

}
