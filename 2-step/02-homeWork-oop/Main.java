package ru.itsjava.oop;

import javax.crypto.spec.PSource;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {


        //Объект:
        //тип ссылки   имя   присвоить   выделяем память   и вызываем конструктор
        //    Lion    simba   =                 new               Lion();

        Lion simba = new Lion();

        String name = "Нала";
        String surname = "Симбовна";

        Lion nala = new Lion(name, surname);

        Lion mufasa = new Lion("Муфаса", "Грозный Рык");
        Lion scar = new Lion("Шрам", "Трусливая Шкура");


        simba.sayR();
        nala.sayR();
        mufasa.sayR();
        scar.sayR();
        System.out.println();


        Scanner console = new Scanner(System.in);

        String inputName = "Pavel";
        int inputAge = 34;
        System.out.println();

        Man pavel = new Man(inputName, inputAge);

        pavel.sayHello();
        System.out.println();

        // set & get methods of Man's class
        System.out.print("setName() method -- Введите имя: ");
        inputName = console.next();
        pavel.setName(inputName);
        System.out.print("setAge() method -- Введите возраст: ");
        inputAge = console.nextInt();
        pavel.setAge(inputAge);
        System.out.println();
        System.out.println("pavel.getName() = " + pavel.getName());
        pavel.sayHello();
        System.out.println();


        // Iron Class
        System.out.println("Iron Class Practice:");
        Iron iron0 = new Iron();
        Iron iron1 = new Iron("Rowenta DW2459", 1000, 2000.00);
        Iron iron2 = new Iron("Panasonic NI-WL600", 600, 1500.00);


        System.out.println("iron0 = " + iron0.getName() + " Power: " + iron0.getWatt() + "W with a price only $" + iron0.getPrice());
        System.out.println("iron1 = " + iron1.getName() + " Power: " + iron1.getWatt() + " W with a price only $" + iron1.getPrice());
        System.out.println("iron2 = " + iron2.getName() + " Power: " + iron2.getWatt() + " W with a price only $" + iron2.getPrice());


        iron0.setName("BLACK+DECKER D3030");
        iron0.setWatt(2000);
        iron0.setPrice(3599.99);

        System.out.println("After setParams:");
        System.out.println("iron0 = " + iron0.getName() + " Power: " + iron0.getWatt() + "W with a price only " + iron0.getPrice() + "$");

        // Custom Class -- Computer
        System.out.println("Custom Class Practise -- Computer");
        Computer officeComputer = new Computer("DELL", "Desktop", 10000);
        Computer designerLaptop = new Computer("Apple Mac", "Laptop", 11000);
        Computer homeComputer = new Computer();

        System.out.println();
        System.out.println("officeComputer:");
        officeComputer.about();
        System.out.println("designerLaptop:");
        designerLaptop.about();
        System.out.println("homeComputer:");
        homeComputer.about();

        homeComputer.setName("Sony");
        homeComputer.setType("Desktop");
        homeComputer.setPrice(5000);

        System.out.println("After set method:");
        System.out.println("homeComputer name:  " + homeComputer.getName() + "\nType: " + homeComputer.getType() + "\nPrice: $" + homeComputer.getPrice());

    }


}
