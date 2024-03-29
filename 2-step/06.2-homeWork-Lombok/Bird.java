package ru.itsjava.homeWork6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Bird {

    // Поля
    private final String type;
    private final String gender;
    private boolean isDomestic;
    private int age;

    //Конструктор
    //Заполняется через плагин Lombok


    // Методы
    // геттеры, сеттеры, equals(), hasCode() добавляются через плагин Lombok

    public void printInfo() {
        System.out.print("Type:" + type + " | Gender:" + gender + " | ");
        if (isDomestic) {
            System.out.print("Domestic");
        } else {
            System.out.print("Wild");
        }
        System.out.print(" | Age:" + age);
        System.out.println();
    }

    public void squawk() {
        System.out.println(type + " *squawking*");
    }

}
