package model;

import service.Flying;

public class Duck extends Animal implements Flying {

    public Duck() {}

    public Duck(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void fly() {
        System.out.println("Я лечу");
    }

    @Override
    public void say() {
        System.out.println("Кря");
    }
}
